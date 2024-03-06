package pages;

import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {
    public static String email_xpath = "// div[2] / form[1] / descendant :: input[@type='email']";
    public static String nome_xpath = "//input[@type='name']";
    public static String password_xpath = "// div[4] / div / input[@type='password']";
    public static String password_confirmation_xpath = "// div[5] / div / input[@type='password']";
    public static String saldo_xpath = "//label[@id='toggleAddBalance']";
    public static String cadastrar_xpath = "//button[text()='Cadastrar']";
    public static String voltar_xpath = "//a[@id='btnBackButton']";
}
