package utils;
/*
 * @(#) Esperas.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Esperas {

    public static void espera1(WebDriver webDriver, WebElementFacade webElementFacade){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(
                ExpectedConditions.elementToBeClickable(webElementFacade)
        );

    }
    public static void espera2(){



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
