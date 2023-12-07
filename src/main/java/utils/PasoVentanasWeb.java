package utils;

import org.openqa.selenium.WebDriver;

public class PasoVentanasWeb {
    public static void pasoVentanasWeb(WebDriver webDriver){
        for (String windowHandle : webDriver.getWindowHandles()) {
            if(!webDriver.getWindowHandle().contentEquals(windowHandle)) {
                webDriver.switchTo().window(windowHandle);
                break;
            }
        }

    }

}
