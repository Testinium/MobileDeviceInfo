package com.testinium.deviceinformation.device;

public class DeviceFinderFactory {

    private DeviceFinderFactory() {

    }

    public static DeviceFinder createDeviceFinder(DeviceType deviceType) {
        DeviceFinder deviceFinder;
        if (deviceType == DeviceType.ANDROID) {
            deviceFinder = new AndroidDeviceFinder();
        } else if (deviceType == DeviceType.IOS) {
            deviceFinder = new IosDeviceFinder();
        } else if (deviceType == DeviceType.IOSSIMULATOR) {
            deviceFinder = new IosSimulatorDeviceFinder();
        } else if (deviceType == DeviceType.ALLANDIOSSIMULATOR) {
            deviceFinder = new AllDeviceFinder(deviceType);
        } else if (deviceType == DeviceType.ALL) {
            deviceFinder = new AllDeviceFinder();
        } else {
            throw new IllegalArgumentException("Device Type Not Found");
        }
        return deviceFinder;
    }

}
