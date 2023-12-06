package utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;

public class PopUp {
    public static void popUp(WebElementFacade webElementFacade){
        try{
            boolean visible = webElementFacade.isDisplayed();
            if(visible){
                webElementFacade.click();
            }
        }catch (NoSuchElementException ignored){
        }
    }
}
