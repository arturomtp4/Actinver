package com.qa.test;

import com.qa.BaseTest;
import com.qa.test.dashboard_de_saldos.DashboardDeSaldosTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Pruebas extends BaseTest {

    DashboardDeSaldosTest dashboardDeSaldosTest;

    public Pruebas(){
        dashboardDeSaldosTest=new DashboardDeSaldosTest();
    }

    @Test
    public void launchAPP() throws IOException, InterruptedException {
        dashboardDeSaldosTest.iniciarSesion();
        dashboardDeSaldosTest.cerrarSesion();
    }
}
