package br.com.db.desafio.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserDriverManger {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static ChromeOptions options;

    public BrowserDriverManger(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://bugbank.netlify.app/");
    }

    public void close(){
        driver.close();
    }
}
