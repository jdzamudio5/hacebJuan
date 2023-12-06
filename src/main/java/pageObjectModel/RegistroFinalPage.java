package pageObjectModel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroFinalPage extends PageObject {
    @FindBy(how = How.XPATH,using = "(//input[@name='data.cedula'])[2]")
    public WebElementFacade inputCedula;
    @FindBy(how = How.XPATH,using = "(//select[@name='profile.gender'])[2]")
    public WebElementFacade selectGenero;
    @FindBy(how = How.XPATH,using = "(//input[@name='data.fechaNacimiento'])[2]")
    public WebElementFacade inputFechaNa;
    @FindBy(how = How.XPATH,using = "(//select[@class='gigya-country-code-select'])[3]")
    public WebElementFacade selectPais;
    @FindBy(how = How.XPATH,using = "(//input[@class='gigya-input-text gigya-subscriber-phone-number-input'])[3]")
    public WebElementFacade inputTel;
    @FindBy(how = How.XPATH,using = "(//select[@name='data.region'])[2]")
    public WebElementFacade selectDepartamento;
    @FindBy(how = How.XPATH,using = "(//select[@name='profile.city'])[2]")
    public WebElementFacade selectCiudad;
    @FindBy(how = How.XPATH,using = "(//input[@class='gigya-input-submit hc-c-register-screen-submit invi'])[2]")
    public WebElementFacade inputEnviar;


}
