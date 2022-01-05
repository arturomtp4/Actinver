package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OriginAccountPage extends BaseTest {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.actinver.dinn:id/btn_signup_begin_create")
    private MobileElement btnCrearCuenta;

    @AndroidFindBy(id = "com.actinver.dinn:id/btn_signup_terms_begin")
    private MobileElement btnComenzar;

    @AndroidFindBy(id = "com.actinver.dinn:id/et_signup_phone_number_entered")
    private MobileElement txtNumCel;

    @AndroidFindBy(id = "com.actinver.dinn:id/btn_signup_phone_number_next")
    private MobileElement btnContinuar;

    public OriginAccountPage stepsOriginAccount(String strNumCel){
        click(btnCrearCuenta);
        click(btnComenzar);
        sendKeys(txtNumCel, strNumCel);
        return this;
    }
}
