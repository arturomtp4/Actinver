package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PantallaDetalleDeContratoPage extends BaseTest {

    @FindAll({
            @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[1]")
    })
    public List<MobileElement> tabEfectivoButton;

    //No se puede mapear ya que no aparece en la interfaz del tab(switch) 'Efectivo'
    public List<MobileElement> verDetalleLink;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/btnVerDivisasSaldos")
    })
    public List<MobileElement> verDivisasLink;

    @FindAll({
            @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[2]")
    })
    public List<MobileElement> tabInversionesButton;

    @FindAll({
            @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[3]")
    })
    public List<MobileElement> tabMovimientosButton;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/imageButtonReturnToSaldos")
    })
    public List<MobileElement> returnToSaldosButton;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/leftNav")
    })
    public List<MobileElement> leftNavSaldos;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/rightNav")
    })
    public List<MobileElement> rightNavSaldos;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonVerDetalleSaldosInversiones")
    })
    public List<MobileElement> inversionesVerDetalleLink;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonReturnSaldosInversionesDetails")
    })
    public List<MobileElement> returnSaldosInversionesDetails;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/detallenIstrumentInversionesSaldos")
    })
    public List<MobileElement> verDetalleInstrumentoLink;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonReturnInstrumentPortafolioSaldosDetails")
    })
    public List<MobileElement> returnFromPortafolioButton;


}
