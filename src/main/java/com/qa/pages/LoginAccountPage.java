package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginAccountPage extends BaseTest {

    @AndroidFindBy(id = "com.actinver.dinn:id/btn_signup_begin_login")
    private MobileElement btnIngresar;

    @AndroidFindBy(id = "com.actinver.dinn:id/tiet_enrollment_phone_number_input")
    private MobileElement txtNumCel;

    @AndroidFindBy(id = "com.actinver.dinn:id/btn_enrollment_otp")
    private MobileElement btnIngresarNum;

    TestUtils utils = new TestUtils();

    public LoginAccountPage clickIngresar(){
        click(btnIngresar);
        return this;
    }

    public LoginAccountPage sendNumCel(String strNumCel){
        sendKeys(txtNumCel, strNumCel);
        return this;
    }

    public LoginAccountPage ingresarNum(){
        click(btnIngresarNum);
        return this;
    }


}
