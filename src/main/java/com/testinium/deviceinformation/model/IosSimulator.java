package com.testinium.deviceinformation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IosSimulator implements Device {

  @SerializedName("buildVersion")
  @Expose
  private String buildVersion;
  @SerializedName("simulator")
  @Expose
  private String simulator;
  @SerializedName("available")
  @Expose
  private String available;
  @SerializedName("availability")
  @Expose
  private String availability;
  @SerializedName("platform")
  @Expose
  private String platform;
  @SerializedName("modelName")
  @Expose
  private String modelName;
  @SerializedName("productVersion")
  @Expose
  private String productVersion;
  @SerializedName("operatingSystemVersion")
  @Expose
  private String operatingSystemVersion;
  @SerializedName("modelCode")
  @Expose
  private String modelCode;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("state")
  @Expose
  private String state;
  @SerializedName("udid")
  @Expose
  private String udid;
  @SerializedName("architecture")
  @Expose
  private String architecture;
  @SerializedName("identifier")
  @Expose
  private String identifier;

  public String getSimulator() {
    return simulator;
  }

  public void setSimulator(String simulator) {
    this.simulator = simulator;
  }

  public String getAvailable() {
    return available;
  }

  public void setAvailable(String available) {
    this.available = available;
  }

  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }

  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }

  public String getModelCode() {
    return modelCode;
  }

  public void setModelCode(String modelCode) {
    this.modelCode = modelCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public String getUniqueDeviceID() {
    return udid;
  }

  @Override
  public String getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }

  @Override
  public String getBuildVersion() {
    return buildVersion;
  }

  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }

  @Override
  public String getSerialNumber() {
    return null;
  }

  @Override
  public String getModelNumber() {
    return modelCode;
  }

  @Override
  public String getDeviceProductName() {
    return "Ios Simulator";
  }
}
