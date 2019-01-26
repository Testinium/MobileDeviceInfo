package com.testinium.deviceinformation.device;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.helper.JsonHelper;
import com.testinium.deviceinformation.helper.ProcessHelper;
import com.testinium.deviceinformation.model.DeviceInfoModel;
import com.testinium.deviceinformation.model.Ios;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IosDeviceFinder implements DeviceFinder<Ios> {

    private final String LIB_MOBILE_DEVICE_LIST_SHELL_COMMAND = "idevice_id -l";
    private final String LIB_MOBILE_DEVICE_UDID_PUT_SHELL_COMMAND = "ideviceinfo -u UniqueDeviceID";

    @Override
    public DeviceInfoModel<Ios> findDevices(String localPath) throws IOException {
        DeviceInfoModel<Ios> deviceInfoModel = JsonHelper.convertJsonToDeviceInfo(readDeviceInfo(localPath), new TypeToken<DeviceInfoModel<Ios>>() {});
        if (deviceInfoModel == null || (deviceInfoModel.getDevices() == null || deviceInfoModel.getDevices().size() == 0)) {
            try {
                throw new DeviceNotFoundException("Ios Device Not Found !!!");
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

        Process deviceListProcess = ProcessHelper.runTimeExec(String.format("%s%s", localPath, LIB_MOBILE_DEVICE_LIST_SHELL_COMMAND));
        BufferedReader reader = new BufferedReader(new InputStreamReader(deviceListProcess.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (StringUtils.isEmpty(line)) {
                continue;
            }
            String serialNumberArray = line.replace(" ", "");
            Process deviceDetailInfoProcess = ProcessHelper.runTimeExec(String.format("%s%s", localPath, LIB_MOBILE_DEVICE_UDID_PUT_SHELL_COMMAND).replace("UniqueDeviceID", serialNumberArray.trim()));

            String infoLine;
            BufferedReader infoReader = new BufferedReader(new InputStreamReader(deviceDetailInfoProcess.getInputStream()));
            parentMap = new HashMap<>();
            while ((infoLine = infoReader.readLine()) != null) {
                try {
                    infoLine = infoLine.replaceAll("\\[", "").replaceAll("]", "");
                    String[] detailInfo = infoLine.split(": ", -1);
                    parentMap.put(detailInfo[0].trim(), detailInfo[1].trim());
                }catch (Exception e){ }
            }
            infoReader.close();
            deviceMapList.add(parentMap);
            device.put("ios", deviceMapList);
        }
        reader.close();
        return device;
    }
}
