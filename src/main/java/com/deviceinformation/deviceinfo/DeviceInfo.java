package com.deviceinformation.deviceinfo;

import com.deviceinformation.deviceinfo.exception.DeviceNotFoundException;
import com.deviceinformation.deviceinfo.model.Device;

import java.io.IOException;
import java.util.List;

public interface DeviceInfo {

    default boolean anyDeviceConnected() throws IOException, DeviceNotFoundException {
        return getDevices().size() > 0;
    }

    default Device getFirstDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream().findFirst().orElse(null);
    }

    default Device getFirstAndroidDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream().filter(device -> device.getDeviceProductName().contains("Android")).findFirst().orElse(null);
    }

    default Device getFirstIosDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream().filter(device -> device.getDeviceProductName().contains("Ios")).findFirst().orElse(null);
    }

    default Device searchDeviceByName(String name) throws IOException, DeviceNotFoundException {
        return getDevices().stream().filter(device -> device.getDeviceProductName().equals(name)).findFirst().orElse(null);
    }

    List<Device> getDevices() throws IOException, DeviceNotFoundException;

}
