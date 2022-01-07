package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Login_0_Page extends BaseTest {

    private MobileElement botonActipass;

    public Login_0_Page() {
        this.botonActipass = null;
    }

    public MobileElement getBotonActipass() {
        scrollToElement("resourceIdMatches", "com.actinver.eactinver:id/btn_actipass_login");
        if (botonActipass==null)
            botonActipass = (MobileElement) getDriver().findElementById("com.actinver.eactinver:id/btn_actipass_login");
        return botonActipass;
    }
}
