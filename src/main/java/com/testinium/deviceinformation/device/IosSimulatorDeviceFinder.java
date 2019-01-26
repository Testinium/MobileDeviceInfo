package com.testinium.deviceinformation.device;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.helper.JsonHelper;
import com.testinium.deviceinformation.helper.ProcessHelper;
import com.testinium.deviceinformation.model.DeviceInfoModel;
import com.testinium.deviceinformation.model.IosSimulator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IosSimulatorDeviceFinder implements DeviceFinder<IosSimulator> {

    private final String XCRUN_SIMCTL_SIMULATOR_INFORMATION_DEVICE_LIST_JSON = "xcrun simctl list devices --json devices";
    private final String XCRUN_XCDEVICE_SIMULATOR_INFORMATION_DEVICE_LIST_JSON = "xcrun xcdevice list";

    @Override
    public DeviceInfoModel<IosSimulator> findDevices(String localPath) throws IOException {
        DeviceInfoModel<IosSimulator> deviceInfoModel = JsonHelper.convertJsonToDeviceInfo(readDeviceInfo(localPath), new TypeToken<DeviceInfoModel<IosSimulator>>() {});
        if (deviceInfoModel == null || (deviceInfoModel.getDevices() == null || deviceInfoModel.getDevices().size() == 0)) {
            try {
                throw new DeviceNotFoundException("Ios Simulator Device Not Found !!!");
            }catch (DeviceNotFoundException e){
                System.err.println(e.toString());
            }
        }
        return deviceInfoModel;
    }

    @Override
    public Map<String, Object> readDeviceInfo(String localPath) throws IOException {
        Map<String, Object> parentMap;
        List<Map<String, Object>> deviceMapList = new ArrayList<>();
        Map<String, Object> device = new HashMap<>();

        Process simctlProcess = ProcessHelper.runTimeExec(String.format("%s%s", localPath, XCRUN_SIMCTL_SIMULATOR_INFORMATION_DEVICE_LIST_JSON));
        BufferedReader simctlReader = new BufferedReader(new InputStreamReader(simctlProcess.getInputStream()));

        StringBuilder deviceListStringBuilder = new StringBuilder();
        simctlReader.lines().map(String::trim).forEach(deviceListStringBuilder::append);

        Process xcdeviceProcess = ProcessHelper.runTimeExec(String.format("%s%s", localPath, XCRUN_XCDEVICE_SIMULATOR_INFORMATION_DEVICE_LIST_JSON));
        BufferedReader xcdeviceReader = new BufferedReader(new InputStreamReader(xcdeviceProcess.getInputStream()));

        StringBuilder deviceDetailInfoStringBuilder = new StringBuilder();
        xcdeviceReader.lines().map(String::trim).forEach(deviceDetailInfoStringBuilder::append);

        JsonObject devicesListJson = new Gson().fromJson(String.valueOf(deviceListStringBuilder), JsonObject.class).getAsJsonObject("devices");
        JsonArray devicesDetailInfoJson = new Gson().fromJson(String.valueOf(deviceDetailInfoStringBuilder), JsonArray.class);

        for (String currentDynamicKey : devicesListJson.keySet()) {
            JsonElement currentDynamicValue = devicesListJson.get(currentDynamicKey);
            for (JsonElement inCurrentValue : ((JsonArray) currentDynamicValue)) {
                parentMap = new HashMap<>();
                JsonObject currentKey = (JsonObject) inCurrentValue;
                if (currentKey.get("state").toString().contains("Booted")) {
                    for (String setKey : currentKey.keySet()) {
                        parentMap.put(setKey,currentKey.get(setKey).toString().replaceAll("\"",""));
                    }
                    for (JsonElement currentElement : devicesDetailInfoJson) {
                        JsonObject currentElementValue = (JsonObject) currentElement;
                        if (currentElementValue.get("identifier").toString().contains(currentKey.get("udid").toString())) {
                            Map<String,String> operatingSystemVersion = new HashMap<>();
                            for (String key: currentElementValue.keySet()) {
                                if (key.contains("operatingSystemVersion")){
                                    String[] strArray = currentElementValue.get(key).toString()
                                        .replaceAll("\\(","")
                                        .replaceAll("\\)","")
                                        .replaceAll("\"","")
                                        .split(" ");
                                    operatingSystemVersion.put("productVersion",strArray[0]);
                                    operatingSystemVersion.put("buildVersion",strArray[1]);
                                    parentMap.putAll(operatingSystemVersion);
                                }
                                parentMap.put(key,currentElementValue.get(key).toString().replaceAll("\"",""));
                            }
                        }
                    }
                    deviceMapList.add(parentMap);
                }
            }
        }

        device.put("iosSimulator", deviceMapList);
        simctlReader.close();
        xcdeviceReader.close();
        return device;
    }
}
