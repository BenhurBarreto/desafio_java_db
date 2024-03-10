package br.com.db.desafio.pages;

import br.com.db.desafio.utility.BrowserDriverManger;
import br.com.db.desafio.utility.WaitFor;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.ArrayList;

public class TransferPage extends BrowserDriverManger {
    public static String num_conta_xpath = "//input[@type='accountNumber']";
    public static String digito_conta_xpath = "//input[@type='digit']";
    public static String valor_xpath = "//input[@type='transferValue']";
    public static String descricao_xpath = "//input[@type='description']";
    public static String transferir_agora_xpath = "//button[text()='Transferir agora']";
    public static String sair_xpath = "//a[@id='btnExit']";
    public static String voltar_xpath = "//a[@id='btnBack']";
    public static String modal_mensagem = "//p[@id='modalText']";

    public static void sendkeys_num_conta(String num_conta) {
        driver.findElement(By.xpath(num_conta_xpath)).sendKeys(num_conta);
    }

    public static void sendkeys_digito_conta(String digito_conta) {
        driver.findElement(By.xpath(digito_conta_xpath)).sendKeys(digito_conta);
    }

    public static void sendkeys_valor(String valor) {
        driver.findElement(By.xpath(valor_xpath)).sendKeys(valor);
    }

    public static void sendkeys_descricao(String descricao) {
        driver.findElement(By.xpath(descricao_xpath)).sendKeys(descricao);
    }

    public static void click_transferir_agora() {
        driver.findElement(By.xpath(transferir_agora_xpath)).click();
    }

    public static void click_sair() {
        driver.findElement(By.xpath(sair_xpath)).click();
    }

    public static void click_transferencia_voltar() {
        driver.findElement(By.xpath(voltar_xpath)).click();
    }

    public static String get_mensagem() {
        try {
            return driver.findElement(By.xpath(modal_mensagem)).getText();
        } catch (NoSuchElementException e) {
            System.out.println("Não foi possível encontrar a mensagem de confirmação de transferência.");
            System.out.println("O erro encontrado foi este: \n" + e);
            return null;
        }
    }

    public static void click_modal_transferencia_fechar() {
        driver.findElement(By.xpath(RegistrationPage.modal_botao_fechar)).click();
    }

    public static void realiza_transferencia(ArrayList<String> conta, String valor_transferencia) {
        WaitFor.visibilityOfElementLocated(By.xpath(transferir_agora_xpath));
        sendkeys_num_conta(conta.get(0));
        sendkeys_digito_conta(conta.get(1));
        sendkeys_valor(valor_transferencia);
        click_transferir_agora();
        WaitFor.visibilityOfElementLocated(By.xpath(modal_mensagem));
        Assert.assertEquals("Transferencia realizada com sucesso", get_mensagem());
        click_modal_transferencia_fechar();
    }
}
