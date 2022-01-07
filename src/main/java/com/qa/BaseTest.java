package com.qa;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.qa.reports.ExtentReport;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.annotations.Optional;

import java.io.*;
import java.net.ServerSocket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;

public class BaseTest {
    // Parametros globales
    protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal<AppiumDriver>();
    protected static ThreadLocal <Properties> props = new ThreadLocal<Properties>();
    protected static ThreadLocal <HashMap<String, String>> strings = new ThreadLocal<HashMap<String, String>>();
    protected static ThreadLocal <String> platform = new ThreadLocal<String>();
    protected static ThreadLocal <String> dateTime = new ThreadLocal<String>();
    protected static ThreadLocal <String> deviceName = new ThreadLocal<String>();
    private static AppiumDriverLocalService server;
    TestUtils utils = new TestUtils();


    public AppiumDriver getDriver(){
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2){
        driver.set(driver2);
    }

    public Properties getProps() {
        return props.get();
    }

    public void setProps(Properties props2) {
        props.set(props2);
    }

    public HashMap<String, String> getStrings() {
        return strings.get();
    }

    public void setStrings(HashMap<String, String> strings2) {
        strings.set(strings2);
    }

    public String getPlatform() {
        return platform.get();
    }

    public void setPlatform(String platform2) {
        platform.set(platform2);
    }

    public String getDateTime() {
        return dateTime.get();
    }

    public void setDateTime(String dateTime2) {
        dateTime.set(dateTime2);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }

    public BaseTest(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @BeforeMethod
    public void beforeMethod() {
        ((CanRecordScreen) getDriver()).startRecordingScreen();
    }

    //stop video capturing and create *.mp4 file
    @AfterMethod
    public synchronized void afterMethod(ITestResult result) throws Exception {
        String media = ((CanRecordScreen) getDriver()).stopRecordingScreen();

        Map<String, String> params = result.getTestContext().getCurrentXmlTest().getAllParameters();
        String dirPath = "videos" + File.separator + params.get("platformName") + "_" + params.get("deviceName")
                + File.separator + getDateTime() + File.separator + result.getTestClass().getRealClass().getSimpleName();

        File videoDir = new File(dirPath);

        synchronized(videoDir){
            if(!videoDir.exists()) {
                videoDir.mkdirs();
            }
        }
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(videoDir + File.separator + result.getName() + ".mp4");
//            stream.write(Base64.decodeBase64(media));
            stream.write(Base64.getDecoder().decode(media));
            stream.close();
//            utils.log().info("video path: " + videoDir + File.separator + result.getName() + ".mp4");
        } catch (Exception e) {
//            utils.log().error("error during video capture" + e.toString());
        } finally {
            if(stream != null) {
                stream.close();
            }
        }
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        ThreadContext.put("ROUTINGKEY", "ServerLogs");
        server = getAppiumService();
        if(!checkIfAppiumServerIsRunnning(4723)) {
            server.start();  //Inicia el sever de appium
            server.clearOutPutStreams(); //Sirve para limpiar el log del server de appium
            utils.log().info("Appium server started");
        } else {
            utils.log().info("Appium server already running");
        }
    }

    public boolean checkIfAppiumServerIsRunnning(int port) throws Exception {
        boolean isAppiumServerRunning = false;
        ServerSocket socket;
        try {
            socket = new ServerSocket(port);
            socket.close();
        } catch (IOException e) {
            System.out.println("1");
            isAppiumServerRunning = true;
        } finally {
            socket = null;
        }
        return isAppiumServerRunning;
    }

    @AfterSuite
    public void afterSuite(){
        server.stop(); //Detiene el server de appium
        utils.log().info("Appium Server stopped");
    }

    //Metodo para iniciar el sevicio de appium
    public AppiumDriverLocalService getAppiumServerDefault(){
        return AppiumDriverLocalService.buildDefaultService();
    }

