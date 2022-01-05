package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class LoginDinnPage extends BaseTest {
    TestUtils utils = new TestUtils();
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[11]/android.widget.TextView")
    private MobileElement btnNumber0;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    private MobileElement btnNumber1;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    private MobileElement btnNumber2;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
    private MobileElement btnNumber3;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView")
    private MobileElement btnNumber4;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView")
    private MobileElement btnNumber5;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.TextView")
    private MobileElement btnNumber6;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.TextView")
    private MobileElement btnNumber7;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView")
    private MobileElement btnNumber8;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.TextView")
    private MobileElement btnNumber9;

    @AndroidFindBy (id = "com.actinver.dinn:id/tv_error_body")
    private MobileElement txtMessageErrorNum;

    @AndroidFindBy (id = "com.actinver.dinn:id/btn_error_action")
    private MobileElement btnEntendido;

    public LoginDinnPage tabBtnNum1(){
        click(btnNumber1);
        return this;
    }

    public LoginDinnPage tabBtnNum2(){
        click(btnNumber2);
        return this;
    }

    public LoginDinnPage tabBtnNum3(){
        click(btnNumber3);
        return this;
    }

    // Paso Ingresar con PIN Incorrecto
    public LoginDinnPage numUserInvalid() throws InterruptedException {
        Thread.sleep(1000);
        click(btnNumber1);
        click(btnNumber2);
        click(btnNumber5);
        click(btnNumber0);
        click(btnNumber4);
        click(btnNumber1);
        return this;
    }

    // Paso Ingresar con PIN correcto
    public LoginDinnPage numUserCorrect() throws InterruptedException {
        Thread.sleep(1000);
        click(btnNumber2);
        click(btnNumber6);
        click(btnNumber0);
        click(btnNumber3);
        click(btnNumber1);
        click(btnNumber9);
        return this;
    }

    public String msgErrNumLog(){
        String err = getText(txtMessageErrorNum);
        utils.log("error text is - " + err);
        return err;
    }

    public LoginDinnPage clickBtnEntendido(){
        click(btnEntendido);
        return this;
    }

}
