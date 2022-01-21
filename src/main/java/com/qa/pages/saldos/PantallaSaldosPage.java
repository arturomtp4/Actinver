package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class PantallaSaldosPage extends BaseTest {

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/detallenIstrumentInversionesSaldosPosicionIntegral")
    })
    public MobileElement verDetalleLink;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/bottom_menu_hamburger_listener")
    })
    public MobileElement hamburguesaButton;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/exit")
    })
    public MobileElement salirButton;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/rightNavSaldos")
    })
    public MobileElement rightNavSeccionTusContratos;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/btn_logout_yes")
    })
    public MobileElement confirmarCerrarSessionButton;

}
