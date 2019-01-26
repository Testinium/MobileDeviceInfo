package com.testinium.deviceinformation;

import com.testinium.deviceinformation.device.DeviceFinderFactory;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.device.DeviceFinder;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Android;
import com.testinium.deviceinformation.model.Device;
import com.testinium.deviceinformation.model.Ios;
import com.testinium.deviceinformation.model.IosSimulator;
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

        if (deviceType == DeviceType.IOSSIMULATOR && !isOperationSystemMacOs()) {
            throw new UnsupportedOperationException("Operation System Is Not Valid! Ios Simulator device info only run macos operation system.");
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

    @Override
    public List<Android> getAndroidDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getAndroidDevices();
    }

    @Override
    public List<Ios> getIosDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getIosDevices();
    }

    @Override
    public List<IosSimulator> getIosSimulatorDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getIosSimulatorDevices();
    }

}
