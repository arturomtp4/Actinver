package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PantallaIngresarNumeroDeClientePage extends BaseTest {

    public PantallaIngresarNumeroDeClientePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(id = "com.actinver.eactinver:id/textinput_placeholder")
    public MobileElement numeroDeClienteTextbox;

    @AndroidFindBy(id = "com.actinver.eactinver:id/btnContinueLogin")
    public MobileElement continuarButton;
    
}
