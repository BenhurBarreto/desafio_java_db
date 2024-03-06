package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {
    public static String email_xpath = "// div[2] / form[1] / descendant :: input[@type='email']";
    public static String nome_xpath = "//input[@type='name']";
    public static String password_xpath = "// div[4] / div / input[@type='password']";
    public static String password_confirmation_xpath = "// div[5] / div / input[@type='password']";
    public static String saldo_xpath = "//label[@id='toggleAddBalance']";
    public static String cadastrar_xpath = "//button[text()='Cadastrar']";
    public static String voltar_xpath = "//a[@id='btnBackButton']";
    public static void sendkeys_email(String email){
        driver.findElement(By.xpath(email_xpath)).sendKeys(email);
    }
    public static void sendkeys_nome(String nome){
        driver.findElement(By.xpath(nome_xpath)).sendKeys(nome);
    }
    public static void sendkeys_password(String password){
        driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }
    public static void sendkeys_password_confirmation(String password){
        driver.findElement(By.xpath(password_confirmation_xpath)).sendKeys(password);
    }
    public static void click_saldo(){
        driver.findElement(By.xpath(saldo_xpath)).click();
    }
    public static void click_cadastrar(){
        driver.findElement(By.xpath(cadastrar_xpath)).click();
    }
    public static void click_voltar(){
        driver.findElement(By.xpath(voltar_xpath)).click();
    }
}
