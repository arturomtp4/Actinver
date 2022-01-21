package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class PantallaIngresarContrasenaPage extends BaseTest {

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/editTextContraseña"),
            @FindBy(id = "com.actinver.eactinver:id/editTextContraseñ")
    })
    public MobileElement contraseñaTextbox;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonContinuePass")
    })
    public MobileElement continuarButton;

}
