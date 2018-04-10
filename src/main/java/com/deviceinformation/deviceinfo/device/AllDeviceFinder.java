package com.deviceinformation.deviceinfo.device;

import com.deviceinformation.deviceinfo.exception.DeviceNotFoundException;
import com.deviceinformation.deviceinfo.model.Android;
import com.deviceinformation.deviceinfo.model.Device;
import com.deviceinformation.deviceinfo.model.DeviceInfoModel;
import com.deviceinformation.deviceinfo.model.Ios;

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
        if(deviceAndroid == null && deviceIos == null)
            throw new DeviceNotFoundException("No device is plugged in.");

        deviceDeviceInfoModel.setDevices(devices);
        return deviceDeviceInfoModel;
    }

    @Override
    public Map<String, Object> readDeviceInfo(String localPath) throws IOException {
        return null;
    }
}
