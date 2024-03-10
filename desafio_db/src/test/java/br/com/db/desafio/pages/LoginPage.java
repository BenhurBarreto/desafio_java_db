package br.com.db.desafio.pages;

import br.com.db.desafio.utility.BrowserDriverManger;
import br.com.db.desafio.utility.WaitFor;
import org.openqa.selenium.By;

import static br.com.db.desafio.pages.HomePage.transferencia_xpath;

public class LoginPage extends BrowserDriverManger {
    public static String email_xpath = "// div[1] / form[1] / descendant :: input[@type='email']";
    public static String password_xpath = "// div[2] / div[1] / input[@type='password']";
    public static String acessar_xpath = "//button[text()='Acessar']";
    public static String registrar_xpath = "//button[text()='Registrar']";

    public static void sendkeys_email(String email) {
        driver.findElement(By.xpath(email_xpath)).sendKeys(email);
    }

    public static void sendkeys_password(String password) {
        driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }

    public static void click_acessar() {
        driver.findElement(By.xpath(acessar_xpath)).click();
    }

    public static void click_registrar() {
        driver.findElement(By.xpath(registrar_xpath)).click();
    }

    public static void realiza_login(String email, String password) {
        sendkeys_email(email);
        sendkeys_password(password);
        click_acessar();
        WaitFor.visibilityOfElementLocated(By.xpath(transferencia_xpath));
    }
}
