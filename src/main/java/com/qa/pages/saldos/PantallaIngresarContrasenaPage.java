package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PantallaIngresarContrasenaPage extends BaseTest {

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/editTextContraseña")
    })
    public List<MobileElement> contraseñaTextbox;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonContinuePass")
    })
    public List<MobileElement> continuarButton;

}
