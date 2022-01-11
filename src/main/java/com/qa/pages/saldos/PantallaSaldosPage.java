package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PantallaSaldosPage extends BaseTest {

    public PantallaSaldosPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }



}
