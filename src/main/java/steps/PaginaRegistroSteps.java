package steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import pageObjectModel.RegistroPage;
import utils.Data;

public class PaginaRegistroSteps {
    @Page
    RegistroPage registroPage;

    @Step
    public void registroFormulario(){
        registroPage.emailRegistro.sendKeys(Data.extractTo().get(0).get("Usuario"));
        registroPage.inputNombre.sendKeys(Data.extractTo().get(0).get("Nombre"));
        registroPage.inputApellido.sendKeys(Data.extractTo().get(0).get("Apellido"));
        registroPage.inputPass.sendKeys(Data.extractTo().get(0).get("Password"));
        registroPage.inputPassCon.sendKeys(Data.extractTo().get(0).get("Password"));
        JavascriptExecutor js = (JavascriptExecutor) registroPage.getDriver();
        js.executeScript("arguments[0].click();", registroPage.checkbox1);
        registroPage.checkbox2.click();
        registroPage.bttRegistrar.click();

    }

}
