package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PantallaIngresarNumeroDeClientePage extends BaseTest {

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/editTextClientLogin")
    })
    public List<MobileElement> numeroDeClienteTextbox;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/btnContinueLogin")
    })
    public List<MobileElement> continuarButton;

}
