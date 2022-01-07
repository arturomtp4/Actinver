package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login_0_Page {

    @AndroidFindBy(id = "com.actinver.eactinver:id/btn_actipass_login")
    private MobileElement botonActipass;

    public MobileElement getBotonActipass() {
        return botonActipass;
    }
}
