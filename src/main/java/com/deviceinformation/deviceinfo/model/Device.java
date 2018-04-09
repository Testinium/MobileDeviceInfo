package com.deviceinformation.deviceinfo.model;

public interface Device {

    String getUniqueDeviceID();

    String getProductVersion();

    String getBuildVersion();

    String getSerialNumber();

    String getModelNumber();

    String getDeviceProductName();
}
