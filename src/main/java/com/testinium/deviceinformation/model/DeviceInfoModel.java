package com.testinium.deviceinformation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeviceInfoModel<T extends Device> {

    @SerializedName(value = "device", alternate = {"ios","iosSimulator", "android"})
    @Expose
    private List<T> devices;

    public List<T> getDevices() {
        return devices;
    }

    public List<Android> getAndroidDevices() { return (List<Android>) devices; }

    public List<Ios> getIosDevices() { return (List<Ios>) devices; }

    public List<IosSimulator> getIosSimulatorDevices() { return (List<IosSimulator>) devices; }

    public void setDevices(List<T> devices) {
        this.devices = devices;
    }
}
