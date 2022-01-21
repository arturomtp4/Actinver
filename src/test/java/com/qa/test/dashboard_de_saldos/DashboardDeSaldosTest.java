package com.qa.test.dashboard_de_saldos;

import com.qa.BaseTest;
import com.qa.pages.saldos.*;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class DashboardDeSaldosTest extends BaseTest {

    private PantallaIngresarNumeroDeClientePage pantallaIngresarNumeroDeClientePage;
    private PantallaIngresarContrasenaPage pantallaIngresarContrasenaPage;
    private PantallaSaldosPage pantallaSaldosPage;
    private PantallaDetalleDeContratoPage pantallaDetalleDeContratoPage;
    private PantallaInversionesPendientesPage pantallaInversionesPendientesPage;
    private JSONObject loginUsers;


    @BeforeClass
    public void beforeClass() throws IOException {
        this.pantallaIngresarNumeroDeClientePage = new PantallaIngresarNumeroDeClientePage();
        this.pantallaIngresarContrasenaPage = new PantallaIngresarContrasenaPage();
        this.pantallaSaldosPage = new PantallaSaldosPage();
        this.pantallaDetalleDeContratoPage = new PantallaDetalleDeContratoPage();
        this.pantallaInversionesPendientesPage = new PantallaInversionesPendientesPage();
        this.loginUsers= new TestUtils().getData();
    }

    @Test
    public void test001() throws IOException {
        // Paso 1 iniciar sesion
        iniciarSesion();

        // paso 2
        // De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // paso 3
        // Activar el tab "Efectivo".
        click(pantallaDetalleDeContratoPage.tabEfectivoButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Efectivo");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para mostrar la seccion Efectivo Total sin divisas");
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test002() throws IOException {

        // Paso 1 iniciar sesion
        iniciarSesion();

        // paso 2
        // De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // paso 3
        // Activar el tab "Efectivo".
        click(pantallaDetalleDeContratoPage.leftNavSaldos);
        click(pantallaDetalleDeContratoPage.tabEfectivoButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Efectivo");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para mostrar la seccion Efectivo Total con divisas");
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test003() throws IOException {
        // Paso 1 Iniciar sesión
        iniciarSesion();
        click(pantallaSaldosPage.rightNavSeccionTusContratos);

        // Paso 2
        // De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3
        // Activar el tab "Efectivo".
        click(pantallaDetalleDeContratoPage.leftNavSaldos);
        click(pantallaDetalleDeContratoPage.tabEfectivoButton);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3 Dar click en el tab Efectivo");

        // Paso 4
        // Dar tab en link "Ver divisas"
        stepsExtentRepor("Paso 4-1 Dar tab en el link Ver Divisas");
        click(pantallaDetalleDeContratoPage.verDivisasLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-2 Hacer scroll para ver la seccion de Divisas");
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test004() throws IOException {

    }

    // Validar que se muestren la descripción del
    // saldo negativo "…Por cobro de cuota anual"
    @Test
    public void test005() throws IOException {
        // Paso 1 iniciar sesion
        iniciarSesion();

        // paso 2
        // De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // paso 3
        // Activar el tab "Efectivo".
        click(pantallaDetalleDeContratoPage.tabEfectivoButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Efectivo");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para mostrar la seccion Efectivo Total sin divisas");
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    // Validar que se muestren la descripción del
    // saldo negativo "…Por transacción en corto"
    @Test
    public void test006() throws IOException {
        // Paso 1 iniciar sesion
        iniciarSesion();

        // paso 2
        // De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // paso 3
        // Activar el tab "Efectivo".
        click(pantallaDetalleDeContratoPage.tabEfectivoButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Efectivo");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para mostrar la seccion Efectivo Total sin divisas");
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test007() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test008() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test009() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        // Paso 5 "Dar tab en Link "Ver detalle" de un instrumento
        stepsExtentRepor("Paso 5-1 Dar click en el link ver detalles");
        click(pantallaDetalleDeContratoPage.verDetalleInstrumentoLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnFromPortafolioButton);
        stepsExtentRepor("Paso 5-2 Pantalla que muestra el detalle de un instrumento");

        click(pantallaDetalleDeContratoPage.returnFromPortafolioButton);
        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    // Verificar que al dar tab en el link "Ver detalles",
    // muestre el detalle del efectivo total.
    @Test
    public void test010() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        //System.out.println(">>>>>>>>>>>>>>>> waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    // Verificar que al dar tab en el link "Ver detalles" de cada instrumento
    // de la lista se muestre con fondo ROJO los saldos Negativos.
    @Test
    public void test011() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        //System.out.println(">>>>>>>>>>>>>>>> waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        // Paso 5
        // "Dar tab en Link "Ver detalle" de un instrumento.
        click(pantallaDetalleDeContratoPage.verDetalleInstrumentoLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnFromPortafolioButton);
        stepsExtentRepor("Paso 5 Dar click en el link ver detalles");

        click(pantallaDetalleDeContratoPage.returnFromPortafolioButton);
        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    // Verificar que al dar tab en el link "Ver más" del detalla de un
    // instrumento, muestre información "Precio actual por titulo"
    // y "Costo de títulos"
    @Test
    public void test012() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        //System.out.println(">>>>>>>>>>>>>>>> waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        // Paso 5
        // "Dar tab en Link "Ver detalle" de un instrumento.
        click(pantallaDetalleDeContratoPage.verDetalleInstrumentoLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnFromPortafolioButton);
        stepsExtentRepor("Paso 5 Dar click en el link Ver Detalles");

        // Paso 6
        // "Dar tab en Link "Ver mas".




        click(pantallaDetalleDeContratoPage.returnFromPortafolioButton);
        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();

    }

    // Validar que se muestre el mensaje "Tienes operaciones pendientes por
    // liquidar..." en el detalle de inversiones cuando existen pendientes
    // por liquidar.
    @Test
    public void test013() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes CON pendientes por liquidar");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");


        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    // Validar que NO se muestre el mensaje "Tienes operaciones pendientes por
    // liquidar..." en el detalle de inversiones cuando NO existen pendientes por liquidar.
    @Test
    public void test014() throws IOException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes SIN pendientes por liquidar");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }


    // Validar que se muestren los pendientes por liquidar
    // cuando se activa el switch de "Pendiente por liquidar"
    @Test
    public void test015() throws IOException, InterruptedException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        // Paso 5 Activar el tab "Pendiente por liquidar"
        click(pantallaInversionesPendientesPage.pendientePorLiquidarButton);
        Thread.sleep(500);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 5 Dar click en el tab Pendiente Por Liquidar");

        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    // Validar que se muestre el detalle de  los pendientes por
    // liquidar cuando se activa se de tab en el link "Ver detalle".
    @Test
    public void test016() throws IOException, InterruptedException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Inversiones".
        click(pantallaDetalleDeContratoPage.tabInversionesButton);
        stepsExtentRepor("Paso 3-1 Dar click en el tab Inversiones");
        waitForVisibility(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 3-2 Scroll para visualizar el contenido del tab Inversiones");

        // Paso 4 Dar tab en Link "Ver detalle"
        stepsExtentRepor("Paso 4-1 Dar click en el link Ver Detalle");
        click(pantallaDetalleDeContratoPage.inversionesVerDetalleLink);
        waitForVisibility(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        stepsExtentRepor("Paso 4-2 Pantalla de inversiones pendientes");
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 4-3 Scroll down para visualizar todo el contenido");

        // Paso 5 Activar el tab "Pendiente por liquidar"
        click(pantallaInversionesPendientesPage.pendientePorLiquidarButton);
        Thread.sleep(500);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        stepsExtentRepor("Paso 5 Dar click en el tab Pendiente Por Liquidar");

        // Paso 6 "Dar tab en Link "Ver detalle"


        click(pantallaDetalleDeContratoPage.returnSaldosInversionesDetails);
        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test017() throws IOException, InterruptedException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Movimientos".
        click(pantallaDetalleDeContratoPage.tabMovimientosButton);
        stepsExtentRepor("3-1 Dar click en el tab Movimientos");
        Thread.sleep(500);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        Thread.sleep(500);
        stepsExtentRepor("3-1 Se muestra el contenido del tab movimientos SIN movimientos");

        click(pantallaDetalleDeContratoPage.returnToSaldosButton);
        cerrarSesion();
    }

    @Test
    public void test018() throws IOException, InterruptedException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Movimientos".
        click(pantallaDetalleDeContratoPage.tabMovimientosButton);
        stepsExtentRepor("3-1 Dar click en el tab Movimientos");
        Thread.sleep(500);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        Thread.sleep(500);
        stepsExtentRepor("3-1 Se muestra el contenido del tab movimientos SIN movimientos");

        // Paso 4 Dar tab en link "Ver todos los movimientos".


    }

    @Test
    public void test019() throws IOException, InterruptedException {
        // Paso 1 Iniciar sesion
        iniciarSesion();

        // Paso 2 De la sección Tus contratos, dar tab en el Link "Ver detalle" de un contrato.
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.rightNavSeccionTusContratos);
        click(pantallaSaldosPage.verDetalleLink);
        stepsExtentRepor("Paso 2 Dar click en el link Ver Detalle");

        // Paso 3 Activar el tab "Movimientos".
        click(pantallaDetalleDeContratoPage.tabMovimientosButton);
        stepsExtentRepor("3-1 Dar click en el tab Movimientos");
        Thread.sleep(500);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        Thread.sleep(500);
        stepsExtentRepor("3-1 Se muestra el contenido del tab movimientos SIN movimientos");

        // Paso 4 Dar tab en link "Ver todos los movimientos".

        // Paso 5 Dar tab en el botón de rango(calendario).

        // Paso 6 Seleccionar la opción 6 meses.
    }

    @Test
    public void test020(){

    }

    public void iniciarSesion() throws IOException {
        // Paso 1
        // Iniciar sesión en la aplicación

        sendKeys(pantallaIngresarNumeroDeClientePage.numeroDeClienteTextbox,loginUsers.getJSONObject("validUser").getString("username"));
        stepsExtentRepor("Paso 1-1 Ingresar el numero de cliente");
        scroll(NumeroDePantallas.UNO, ScrollableElement.TRUE);
        stepsExtentRepor("Paso 1-2 Dar click en el boton continuar");
        click(pantallaIngresarNumeroDeClientePage.continuarButton);
        sendKeys(pantallaIngresarContrasenaPage.contraseñaTextbox, loginUsers.getJSONObject("validUser").getString("password"));
        stepsExtentRepor("Paso 1-3 Ingresar la contraseña");
        scroll(NumeroDePantallas.UNO, ScrollableElement.TRUE);
        stepsExtentRepor("Paso 1-4 Dar click en el boton continuar");
        click(pantallaIngresarContrasenaPage.continuarButton);
    }

    public void cerrarSesion() throws IOException {
        click(pantallaSaldosPage.hamburguesaButton);
        scroll(NumeroDePantallas.UNO, ScrollableElement.FALSE);
        click(pantallaSaldosPage.salirButton);
        click(pantallaSaldosPage.confirmarCerrarSessionButton);
    }

    private void scroll(NumeroDePantallas numeroDePantallas, ScrollableElement element) throws IOException {
        getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable("+element.name().toLowerCase()+"))" +
                        ".scrollToEnd("+(numeroDePantallas.ordinal()+1)+")"));
    }

    enum NumeroDePantallas {
        UNO
    }

    enum ScrollableElement {
        TRUE, FALSE
    }
}
