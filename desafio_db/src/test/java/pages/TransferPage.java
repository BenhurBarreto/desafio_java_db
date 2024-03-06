package pages;

import utility.BrowserDriver;

public class TransferPage extends BrowserDriver {
    public static String num_conta_xpath = "//input[@type='accountNumber']";
    public static String digito_conta_xpath = "//input[@type='digit']";
    public static String valor_xpath = "//input[@type='transferValue']";
    public static String descricao_xpath = "//input[@type='description']";
    public static String transferir_agora_xpath = "//button[text()='Transferir agora']";
    public static String sair_xpath = "//a[@id='btnExit']";
    public static String voltar_xpath = "//a[@id='btnBack']";
}
