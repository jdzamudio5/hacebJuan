package steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import pageObjectModel.PaginaInicialPage;
import pageObjectModel.PaginaPerfilPage;

import static utils.Esperas.espera1;

public class PaginaPerfilSteps {
    @Page
    PaginaPerfilPage paginaPerfilPage;

    @Step()
    public void paginaPerfil(){
        espera1(paginaPerfilPage.getDriver(),paginaPerfilPage.namePerfil);
        Assert.assertTrue(paginaPerfilPage.namePerfil.isDisplayed());

    }
}
