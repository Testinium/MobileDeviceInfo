package com.deviceinformation.deviceinfo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ios implements Device {

    @SerializedName("0")
    @Expose
    private String _0;
    @SerializedName("BluetoothAddress")
    @Expose
    private String bluetoothAddress;
    @SerializedName("SBLockdownEverRegisteredKey")
    @Expose
    private String sBLockdownEverRegisteredKey;
    @SerializedName("WirelessBoardSerialNumber")
    @Expose
    private String wirelessBoardSerialNumber;
    @SerializedName("kCTPostponementInfoPRIVersion")
    @Expose
    private String kCTPostponementInfoPRIVersion;
    @SerializedName("ProductName")
    @Expose
    private String productName;
    @SerializedName("SupportedDeviceFamilies[1]")
    @Expose
    private String supportedDeviceFamilies1;
    @SerializedName("CarrierBundleInfoArray[1]")
    @Expose
    private String carrierBundleInfoArray1;
    @SerializedName("CFBundleVersion")
    @Expose
    private String cFBundleVersion;
    @SerializedName("MNC")
    @Expose
    private String mNC;
    @SerializedName("InternationalMobileSubscriberIdentity")
    @Expose
    private String internationalMobileSubscriberIdentity;
    @SerializedName("CFBundleIdentifier")
    @Expose
    private String cFBundleIdentifier;
    @SerializedName("MCC")
    @Expose
    private String mCC;
    @SerializedName("IntegratedCircuitCardIdentity")
    @Expose
    private String integratedCircuitCardIdentity;
    @SerializedName("SIMTrayStatus")
    @Expose
    private String sIMTrayStatus;
    @SerializedName("ProtocolVersion")
    @Expose
    private String protocolVersion;
    @SerializedName("MobileSubscriberCountryCode")
    @Expose
    private String mobileSubscriberCountryCode;
    @SerializedName("UseRaptorCerts")
    @Expose
    private String useRaptorCerts;
    @SerializedName("DieID")
    @Expose
    private String dieID;
    @SerializedName("BasebandCertId")
    @Expose
    private String basebandCertId;
    @SerializedName("kCTPostponementStatus")
    @Expose
    private String kCTPostponementStatus;
    @SerializedName("HostAttached")
    @Expose
    private String hostAttached;
    @SerializedName("PasswordProtected")
    @Expose
    private String passwordProtected;
    @SerializedName("InternationalMobileEquipmentIdentity")
    @Expose
    private String internationalMobileEquipmentIdentity;
    @SerializedName("ModelNumber")
    @Expose
    private String modelNumber;
    @SerializedName("HardwareModel")
    @Expose
    private String hardwareModel;
    @SerializedName("ActivationStateAcknowledged")
    @Expose
    private String activationStateAcknowledged;
    @SerializedName("ProductType")
    @Expose
    private String productType;
    @SerializedName("BasebandVersion")
    @Expose
    private String basebandVersion;
    @SerializedName("ChipSerialNo")
    @Expose
    private String chipSerialNo;
    @SerializedName("TimeIntervalSince1970")
    @Expose
    private String timeIntervalSince1970;
    @SerializedName("UniqueChipID")
    @Expose
    private String uniqueChipID;
    @SerializedName("PartitionType")
    @Expose
    private String partitionType;
    @SerializedName("FusingStatus")
    @Expose
    private String fusingStatus;
    @SerializedName("TelephonyCapability")
    @Expose
    private String telephonyCapability;
    @SerializedName("TimeZone")
    @Expose
    private String timeZone;
    @SerializedName("SerialNumber")
    @Expose
    private String serialNumber;
    @SerializedName("BasebandKeyHashInformation")
    @Expose
    private String basebandKeyHashInformation;
    @SerializedName("SKeyHash")
    @Expose
    private String sKeyHash;
    @SerializedName("SKeyStatus")
    @Expose
    private String sKeyStatus;
    @SerializedName("AKeyStatus")
    @Expose
    private String aKeyStatus;
    @SerializedName("BasebandSerialNumber")
    @Expose
    private String basebandSerialNumber;
    @SerializedName("ChipID")
    @Expose
    private String chipID;
    @SerializedName("HardwarePlatform")
    @Expose
    private String hardwarePlatform;
    @SerializedName("SoftwareBehavior")
    @Expose
    private String softwareBehavior;
    @SerializedName("HasSiDP")
    @Expose
    private String hasSiDP;
    @SerializedName("NonVolatileRAM")
    @Expose
    private String nonVolatileRAM;
    @SerializedName("obliteration")
    @Expose
    private String obliteration;
    @SerializedName("oblit-begins")
    @Expose
    private String oblitBegins;
    @SerializedName("backlight-level")
    @Expose
    private String backlightLevel;
    @SerializedName("com.apple.System.tz0-size")
    @Expose
    private String comAppleSystemTz0Size;
    @SerializedName("boot-args")
    @Expose
    private String bootArgs;
    @SerializedName("auto-boot")
    @Expose
    private String autoBoot;
    @SerializedName("PkHash")
    @Expose
    private String pkHash;
    @SerializedName("ProximitySensorCalibration")
    @Expose
    private String proximitySensorCalibration;
    @SerializedName("CertID")
    @Expose
    private String certID;
    @SerializedName("DeviceClass")
    @Expose
    private String deviceClass;
    @SerializedName("RegionInfo")
    @Expose
    private String regionInfo;
    @SerializedName("UniqueDeviceID")
    @Expose
    private String uniqueDeviceID;
    @SerializedName("ProductVersion")
    @Expose
    private String productVersion;
    @SerializedName("EthernetAddress")
    @Expose
    private String ethernetAddress;
    @SerializedName("kCTPostponementInfoServiceProvisioningState")
    @Expose
    private String kCTPostponementInfoServiceProvisioningState;
    @SerializedName("BoardId")
    @Expose
    private String boardId;
    @SerializedName("SIMStatus")
    @Expose
    private String sIMStatus;
    @SerializedName("ActivationState")
    @Expose
    private String activationState;
    @SerializedName("BuildVersion")
    @Expose
    private String buildVersion;
    @SerializedName("TrustedHostAttached")
    @Expose
    private String trustedHostAttached;
    @SerializedName("BrickState")
    @Expose
    private String brickState;
    @SerializedName("MobileSubscriberNetworkCode")
    @Expose
    private String mobileSubscriberNetworkCode;
    @SerializedName("TimeZoneOffsetFromUTC")
    @Expose
    private String timeZoneOffsetFromUTC;
    @SerializedName("WiFiAddress")
    @Expose
    private String wiFiAddress;
    @SerializedName("MLBSerialNumber")
    @Expose
    private String mLBSerialNumber;
    @SerializedName("Uses24HourClock")
    @Expose
    private String uses24HourClock;
    @SerializedName("DeviceColor")
    @Expose
    private String deviceColor;
    @SerializedName("BasebandRegionSKU")
    @Expose
    private String basebandRegionSKU;
    @SerializedName("SoftwareBundleVersion")
    @Expose
    private String softwareBundleVersion;
    @SerializedName("FirmwareVersion")
    @Expose
    private String firmwareVersion;
    @SerializedName("BasebandMasterKeyHash")
    @Expose
    private String basebandMasterKeyHash;
    @SerializedName("CPUArchitecture")
    @Expose
    private String cPUArchitecture;
    @SerializedName("BasebandStatus")
    @Expose
    private String basebandStatus;
    @SerializedName("BasebandActivationTicketVersion")
    @Expose
    private String basebandActivationTicketVersion;
    @SerializedName("BasebandChipID")
    @Expose
    private String basebandChipID;
    @SerializedName("DeviceName")
    @Expose
    private String deviceName;
    @SerializedName("ProductionSOC")
    @Expose
    private String productionSOC;

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }

    public String getBluetoothAddress() {
        return bluetoothAddress;
    }

    public void setBluetoothAddress(String bluetoothAddress) {
        this.bluetoothAddress = bluetoothAddress;
    }

    public String getSBLockdownEverRegisteredKey() {
        return sBLockdownEverRegisteredKey;
    }

    public void setSBLockdownEverRegisteredKey(String sBLockdownEverRegisteredKey) {
        this.sBLockdownEverRegisteredKey = sBLockdownEverRegisteredKey;
    }

    public String getWirelessBoardSerialNumber() {
        return wirelessBoardSerialNumber;
    }

    public void setWirelessBoardSerialNumber(String wirelessBoardSerialNumber) {
        this.wirelessBoardSerialNumber = wirelessBoardSerialNumber;
    }

    public String getKCTPostponementInfoPRIVersion() {
        return kCTPostponementInfoPRIVersion;
    }

    public void setKCTPostponementInfoPRIVersion(String kCTPostponementInfoPRIVersion) {
        this.kCTPostponementInfoPRIVersion = kCTPostponementInfoPRIVersion;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupportedDeviceFamilies1() {
        return supportedDeviceFamilies1;
    }

    public void setSupportedDeviceFamilies1(String supportedDeviceFamilies1) {
        this.supportedDeviceFamilies1 = supportedDeviceFamilies1;
    }

    public String getCarrierBundleInfoArray1() {
        return carrierBundleInfoArray1;
    }

    public void setCarrierBundleInfoArray1(String carrierBundleInfoArray1) {
        this.carrierBundleInfoArray1 = carrierBundleInfoArray1;
    }

    public String getCFBundleVersion() {
        return cFBundleVersion;
    }

    public void setCFBundleVersion(String cFBundleVersion) {
        this.cFBundleVersion = cFBundleVersion;
    }

    public String getMNC() {
        return mNC;
    }

    public void setMNC(String mNC) {
        this.mNC = mNC;
    }

    public String getInternationalMobileSubscriberIdentity() {
        return internationalMobileSubscriberIdentity;
    }

    public void setInternationalMobileSubscriberIdentity(
            String internationalMobileSubscriberIdentity) {
        this.internationalMobileSubscriberIdentity = internationalMobileSubscriberIdentity;
    }

    public String getCFBundleIdentifier() {
        return cFBundleIdentifier;
    }

    public void setCFBundleIdentifier(String cFBundleIdentifier) {
        this.cFBundleIdentifier = cFBundleIdentifier;
    }

    public String getMCC() {
        return mCC;
    }

    public void setMCC(String mCC) {
        this.mCC = mCC;
    }

    public String getIntegratedCircuitCardIdentity() {
        return integratedCircuitCardIdentity;
    }

    public void setIntegratedCircuitCardIdentity(String integratedCircuitCardIdentity) {
        this.integratedCircuitCardIdentity = integratedCircuitCardIdentity;
    }

    public String getSIMTrayStatus() {
        return sIMTrayStatus;
    }

    public void setSIMTrayStatus(String sIMTrayStatus) {
        this.sIMTrayStatus = sIMTrayStatus;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getMobileSubscriberCountryCode() {
        return mobileSubscriberCountryCode;
    }

    public void setMobileSubscriberCountryCode(String mobileSubscriberCountryCode) {
        this.mobileSubscriberCountryCode = mobileSubscriberCountryCode;
    }

    public String getUseRaptorCerts() {
        return useRaptorCerts;
    }

    public void setUseRaptorCerts(String useRaptorCerts) {
        this.useRaptorCerts = useRaptorCerts;
    }

    public String getDieID() {
        return dieID;
    }

    public void setDieID(String dieID) {
        this.dieID = dieID;
    }

    public String getBasebandCertId() {
        return basebandCertId;
    }

    public void setBasebandCertId(String basebandCertId) {
        this.basebandCertId = basebandCertId;
    }

    public String getKCTPostponementStatus() {
        return kCTPostponementStatus;
    }

    public void setKCTPostponementStatus(String kCTPostponementStatus) {
        this.kCTPostponementStatus = kCTPostponementStatus;
    }

    public String getHostAttached() {
        return hostAttached;
    }

    public void setHostAttached(String hostAttached) {
        this.hostAttached = hostAttached;
    }

    public String getPasswordProtected() {
        return passwordProtected;
    }

    public void setPasswordProtected(String passwordProtected) {
        this.passwordProtected = passwordProtected;
    }

    public String getInternationalMobileEquipmentIdentity() {
        return internationalMobileEquipmentIdentity;
    }

    public void setInternationalMobileEquipmentIdentity(String internationalMobileEquipmentIdentity) {
        this.internationalMobileEquipmentIdentity = internationalMobileEquipmentIdentity;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    @Override
    public String getDeviceProductName() {
        return getDeviceClass();
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
    }

    public String getActivationStateAcknowledged() {
        return activationStateAcknowledged;
    }

    public void setActivationStateAcknowledged(String activationStateAcknowledged) {
        this.activationStateAcknowledged = activationStateAcknowledged;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBasebandVersion() {
        return basebandVersion;
    }

    public void setBasebandVersion(String basebandVersion) {
        this.basebandVersion = basebandVersion;
    }

    public String getChipSerialNo() {
        return chipSerialNo;
    }

    public void setChipSerialNo(String chipSerialNo) {
        this.chipSerialNo = chipSerialNo;
    }

    public String getTimeIntervalSince1970() {
        return timeIntervalSince1970;
    }

    public void setTimeIntervalSince1970(String timeIntervalSince1970) {
        this.timeIntervalSince1970 = timeIntervalSince1970;
    }

    public String getUniqueChipID() {
        return uniqueChipID;
    }

    public void setUniqueChipID(String uniqueChipID) {
        this.uniqueChipID = uniqueChipID;
    }

    public String getPartitionType() {
        return partitionType;
    }

    public void setPartitionType(String partitionType) {
        this.partitionType = partitionType;
    }

    public String getFusingStatus() {
        return fusingStatus;
    }

    public void setFusingStatus(String fusingStatus) {
        this.fusingStatus = fusingStatus;
    }

    public String getTelephonyCapability() {
        return telephonyCapability;
    }

    public void setTelephonyCapability(String telephonyCapability) {
        this.telephonyCapability = telephonyCapability;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBasebandKeyHashInformation() {
        return basebandKeyHashInformation;
    }

    public void setBasebandKeyHashInformation(String basebandKeyHashInformation) {
        this.basebandKeyHashInformation = basebandKeyHashInformation;
    }

    public String getSKeyHash() {
        return sKeyHash;
    }

    public void setSKeyHash(String sKeyHash) {
        this.sKeyHash = sKeyHash;
    }

    public String getSKeyStatus() {
        return sKeyStatus;
    }

    public void setSKeyStatus(String sKeyStatus) {
        this.sKeyStatus = sKeyStatus;
    }

    public String getAKeyStatus() {
        return aKeyStatus;
    }

    public void setAKeyStatus(String aKeyStatus) {
        this.aKeyStatus = aKeyStatus;
    }

    public String getBasebandSerialNumber() {
        return basebandSerialNumber;
    }

    public void setBasebandSerialNumber(String basebandSerialNumber) {
        this.basebandSerialNumber = basebandSerialNumber;
    }

    public String getChipID() {
        return chipID;
    }

    public void setChipID(String chipID) {
        this.chipID = chipID;
    }

    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    public void setHardwarePlatform(String hardwarePlatform) {
        this.hardwarePlatform = hardwarePlatform;
    }

    public String getSoftwareBehavior() {
        return softwareBehavior;
    }

    public void setSoftwareBehavior(String softwareBehavior) {
        this.softwareBehavior = softwareBehavior;
    }

    public String getHasSiDP() {
        return hasSiDP;
    }

    public void setHasSiDP(String hasSiDP) {
        this.hasSiDP = hasSiDP;
    }

    public String getNonVolatileRAM() {
        return nonVolatileRAM;
    }

    public void setNonVolatileRAM(String nonVolatileRAM) {
        this.nonVolatileRAM = nonVolatileRAM;
    }

    public String getObliteration() {
        return obliteration;
    }

    public void setObliteration(String obliteration) {
        this.obliteration = obliteration;
    }

    public String getOblitBegins() {
        return oblitBegins;
    }

    public void setOblitBegins(String oblitBegins) {
        this.oblitBegins = oblitBegins;
    }

    public String getBacklightLevel() {
        return backlightLevel;
    }

    public void setBacklightLevel(String backlightLevel) {
        this.backlightLevel = backlightLevel;
    }

    public String getComAppleSystemTz0Size() {
        return comAppleSystemTz0Size;
    }

    public void setComAppleSystemTz0Size(String comAppleSystemTz0Size) {
        this.comAppleSystemTz0Size = comAppleSystemTz0Size;
    }

    public String getBootArgs() {
        return bootArgs;
    }

    public void setBootArgs(String bootArgs) {
        this.bootArgs = bootArgs;
    }

    public String getAutoBoot() {
        return autoBoot;
    }

    public void setAutoBoot(String autoBoot) {
        this.autoBoot = autoBoot;
    }

    public String getPkHash() {
        return pkHash;
    }

    public void setPkHash(String pkHash) {
        this.pkHash = pkHash;
    }

    public String getProximitySensorCalibration() {
        return proximitySensorCalibration;
    }

    public void setProximitySensorCalibration(String proximitySensorCalibration) {
        this.proximitySensorCalibration = proximitySensorCalibration;
    }

    public String getCertID() {
        return certID;
    }

    public void setCertID(String certID) {
        this.certID = certID;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public String getRegionInfo() {
        return regionInfo;
    }

    public void setRegionInfo(String regionInfo) {
        this.regionInfo = regionInfo;
    }

    public String getUniqueDeviceID() {
        return uniqueDeviceID;
    }

    public void setUniqueDeviceID(String uniqueDeviceID) {
        this.uniqueDeviceID = uniqueDeviceID;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public String getEthernetAddress() {
        return ethernetAddress;
    }

    public void setEthernetAddress(String ethernetAddress) {
        this.ethernetAddress = ethernetAddress;
    }

    public String getKCTPostponementInfoServiceProvisioningState() {
        return kCTPostponementInfoServiceProvisioningState;
    }

    public void setKCTPostponementInfoServiceProvisioningState(
            String kCTPostponementInfoServiceProvisioningState) {
        this.kCTPostponementInfoServiceProvisioningState = kCTPostponementInfoServiceProvisioningState;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getSIMStatus() {
        return sIMStatus;
    }

    public void setSIMStatus(String sIMStatus) {
        this.sIMStatus = sIMStatus;
    }

    public String getActivationState() {
        return activationState;
    }

    public void setActivationState(String activationState) {
        this.activationState = activationState;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    public String getTrustedHostAttached() {
        return trustedHostAttached;
    }

    public void setTrustedHostAttached(String trustedHostAttached) {
        this.trustedHostAttached = trustedHostAttached;
    }

    public String getBrickState() {
        return brickState;
    }

    public void setBrickState(String brickState) {
        this.brickState = brickState;
    }

    public String getMobileSubscriberNetworkCode() {
        return mobileSubscriberNetworkCode;
    }

    public void setMobileSubscriberNetworkCode(String mobileSubscriberNetworkCode) {
        this.mobileSubscriberNetworkCode = mobileSubscriberNetworkCode;
    }

    public String getTimeZoneOffsetFromUTC() {
        return timeZoneOffsetFromUTC;
    }

    public void setTimeZoneOffsetFromUTC(String timeZoneOffsetFromUTC) {
        this.timeZoneOffsetFromUTC = timeZoneOffsetFromUTC;
    }

    public String getWiFiAddress() {
        return wiFiAddress;
    }

    public void setWiFiAddress(String wiFiAddress) {
        this.wiFiAddress = wiFiAddress;
    }

    public String getMLBSerialNumber() {
        return mLBSerialNumber;
    }

    public void setMLBSerialNumber(String mLBSerialNumber) {
        this.mLBSerialNumber = mLBSerialNumber;
    }

    public String getUses24HourClock() {
        return uses24HourClock;
    }

    public void setUses24HourClock(String uses24HourClock) {
        this.uses24HourClock = uses24HourClock;
    }

    public String getDeviceColor() {
        return deviceColor;
    }

    public void setDeviceColor(String deviceColor) {
        this.deviceColor = deviceColor;
    }

    public String getBasebandRegionSKU() {
        return basebandRegionSKU;
    }

    public void setBasebandRegionSKU(String basebandRegionSKU) {
        this.basebandRegionSKU = basebandRegionSKU;
    }

    public String getSoftwareBundleVersion() {
        return softwareBundleVersion;
    }

    public void setSoftwareBundleVersion(String softwareBundleVersion) {
        this.softwareBundleVersion = softwareBundleVersion;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getBasebandMasterKeyHash() {
        return basebandMasterKeyHash;
    }

    public void setBasebandMasterKeyHash(String basebandMasterKeyHash) {
        this.basebandMasterKeyHash = basebandMasterKeyHash;
    }

    public String getCPUArchitecture() {
        return cPUArchitecture;
    }

    public void setCPUArchitecture(String cPUArchitecture) {
        this.cPUArchitecture = cPUArchitecture;
    }

    public String getBasebandStatus() {
        return basebandStatus;
    }

    public void setBasebandStatus(String basebandStatus) {
        this.basebandStatus = basebandStatus;
    }

    public String getBasebandActivationTicketVersion() {
        return basebandActivationTicketVersion;
    }

    public void setBasebandActivationTicketVersion(String basebandActivationTicketVersion) {
        this.basebandActivationTicketVersion = basebandActivationTicketVersion;
    }

    public String getBasebandChipID() {
        return basebandChipID;
    }

    public void setBasebandChipID(String basebandChipID) {
        this.basebandChipID = basebandChipID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getProductionSOC() {
        return productionSOC;
    }

    public void setProductionSOC(String productionSOC) {
        this.productionSOC = productionSOC;
    }

}
