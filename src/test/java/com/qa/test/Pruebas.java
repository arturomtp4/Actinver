package com.qa.test;

import com.qa.BaseTest;
import com.qa.test.dashboard_de_saldos.DashboardDeSaldosTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

public class Pruebas extends BaseTest {

    DashboardDeSaldosTest dashboardDeSaldosTest;

    public Pruebas(){
        dashboardDeSaldosTest=new DashboardDeSaldosTest();
    }

    @Test
    public void launchAPP() throws IOException {
        dashboardDeSaldosTest.iniciarSesion();
        dashboardDeSaldosTest.cerrarSesion();
    }
}
