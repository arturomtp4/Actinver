package com.qa.test;

import com.qa.BaseTest;
import com.qa.pages.Actipass_menu_sinActivar_Copy_Page;
import com.qa.pages.Login_0_Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ActipassTest extends BaseTest {

    Actipass_menu_sinActivar_Copy_Page actipass_menu_sinActivar_copy_page;
    Login_0_Page login_0_page;

    @BeforeMethod
    public void beforeMethod(){
        login_0_page=new Login_0_Page();
        actipass_menu_sinActivar_copy_page=new Actipass_menu_sinActivar_Copy_Page();
    }

    @Test
    public void actipassDesactivadoTest() throws IOException {
        stepsExtentRepor("Paso 1 Dar click en el boton ActiPass");
        System.out.println(login_0_page.getBotonActipass());
        click(login_0_page.getBotonActipass());
        stepsExtentRepor("Paso 2 Verificar mensaje -Activa ActiPass para-");
        Assert.assertEquals(actipass_menu_sinActivar_copy_page.getMensajeActivaActipassPara().getText(),
                getStrings().get("actipass desactivado"));
        stepsExtentRepor("Paso 3 Dar click en el boton entendido");
        click(actipass_menu_sinActivar_copy_page.getBotonEntendido());
    }
}
