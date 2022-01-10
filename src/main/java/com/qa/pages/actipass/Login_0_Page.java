package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Login_0_Page extends BaseTest {

    public Login_0_Page(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceIdMatches(\"com.actinver.eactinver:id/btn_actipass_login\"))")
    public MobileElement botonActipass;

    public MobileElement getBotonActipass() {
        return botonActipass;
    }
}
