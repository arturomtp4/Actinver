package com.qa.test;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.pages.LoginAccountPage;
import com.qa.pages.LoginDinnPage;
import com.qa.reports.ExtentReport;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class LoginDinnTest extends BaseTest {
    LoginDinnPage loginDinn;
    LoginAccountPage loginAccoun;
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
        loginDinn = new LoginDinnPage();
        loginAccoun = new LoginAccountPage();
        utils.log().info("\n" + "******* starting test: " + m.getName() + " *******" + "\n");

    }

    @Test
    public void ingresarNumInvalido() throws InterruptedException, IOException {
        Thread.sleep(6000);
        stepsExtentRepor("Paso 1 Presionar el botón Ingresar");
        loginAccoun.clickIngresar();
        stepsExtentRepor("Paso 2 Ingresar Número de Celular Incorrecto");
        loginAccoun.sendNumCel(loginUsers.getJSONObject("celInvalido").getString("numerocel"));
        stepsExtentRepor("Paso 3 Presionar el botón Ingresar");
        loginAccoun.ingresarNum();

//        String actualErrTxt = loginDinn.msgErrNumLog();
//        String expectedErrTxt = "Inténtalo nuevamente. Si el problema persiste\ncomunícate con nosotros al 800 911 3466";
//        utils.log("El mensaje de error es: " + actualErrTxt);
//        Assert.assertEquals(actualErrTxt,expectedErrTxt);
//
//        Thread.sleep(2000);
//        ExtentReport.getTest().log(Status.INFO,"Paso 3: Presionar Boton de Entendido");
//        loginDinn.clickBtnEntendido();
        Thread.sleep(1000);
        stepsExtentRepor("Paso 4 Se muestra la pantalla de Error");
    }

}
