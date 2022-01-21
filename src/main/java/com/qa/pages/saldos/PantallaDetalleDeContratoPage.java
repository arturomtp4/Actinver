package com.qa.pages.saldos;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class PantallaDetalleDeContratoPage extends BaseTest {

    @FindAll({
            @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[1]")
    })
    public MobileElement tabEfectivoButton;

    //No se puede mapear ya que no aparece en la interfaz del tab(switch) 'Efectivo'
    public MobileElement verDetalleLink;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/btnVerDivisasSaldos")
    })
    public MobileElement verDivisasLink;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[2]")
    public MobileElement tabInversionesButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[3]")
    public MobileElement tabMovimientosButton;

    @AndroidFindBy(id = "com.actinver.eactinver:id/imageButtonReturnToSaldos")
    public MobileElement returnToSaldosButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceId(\"com.actinver.eactinver:id/textViewInversionesTtitle\"))")
    public MobileElement inversionesTextView;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/leftNav")
    })
    public MobileElement leftNavSaldos;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/rightNav")
    })
    public MobileElement rightNavSaldos;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonVerDetalleSaldosInversiones")
    })
    public MobileElement inversionesVerDetalleLink;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonReturnSaldosInversionesDetails")
    })
    public MobileElement returnSaldosInversionesDetails;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/detallenIstrumentInversionesSaldos")
    })
    public MobileElement verDetalleInstrumentoLink;

    @FindAll({
            @FindBy(id = "com.actinver.eactinver:id/buttonReturnInstrumentPortafolioSaldosDetails")
    })
    public MobileElement returnFromPortafolioButton;


}
