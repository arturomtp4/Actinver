package com.qa.test;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.pages.OnboardingPage;
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

public class OnboardingTest extends BaseTest {
    OnboardingPage onboarPage;
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
        onboarPage = new OnboardingPage();
        utils.log().info("\n" + "******* starting test: " + m.getName() + " *******" + "\n");
    }

    @Test
    public void tst001Login() throws InterruptedException, IOException {
        onboarPage.loginOnboard();
    }
}
