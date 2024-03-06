package pages;

import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String email_xpath = "// div[1] / form[1] / descendant :: input[@type='email']";
    public static String password_xpath = "// div[2] / div[1] / input[@type='password']";
    public static String acessar_xpath = "//button[text()='Acessar']";
    public static String registrar_xpath = "//button[text()='Registrar']";
}
