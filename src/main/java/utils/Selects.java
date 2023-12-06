package utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;

public class Selects {
    public static void select(WebElementFacade webElementFacade, String data){
        Select select = new Select(webElementFacade);
        select.selectByVisibleText(data);

    }
}