    public AppiumDriverLocalService getAppiumService() {
        HashMap<String, String> environment = new HashMap<String, String>();
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
                .withAppiumJS(new File("C:\\Users\\ruben.benito\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File("ServerLogs/server.log")));
    }

    @Parameters({"emulator","platformName","udid","deviceName", "systemPort", "chromeDriverPort",
            "wdaLocalPort", "webkitDebugProxyPort"})
    @BeforeTest
    public void beforeTest(@Optional("androidOnly")String emulator, String platformName, String udid,
                           String deviceName, String systemPort, @Optional("androidOnly")String chromeDriverPort,
                           @Optional("iOSOnly")String wdaLocalPort, @Optional("iOSOnly")String webkitDebugProxyPort) throws Exception {

        setDateTime(utils.dateTime());
        setPlatform(platformName);
        setDeviceName(deviceName);
        URL url;
        InputStream inputStream = null;
        InputStream stringsis = null;
        Properties props = new Properties();
        AppiumDriver driver;

        //Administra los logs en ejecución paralela
        String strFile = "logs" + File.separator + platformName + "_" + deviceName;
        File logFile = new File(strFile);
        if (!logFile.exists()){
            logFile.mkdirs();
        }
        ThreadContext.put("ROUTINGKEY", strFile);
        utils.log().info("log path: " + strFile);

        try {
            props = new Properties();
            String propFileName = "config.properties";
            String xmlFileName = "strings/strings.xml";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            props.load(inputStream);
            setProps(props);

            stringsis = getClass().getClassLoader().getResourceAsStream(xmlFileName);
            setStrings(utils.parseStringXML(stringsis));

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            desiredCapabilities.setCapability("udid", udid);
            desiredCapabilities.setCapability("noReset", "true");
            url = new URL(props.getProperty("appiumURL"));

            switch(platformName) {
                case "Android":
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                    desiredCapabilities.setCapability("appPackage", props.getProperty("androidAppPackage"));
                    desiredCapabilities.setCapability("appActivity", props.getProperty("androidAppActivity"));
                    if (emulator.equals("true")){
                        desiredCapabilities.setCapability("avd", deviceName);
                    }
                    desiredCapabilities.setCapability("systemPort", systemPort);
                    desiredCapabilities.setCapability("chromeDriverPort", chromeDriverPort);
                    String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                            + File.separator + "resources" + File.separator + "app"
                            + File.separator + "eActinver.apk";
                    utils.log().info("appUrl is: " + androidAppUrl);
                    desiredCapabilities.setCapability(MobileCapabilityType.APP, androidAppUrl);

                    driver = new AndroidDriver(url, desiredCapabilities);
                    break;
                case "iOS":
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOSAutomationName"));
                    String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
                    utils.log().info("appUrl is: " + iOSAppUrl);
                    desiredCapabilities.setCapability("bundleId", props.getProperty("iOSBundleId"));
                    desiredCapabilities.setCapability("wdaLocalPort", wdaLocalPort);
                    desiredCapabilities.setCapability("webkitDebugProxyPort", webkitDebugProxyPort);
                    desiredCapabilities.setCapability("app", iOSAppUrl);

                    driver = new IOSDriver(url, desiredCapabilities);
                    break;
                default:
                    throw new Exception("Invalid Platform " + platformName);
            }
            setDriver(driver);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (stringsis != null){
                stringsis.close();
            }
        }
    }

    public void waitForVisibility(MobileElement e){
        WebDriverWait wait = new WebDriverWait(getDriver(), TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(WebElement e){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void clear(MobileElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(MobileElement e){
        waitForVisibility(e);
        e.click();
    }

    public void sendKeys(MobileElement e, String txt){
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public String getAttribute(MobileElement e, String attribute){
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getText(MobileElement e) {
        switch(getPlatform()) {
            case "Android":
                return getAttribute(e, "text");
            case "iOS":
                return getAttribute(e, "label");
        }
        return null;
    }

    public void closeApp(){
        ((InteractsWithApps) getDriver()).closeApp();
    }

    public void launchApp(){
        ((InteractsWithApps) getDriver()).launchApp();
    }

    public MobileElement scrollToElement(){
        return (MobileElement) ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().description(\"test-Precio\"));");
    }

    public void iOSScrollToElement() {
        RemoteWebElement element = (RemoteWebElement)getDriver().findElement(By.name("test-ADD TO CART"));
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
//	  scrollObject.put("direction", "down");
//	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
//	  scrollObject.put("name", "test-ADD TO CART");
        scrollObject.put("toVisible", "sdfnjksdnfkld");
        getDriver().executeScript("mobile:scroll", scrollObject);
    }

    public void stepsExtentRepor(String strStep) throws IOException {
        stepToStep(strStep);
        String device = getDeviceName().toString();
        String pathImg = System.getProperty("user.dir") + File.separator + "ScreenshotsReport"
                + File.separator + device;
        ExtentReport.getTest().log(Status.INFO, strStep, MediaEntityBuilder.createScreenCaptureFromPath(pathImg + "\\" + strStep + ".png").build());
    }

    public void stepToStep(String paso){
        BaseTest base = new BaseTest();
        File file = base.getDriver().getScreenshotAs(OutputType.FILE);
        String device = base.getDeviceName().toString();
        System.out.println("The Name of the Device is :::::::::::::: " + device);

        Map <String,String> params = new HashMap<String, String>();
        String imagePath = "ScreenshotsReport" + File.separator + device
                + File.separator + paso + ".png";
        try {
            FileUtils.copyFile(file, new File(imagePath));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest(){
        getDriver().quit();
    }
}
