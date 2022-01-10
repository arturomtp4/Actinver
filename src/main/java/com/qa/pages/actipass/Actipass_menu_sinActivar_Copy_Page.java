package com.qa.pages.actipass;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Actipass_menu_sinActivar_Copy_Page extends BaseTest {

    public  Actipass_menu_sinActivar_Copy_Page(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(id = "com.actinver.eactinver:id/btn_continue_actipass_information")
    private MobileElement botonEntendido;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[1]")
    private MobileElement mensajeActivaActipassPara;

    public MobileElement getBotonEntendido() {

        //botonEntendido = (MobileElement) getDriver().findElementById("com.actinver.eactinver:id/btn_continue_actipass_information");
        return botonEntendido;
    }

    public MobileElement getMensajeActivaActipassPara() {
        // = (MobileElement) ((AndroidDriver) getDriver()).findElementsByClassName("android.widget.TextView").get(0);
        return mensajeActivaActipassPara;
    }
}
