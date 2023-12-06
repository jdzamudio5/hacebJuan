package steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import pageObjectModel.RegistroFinalPage;
import utils.Data;

import static utils.Selects.select;

public class RegistroFinalSteps {
    @Page
    RegistroFinalPage registroFinalPage;

    @Step
    public void registroFinal(){
        registroFinalPage.inputCedula.sendKeys(Data.extractTo().get(0).get("Cedula"));
        select(registroFinalPage.selectGenero,Data.extractTo().get(0).get("Genero"));
        registroFinalPage.inputFechaNa.sendKeys(Data.extractTo().get(0).get("FechaNacimiento"));
        select(registroFinalPage.selectPais,Data.extractTo().get(0).get("Codigo pais"));
        registroFinalPage.inputTel.sendKeys(Data.extractTo().get(0).get("Telefono"));
        select(registroFinalPage.selectDepartamento,Data.extractTo().get(0).get("Departamento"));
        select(registroFinalPage.selectCiudad,Data.extractTo().get(0).get("Ciudad"));
        registroFinalPage.inputEnviar.click();
    }
    @Step("Paso entre ventanas")
    public void pasoVentanas(){
        for (String windowHandle : registroFinalPage.getDriver().getWindowHandles()) {
            if(!registroFinalPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                registroFinalPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }

}
