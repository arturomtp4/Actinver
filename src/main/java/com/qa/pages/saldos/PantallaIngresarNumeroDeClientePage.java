package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PantallaIngresarNumeroDeClientePage extends BaseTest {

    @AndroidFindBy(id = "com.actinver.eactinver:id/editTextClientLogin")
    public MobileElement numeroDeClienteTextbox;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceId(\"com.actinver.eactinver:id/btnContinueLogin\"))")
    public MobileElement continuarButton;

}
