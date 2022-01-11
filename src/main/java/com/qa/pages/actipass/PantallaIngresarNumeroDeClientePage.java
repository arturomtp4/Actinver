package com.qa.pages.actipass;
import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PantallaIngresarNumeroDeClientePage extends BaseTest {

    public PantallaIngresarNumeroDeClientePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceIdMatches(\"com.actinver.eactinver:id/btn_actipass_login\"))")
    public MobileElement botonActipass;

}
