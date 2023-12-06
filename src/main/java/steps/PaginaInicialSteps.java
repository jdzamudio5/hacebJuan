package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import pageObjectModel.PaginaInicialPage;

import static utils.Esperas.espera1;
import static utils.PopUp.popUp;

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
        Actions actions= new Actions(paginaInicialPage.getDriver());
        actions.moveToElement(mainMenu).perform();
        paginaInicialPage.lnkRegistro.click();
        paginaInicialPage.lnkIngreso.click();



    }
    @Step("Paso entre ventanas")
    public void pasoVentanas(){
        for (String windowHandle : paginaInicialPage.getDriver().getWindowHandles()) {
            if(!paginaInicialPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                paginaInicialPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }
}
