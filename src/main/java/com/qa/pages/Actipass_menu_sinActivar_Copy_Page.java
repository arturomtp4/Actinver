package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Actipass_menu_sinActivar_Copy_Page {

    @AndroidFindBy(id = "com.actinver.eactinver:id/btn_continue_actipass_information")
    private MobileElement botonEntendido;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement mensajeActivaActipassPara;

    public MobileElement getBotonEntendido() {
        return botonEntendido;
    }

    public MobileElement getMensajeActivaActipassPara() {
        return mensajeActivaActipassPara;
    }
}
