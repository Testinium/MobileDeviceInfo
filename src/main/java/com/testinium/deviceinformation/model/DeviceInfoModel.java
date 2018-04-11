package com.testinium.deviceinformation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeviceInfoModel<T extends Device> {

    @SerializedName(value = "device", alternate = {"ios", "android"})
    @Expose
    private List<T> devices;

    public List<T> getDevices() {
        return devices;
    }

    public void setDevices(List<T> devices) {
        this.devices = devices;
    }
}
