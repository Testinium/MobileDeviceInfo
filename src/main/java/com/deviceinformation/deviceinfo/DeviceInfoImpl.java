package com.deviceinformation.deviceinfo;

import com.deviceinformation.deviceinfo.device.DeviceFinder;
import com.deviceinformation.deviceinfo.device.DeviceFinderFactory;
import com.deviceinformation.deviceinfo.device.DeviceType;
import com.deviceinformation.deviceinfo.exception.DeviceNotFoundException;
import com.deviceinformation.deviceinfo.model.Device;
import org.apache.commons.exec.OS;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;

public class DeviceInfoImpl implements DeviceInfo {

    private DeviceFinder deviceFinder;

    public DeviceInfoImpl(DeviceType deviceType) throws UnsupportedOperationException {
        if (!StringUtils.isEmpty(System.getProperty("key"))) {
            throw new IllegalArgumentException(getClass().getSimpleName() + " - " + System.getProperty("key") + " - will not work if you have any key value.");
        }

        if (deviceType == DeviceType.IOS && !isOperationSystemMacOs()) {
            throw new UnsupportedOperationException("Operation System Is Not Valid! Ios device info only run macos operation system.");
        }

        deviceFinder = DeviceFinderFactory.createDeviceFinder(deviceType);
    }

    private boolean isOperationSystemMacOs() {
        return OS.isFamilyMac();
    }

    @Override
    public List<Device> getDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getDevices();
    }
}
