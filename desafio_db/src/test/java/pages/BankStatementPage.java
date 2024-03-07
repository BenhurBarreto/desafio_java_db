package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class BankStatementPage extends BrowserDriver {
    public static String sair_xpath = "//a[@id='btnExit']";
    public static String voltar_xpath = "//a[@id='btnBack']";
    public static String saldo_xpath = "//p[text()='Saldo disponível']";
    public static void click_sair(){
        driver.findElement(By.xpath(sair_xpath)).click();
    }
    public static void click_voltar(){
        driver.findElement(By.xpath(voltar_xpath)).click();
    }
}
