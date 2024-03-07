package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class TransferPage extends BrowserDriver {
    public static String num_conta_xpath = "//input[@type='accountNumber']";
    public static String digito_conta_xpath = "//input[@type='digit']";
    public static String valor_xpath = "//input[@type='transferValue']";
    public static String descricao_xpath = "//input[@type='description']";
    public static String transferir_agora_xpath = "//button[text()='Transferir agora']";
    public static String sair_xpath = "//a[@id='btnExit']";
    public static String voltar_xpath = "//a[@id='btnBack']";
    public static void sendkeys_num_conta(String num_conta){
        driver.findElement(By.xpath(num_conta_xpath)).sendKeys(num_conta);
    }
    public static void sendkeys_digito_conta(String digito_conta){
        driver.findElement(By.xpath(digito_conta_xpath)).sendKeys(digito_conta);
    }
    public static void sendkeys_valor(String valor){
        driver.findElement(By.xpath(valor_xpath)).sendKeys(valor);
    }
    public static void sendkeys_descricao(String descricao){
        driver.findElement(By.xpath(descricao_xpath)).sendKeys(descricao);
    }
    public static void click_transferir_agora(){
        driver.findElement(By.xpath(transferir_agora_xpath)).click();
    }
    public static void click_sair(){
        driver.findElement(By.xpath(sair_xpath)).click();
    }
    public static void click_voltar(){
        driver.findElement(By.xpath(voltar_xpath)).click();
    }
}
