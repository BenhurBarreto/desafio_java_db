package br.com.db.desafio.pages;

import br.com.db.desafio.utility.BrowserDriver;
import org.openqa.selenium.By;

public class BankStatementPage extends BrowserDriver {
    public static String sair_xpath = "//a[@id='btnExit']";
    public static String voltar_xpath = "//a[@id='btnBack']";
    public static String texto_saldo_xpath = "//p[text()='Saldo disponível']";
    public static String valor_transferido_xpath = "//p[contains(text(),'{VALOR}')]";
    public static void click_sair_bank_statement(){
        driver.findElement(By.xpath(sair_xpath)).click();
    }
    public static void click_voltar(){
        driver.findElement(By.xpath(voltar_xpath)).click();
    }

    public static Boolean verifica_transferencia(String valor) {
//        String valor_referencia = String.valueOf(valor);
//        valor_referencia = valor_referencia.replace(".", ",");
//        System.out.println((int) 20);
//        System.out.println(valor_referencia);
        String valor_coletado = driver.findElement(
                By.xpath(
                        valor_transferido_xpath.replace("{VALOR}", valor)
                )).getText();
        valor = "-R$ " + valor + ",00";
//        System.out.println(valor);
//        System.out.println(valor_coletado);
        return valor.equals(valor_coletado);
    }
}
