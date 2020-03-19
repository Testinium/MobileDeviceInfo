# MobileDeviceInfo

MobileDeviceInfo helps you fetch information from your mobile device such as UUID, Device Name, etc.
You can integrate MobileDeviceInfo library into your Appium projects to manage your capabilities dynamically.

##  Prerequisites:
You need to have **ADB** and **libimobiledevice** installed on your machine

ADB installation can be done via this [link](https://developer.android.com/studio/index.html )
      
libimobiledevice can be found on this [link](https://github.com/libimobiledevice/libimobiledevice)

or

brew cask install android-platform-tools

brew install --HEAD libimobiledevice


## Basic Usage
```
 DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);
 if (deviceInfo.anyDeviceConnected()) {
        Device device = deviceInfo.getFirstDevice();
        System.out.println("Device Name - " + device.getDeviceProductName());
        System.out.println("Device id   - " + device.getUniqueDeviceID());
```

or

```
 DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.IOS);
 if (deviceInfo.anyDeviceConnected()) {
        Device device = deviceInfo.getFirstDevice();
        System.out.println("Device Name - " + device.getDeviceProductName());
        System.out.println("Device id   - " + device.getUniqueDeviceID());
```

or ( Attention - Data Comes Late )

```
 DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.IOSSIMULATOR);
 if (deviceInfo.anyDeviceConnected()) {
        Device device = deviceInfo.getFirstDevice();
        System.out.println("Device Name - " + device.getDeviceProductName());
        System.out.println("Device id   - " + device.getUniqueDeviceID());
```

or ( Only Android and IOS Devices Except IOS Simulator )

```
 DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ALL);
 if (deviceInfo.anyDeviceConnected()) {
        Device device = deviceInfo.getFirstDevice();
        System.out.println("Device Name - " + device.getDeviceProductName());
        System.out.println("Device id   - " + device.getUniqueDeviceID());
```

or (  Attention - Data Comes Late Due To IOS Simulator)

```
 DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ALLANDIOSSIMULATOR);
 if (deviceInfo.anyDeviceConnected()) {
        Device device = deviceInfo.getFirstDevice();
        System.out.println("Device Name - " + device.getDeviceProductName());
        System.out.println("Device id   - " + device.getUniqueDeviceID());
```

For **Appium** projects, here's a usage:
```
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(CapabilityType.PLATFORM, device.getDeviceProductName());
capabilities.setCapability("platformName", device.getDeviceProductName());
capabilities.setCapability(CapabilityType.VERSION, device.getProductVersion());
capabilities.setCapability("deviceName", device.getModelNumber());
capabilities.setCapability("udid", device.getUniqueDeviceID());
capabilities.setCapability("app", "#Your App File#");


driver = new RemoteWebDriver(new URL(URL), capabilities);
```        


You can add your project as a maven dependency.

```
<dependency>
  <groupId>com.testinium.deviceinformation</groupId>
  <artifactId>device-information</artifactId>
  <version>2.0</version>
</dependency>
```

You have to add our repository to your pom.xml because it hasn't released to Maven Central repositories.

```
<repositories>
    <repository>
      <id>public</id>
      <name>public</name>
      <url>http://mvn.testinium.com/repository/public/</url>
      <releases>
        <enabled>true</enabled>
      </releases>
      <snapshots>
        <enabled>true</enabled>
      </snapshots>
    </repository>
</repositories>
```  
