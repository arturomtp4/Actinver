package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Login_0_Page extends BaseTest {

    private AndroidElement botonActipass;

    public MobileElement getBotonActipass() {
        scrollToElement("resourceIdMatches", "com.actinver.eactinver:id/btn_continue_actipass_information");
        if (botonActipass==null)
            botonActipass = (AndroidElement) ((AndroidDriver)getDriver()).findElementByAndroidUIAutomator("text(\"Entendido\")");
        return botonActipass;
    }
}
