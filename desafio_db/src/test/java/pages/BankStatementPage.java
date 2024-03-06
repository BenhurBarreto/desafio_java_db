package pages;

import utility.BrowserDriver;

public class BankStatementPage extends BrowserDriver {
    public static String sair_xpath = "//a[@id='btnExit']";
    public static String voltar_xpath = "//a[@id='btnBack']";
    public static String saldo_xpath = "//p[text()='Saldo disponível']";
}
