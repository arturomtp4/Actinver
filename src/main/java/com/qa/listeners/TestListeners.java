package com.qa.listeners;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.reports.ExtentReport;
import com.qa.utils.TestUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class TestListeners implements ITestListener {
    TestUtils utils = new TestUtils();

    @Override
    public void onTestStart(ITestResult result) {
        BaseTest base = new BaseTest();
        ExtentReport.startTest(result.getName(), result.getMethod().getDescription())
                .assignCategory(base.getPlatform() + "_" + base.getDeviceName())
                .assignAuthor("Armando");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReport.getTest().log(Status.PASS, "Test Passed");
    }

    public void onTestFailure(ITestResult result){
        if (result.getThrowable() != null){
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            result.getThrowable().printStackTrace(pw);
            utils.log(sw.toString());
        }

        BaseTest base = new BaseTest();
        File file = base.getDriver().getScreenshotAs(OutputType.FILE);

        byte[] encoded = null;
        try {
            encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
        }catch (IOException e1){
            e1.printStackTrace();
        }

        Map<String, String> params = new HashMap<String, String>();
        params = result.getTestContext().getCurrentXmlTest().getAllParameters();

        //Estructura de como almacena la captura de pantalla cuando hay error
        String imagePath = "Screenshots" + File.separator + params.get("platformName") + "_"
                + params.get("deviceName") + File.separator + base.getDateTime() + File.separator
                + result.getTestClass().getRealClass().getSimpleName() + File.separator
                + result.getName() + ".png";

        String completeImagePath = System.getProperty("user.dir") + File.separator + imagePath;
        try {
            FileUtils.copyFile(file, new File(imagePath));
            Reporter.log("This is the sample screenshot ");
            Reporter.log("<a href='"+ completeImagePath + "'> <img src='"+ completeImagePath + "' height='400' width='400'/> </a>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ExtentReport.getTest().fail("Test Fail", MediaEntityBuilder
                    .createScreenCaptureFromPath(completeImagePath)
                    .build());
            ExtentReport.getTest().fail("Test Fail", MediaEntityBuilder
                    .createScreenCaptureFromBase64String(new String(encoded, StandardCharsets.US_ASCII))
                    .build());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExtentReport.getTest().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReport.getTest().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.getReporter().flush();
    }
}
