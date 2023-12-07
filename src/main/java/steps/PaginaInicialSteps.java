package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


import pageObjectModel.PaginaInicialPage;

import static utils.Esperas.espera1;
import static utils.PasoVentanasWeb.pasoVentanasWeb;
import static utils.PopUp.popUp;
import static utils.Hover.*;

public class PaginaInicialSteps {


    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Abrir Navegador")
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://www.haceb.com/");
    }
    @Step("Cerrar publicidad")
    public void cerrarPop(){
        espera1(paginaInicialPage.getDriver(),paginaInicialPage.popButton);
        popUp(paginaInicialPage.popButton);
    }


    @Step("Cursero Hover")
    public void registroPagina(){


        WebElementFacade mainMenu=paginaInicialPage.hrvPerfil;
        Interaction(paginaInicialPage.getDriver(),mainMenu);
        /*Actions actions= new Actions(paginaInicialPage.getDriver());
        actions.moveToElement(mainMenu).perform();*/ //se cambia por el interaction en la clase hover
        paginaInicialPage.lnkRegistro.click();
        paginaInicialPage.lnkIngreso.click();



    }
    @Step("Paso entre ventanas")
    public void pasoVentanas(){
        pasoVentanasWeb(paginaInicialPage.getDriver());

    }
}
