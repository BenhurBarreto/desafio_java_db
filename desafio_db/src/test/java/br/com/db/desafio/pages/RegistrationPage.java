package br.com.db.desafio.pages;

import br.com.db.desafio.utility.BrowserDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationPage extends BrowserDriver {
    public static String email_xpath = "// div[2] / form[1] / descendant :: input[@type='email']";
    public static String nome_xpath = "//input[@type='name']";
    public static String password_xpath = "// div[4] / div / input[@type='password']";
    public static String password_confirmation_xpath = "// div[5] / div / input[@type='password']";
    public static String saldo_xpath = "//label[@id='toggleAddBalance']";
    public static String cadastrar_xpath = "//button[text()='Cadastrar']";
    public static String voltar_xpath = "//a[@id='btnBackButton']";
    public static String modal_conta_criada = "//p[@id='modalText']";
    public static String modal_botao_fechar = "//a[text()='Fechar']";

    public static void sendkeys_email_registration(String email) {
        driver.findElement(By.xpath(email_xpath)).clear();
        driver.findElement(By.xpath(email_xpath)).sendKeys(email);
    }

    public static void sendkeys_nome_registration(String nome) {
        driver.findElement(By.xpath(nome_xpath)).clear();
        driver.findElement(By.xpath(nome_xpath)).sendKeys(nome);
    }

    public static void sendkeys_password_registration(String password) {
        driver.findElement(By.xpath(password_xpath)).clear();
        driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }

    public static void sendkeys_password_confirmation(String password) {
        driver.findElement(By.xpath(password_confirmation_xpath)).clear();
        driver.findElement(By.xpath(password_confirmation_xpath)).sendKeys(password);
    }

    public static void click_saldo() {
        driver.findElement(By.xpath(saldo_xpath)).click();
    }

    public static void click_cadastrar() {
        driver.findElement(By.xpath(cadastrar_xpath)).click();
    }

    public static void click_voltar() {
        driver.findElement(By.xpath(voltar_xpath)).click();
    }

    public static ArrayList<String> get_conta_modal() {
        String mensagem_conta_criada = driver.findElement(By.xpath(modal_conta_criada)).getText();

        Pattern padrao = Pattern.compile("A conta (\\d+)-(\\d+) foi criada com sucesso");
        Matcher matcher = padrao.matcher(mensagem_conta_criada);

        ArrayList<String> valores = null;
        if (matcher.find()) {
            String conta = matcher.group(1);
            String digito = matcher.group(2);

            valores = new ArrayList<>();
            valores.add(conta);
            valores.add(digito);

            System.out.println("Conta: " + conta);
            System.out.println("Dígito: " + digito);
        } else {
            System.out.println("Não foi possível encontrar a conta e o dígito na mensagem.");
        }
        return valores;
    }

    public static void click_modal_botao_fechar() {
        driver.findElement(By.xpath(modal_botao_fechar)).click();
    }
}
