package utils;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class Hover {
    public static void Interaction(WebDriver webDriver, WebElement webElement) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement).perform();
    }
}
