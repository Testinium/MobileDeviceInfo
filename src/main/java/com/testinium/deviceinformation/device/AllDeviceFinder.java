package com.testinium.deviceinformation.device;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Device;
import com.testinium.deviceinformation.model.DeviceInfoModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllDeviceFinder implements DeviceFinder<Device> {
    @Override
    public DeviceInfoModel<Device> findDevices(String localPath) throws IOException, DeviceNotFoundException {
        DeviceInfoModel<Device> deviceDeviceInfoModel = new DeviceInfoModel<>();
        List<Device> devices = new ArrayList<>();
        devices.addAll(new AndroidDeviceFinder().findDevices(localPath).getDevices());
        devices.addAll(new IosDeviceFinder().findDevices(localPath).getDevices());
        deviceDeviceInfoModel.setDevices(devices);
        return deviceDeviceInfoModel;
    }

    @Override
    public Map<String, Object> readDeviceInfo(String localPath) throws IOException {
        return null;
    }
}
