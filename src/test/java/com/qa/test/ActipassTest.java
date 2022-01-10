package com.qa.test;

import com.qa.BaseTest;
import com.qa.pages.actipass.PantallaIngresarNumeroDeCliente;
import com.qa.pages.actipass.PantallaMensajeActipassDesactivadoPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ActipassTest extends BaseTest {

    PantallaMensajeActipassDesactivadoPage pantallaMensajeActipass_desactivado_page;
    PantallaIngresarNumeroDeCliente login_0_page;

    @BeforeMethod
    public void beforeMethod(){
        login_0_page=new PantallaIngresarNumeroDeCliente();
        pantallaMensajeActipass_desactivado_page =new PantallaMensajeActipassDesactivadoPage();
    }

    @Test
    public void actipassDesactivadoTest() throws IOException {
        stepsExtentRepor("Paso 1 Dar click en el boton ActiPass");
        click(login_0_page.getBotonActipass());
        stepsExtentRepor("Paso 2 Verificar mensaje -Activa ActiPass para-");
        Assert.assertEquals(pantallaMensajeActipass_desactivado_page.getMensajeActivaActipassPara().getText(),
                getStrings().get("actipass desactivado"));
        stepsExtentRepor("Paso 3 Dar click en el boton entendido");
        click(pantallaMensajeActipass_desactivado_page.getBotonEntendido());
    }


}
