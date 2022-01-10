package com.qa.pages.actipass;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PantallaMensajeActipassDesactivadoPage extends BaseTest {

    public PantallaMensajeActipassDesactivadoPage(){
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
