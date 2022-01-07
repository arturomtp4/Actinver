package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Actipass_menu_sinActivar_Copy_Page extends BaseTest {

    private MobileElement botonEntendido;
    private MobileElement mensajeActivaActipassPara;

    public MobileElement getBotonEntendido() {
        if(botonEntendido==null)
            botonEntendido = (MobileElement) getDriver().findElementById("com.actinver.eactinver:id/btn_continue_actipass_information");
        return botonEntendido;
    }

    public MobileElement getMensajeActivaActipassPara() {
        mensajeActivaActipassPara = (MobileElement) ((AndroidDriver) getDriver()).findElementByAndroidUIAutomator("text(\"Activa ActiPass para:\n\")");
        return mensajeActivaActipassPara;
    }
}
