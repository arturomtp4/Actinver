package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.io.IOException;

public class OnboardingPage extends BaseTest {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private MobileElement btncontinuo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")
    private MobileElement btncontinuo2;

    public OnboardingPage clickContinue(){
        click(btncontinuo);
        return this;
    }

    public OnboardingPage clickContinueTwo(){
        click(btncontinuo2);
        return this;
    }

    public OnboardingPage loginOnboard() throws IOException, InterruptedException {
        Thread.sleep(3000);
        stepsExtentRepor("Paso 1 Presionar Boton Contiunuar");
        clickContinue();
        stepsExtentRepor("Paso 2 Presionar Boton Contiunuar");
        clickContinueTwo();
        stepsExtentRepor("Paso 3 Presionar Boton Contiunuar");
        clickContinueTwo();
        stepsExtentRepor("Paso 4 Presionar Boton Contiunuar");
        clickContinueTwo();
        stepsExtentRepor("Paso 5 Presionar Boton Contiunuar");
        clickContinueTwo();
        Thread.sleep(3000);
        stepsExtentRepor("Paso 6 Se muestra la pantalla de Inicio DINN");
        Thread.sleep(1000);
        return this;
    }

}
