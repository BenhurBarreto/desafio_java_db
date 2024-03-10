package br.com.db.desafio.pages;

import br.com.db.desafio.utility.BrowserDriverManger;
import br.com.db.desafio.utility.WaitFor;
import org.junit.Assert;
import org.openqa.selenium.By;

import static br.com.db.desafio.pages.HomePage.click_extrato;
import static br.com.db.desafio.pages.HomePage.extrato_xpath;

public class BankStatementPage extends BrowserDriverManger {
    public static String sair_xpath = "//a[@id='btnExit']";
    public static String voltar_xpath = "//a[@id='btnBack']";
    public static String texto_saldo_xpath = "//p[text()='Saldo disponível']";
    public static String valor_transferido_xpath = "//p[contains(text(),'{VALOR},')]";
    public static void click_sair_bank_statement(){
        driver.findElement(By.xpath(sair_xpath)).click();
    }
    public static void click_voltar(){
        driver.findElement(By.xpath(voltar_xpath)).click();
    }

    public static Boolean verifica_transferencia(String valor) {
        String valor_coletado = driver.findElement(
                By.xpath(valor_transferido_xpath.replace("{VALOR}", valor))).getText();
        valor = "-R$ " + valor + ",00";
        return valor.equals(valor_coletado);
    }

    public static void verifica_extrato(String valor_transferencia) {
        WaitFor.visibilityOfElementLocated(By.xpath(extrato_xpath));
        click_extrato();
        WaitFor.visibilityOfElementLocated(By.xpath(texto_saldo_xpath));
        Assert.assertEquals(verifica_transferencia(valor_transferencia), true);
    }
}
