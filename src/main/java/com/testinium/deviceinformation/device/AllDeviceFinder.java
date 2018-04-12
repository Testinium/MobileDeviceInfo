package com.testinium.deviceinformation.device;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Android;
import com.testinium.deviceinformation.model.Device;
import com.testinium.deviceinformation.model.DeviceInfoModel;
import com.testinium.deviceinformation.model.Ios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllDeviceFinder implements DeviceFinder<Device> {
    @Override
    public DeviceInfoModel<Device> findDevices(String localPath) throws IOException, DeviceNotFoundException {
        DeviceInfoModel<Device> deviceDeviceInfoModel = new DeviceInfoModel<>();
        List<Device> devices = new ArrayList<>();

        List<Android> deviceAndroid = new AndroidDeviceFinder().findDevices(localPath).getDevices();
        List<Ios> deviceIos = new IosDeviceFinder().findDevices(localPath).getDevices();

        if (deviceAndroid != null)
            devices.addAll(deviceAndroid);
        if (deviceIos != null)
            devices.addAll(deviceIos);
        if(deviceAndroid == null && deviceIos == null){
            try {
                throw new DeviceNotFoundException("No device is plugged in !!!");
            }catch (DeviceNotFoundException e){
                System.err.println(e.toString());
            }
        }
        deviceDeviceInfoModel.setDevices(devices);
        return deviceDeviceInfoModel;
    }

    @Override
    public Map<String, Object> readDeviceInfo(String localPath) throws IOException {
        return null;
    }
}
