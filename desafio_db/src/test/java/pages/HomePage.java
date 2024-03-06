package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String transferencia_xpath = "//a[@id='btn-TRANSFERÊNCIA']";
    public static String pagamentos_xpath = "//a[@id='btn-PAGAMENTOS']";
    public static String extrato_xpath = "//a[@id='btn-EXTRATO']";
    public static String saque_xpath = "//a[@id='btn-SAQUE']";
    public static String sair_xpath = "//a[@id='btnExit']";
    public static void click_transferencia(){
        driver.findElement(By.xpath(transferencia_xpath)).click();
    }
    public static void click_pagamentos(){
        driver.findElement(By.xpath(pagamentos_xpath)).click();
    }
    public static void click_extrato(){
        driver.findElement(By.xpath(extrato_xpath)).click();
    }
    public static void click_saque(){
        driver.findElement(By.xpath(saque_xpath)).click();
    }
    public static void click_sair(){
        driver.findElement(By.xpath(sair_xpath)).click();
    }
}
