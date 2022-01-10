package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;

public class Login_0_Page extends BaseTest {

    private MobileElement botonActipass;

    public MobileElement getBotonActipass() {
        scrollToElement("resourceIdMatches", "com.actinver.eactinver:id/btn_actipass_login");
        botonActipass = (MobileElement) getDriver().findElementById("com.actinver.eactinver:id/btn_actipass_login");
        return botonActipass;
    }
}
