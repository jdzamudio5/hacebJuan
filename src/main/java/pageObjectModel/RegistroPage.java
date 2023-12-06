package pageObjectModel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static net.serenitybdd.core.annotations.findby.How.XPATH;

public class RegistroPage extends PageObject {
    @FindBy(how = XPATH, using = "(//input[@name='email'])[4]")
    public WebElementFacade emailRegistro;
    @FindBy(how = How.XPATH,using = "(//input[@name='profile.firstName'])[2]")
    public WebElementFacade inputNombre;
    @FindBy(how = How.XPATH,using = "//*[@id='gigya-textbox-146410824335495100']")
    public WebElementFacade inputApellido;
    @FindBy(how = How.XPATH,using = "//*[@id='gigya-password-54061940132406190']")
    public WebElementFacade inputPass;
    @FindBy(how = How.XPATH,using = "//*[@id='gigya-password-142670944012194750']")
    public WebElementFacade inputPassCon;
    @FindBy(how = How.XPATH, using = "(//span[@data-translation-key='CHECKBOX_70031539084410860_LABEL'])[3]")
    public WebElementFacade checkbox1;
    @FindBy(how = How.XPATH,using = "(//label[@data-translation-key='MULTICHOICE_109350074984747230_CHOICES_B326B5062B2F0E69046810717534CB09'])[2]")
    public WebElementFacade checkbox2;
    @FindBy(how = How.XPATH,using = "(//input[@class='gigya-input-submit hc-register-screen-submit invi'])[2]")
    public WebElementFacade bttRegistrar;

}


