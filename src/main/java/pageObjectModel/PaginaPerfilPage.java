package pageObjectModel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaPerfilPage extends PageObject {
    @FindBy(how = How.XPATH, using = "//div[@class='vtex-account__user-name f4 c-on-base fw3 nowrap']")
    public WebElementFacade namePerfil;

}
