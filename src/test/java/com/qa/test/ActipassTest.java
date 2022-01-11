package com.qa.test;

import com.qa.BaseTest;
import com.qa.pages.actipass.PantallaIngresarNumeroDeClientePage;
import com.qa.pages.actipass.PantallaMensajeActipassDesactivadoPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ActipassTest extends BaseTest {

    PantallaMensajeActipassDesactivadoPage pantallaMensajeActipassDesactivadoPage;
    PantallaIngresarNumeroDeClientePage pantallaIngresarNumeroDeClientePage;

    @BeforeMethod
    public void beforeMethod(){
        pantallaIngresarNumeroDeClientePage=new PantallaIngresarNumeroDeClientePage();
        pantallaMensajeActipassDesactivadoPage =new PantallaMensajeActipassDesactivadoPage();
    }

    @Test
    public void actipassDesactivadoTest() throws IOException {
        // Paso 1
        stepsExtentRepor("Paso 1 Dar click en el boton ActiPass");
        click(pantallaIngresarNumeroDeClientePage.botonActipass);

        // Paso 2
        stepsExtentRepor("Paso 2 Verificar mensaje -Activa ActiPass para-");
        Assert.assertEquals(pantallaMensajeActipassDesactivadoPage.mensajeActivaActipassPara.getText(),
                getStrings().get("actipass desactivado"));

        // Paso 3
        stepsExtentRepor("Paso 3 Dar click en el boton entendido");
        click(pantallaMensajeActipassDesactivadoPage.botonEntendido);
    }


}
