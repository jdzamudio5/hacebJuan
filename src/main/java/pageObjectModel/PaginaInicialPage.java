package pageObjectModel;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class PaginaInicialPage extends PageObject {
    @FindBy (how = How.XPATH, using = "//a[@aria-label='close window']")
    public WebElementFacade popButton;

    //private final By hvrLogin=By.xpath("//span[@class='icon-user']");
    @FindBy(how = How.XPATH, using = "//span[@class='icon-user']")
    public WebElementFacade hrvPerfil;

    @FindBy(how = How.XPATH, using = "//a[@class='cdc-fire cdc-register']")
    public WebElementFacade lnkRegistro;

    @FindBy(how = How.XPATH, using = "//button[@id='vtexIdUI-custom-oauth']")
    public WebElementFacade lnkIngreso;



}
