package com.qa.test;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.pages.OnboardingPage;
import com.qa.pages.OriginAccountPage;
import com.qa.reports.ExtentReport;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class OriginAccountTest extends BaseTest {
    OriginAccountPage originAccount;
    JSONObject loginUsers;
    TestUtils utils = new TestUtils();

    @BeforeClass
    public void beforeClass() throws IOException {
        InputStream datais = null;
        try {
            String dataFileName = "data/loginUsers.json";
            datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
            JSONTokener tokener = new JSONTokener(datais);
            loginUsers = new JSONObject(tokener);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            if (datais != null){
                datais.close();
            }
        }
        closeApp();
        launchApp();
    }

    @BeforeMethod
    public void beforeMethod(Method m){ //Se asigna parametro para obterne el nombre del metodo en ejecución
        originAccount = new OriginAccountPage();
        utils.log().info("\n" + "******* starting test: " + m.getName() + " *******" + "\n");
    }

    @Test
    public void tst001originAccount() throws InterruptedException {
        Thread.sleep(1000);
        ExtentReport.getTest().log(Status.INFO,"Paso 1: Ingresar Número de Celular a Registrar");
        originAccount.stepsOriginAccount(loginUsers.getJSONObject("celvalido").getString("numerocel"));
        Thread.sleep(3000);
    }
}
