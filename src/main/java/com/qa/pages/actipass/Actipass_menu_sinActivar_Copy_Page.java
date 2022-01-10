package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Actipass_menu_sinActivar_Copy_Page extends BaseTest {

    private MobileElement botonEntendido;
    private MobileElement mensajeActivaActipassPara;

    public MobileElement getBotonEntendido() {

        botonEntendido = (MobileElement) getDriver().findElementById("com.actinver.eactinver:id/btn_continue_actipass_information");
        return botonEntendido;
    }

    public MobileElement getMensajeActivaActipassPara() {
        mensajeActivaActipassPara = (MobileElement) ((AndroidDriver) getDriver()).findElementsByClassName("android.widget.TextView").get(0);
        return mensajeActivaActipassPara;
    }
}
