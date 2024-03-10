package br.com.db.desafio.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor extends BrowserDriverManger {

    public static void visibilityOfElementLocated(By locator) {
        WebElement status = null;
        try {
            status = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            System.out.println("Elemento não encontrado dentro do tempo limite.");
            System.out.println(status.getClass());
            throw e;
        }
    }
}
