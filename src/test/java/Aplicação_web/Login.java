package Aplicação_web;

import Pages.Login.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Login {

        static WebDriver driver;

        //
        public void Login(WebDriver driver) {
            Aplicação_web.Login.driver = driver;
        }

        @Before
        public void setLoginPage() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
            driver.manage().window().setSize(dim);
            driver.get("https://triosdecapacitacao.eadplataforma.com/login/");
        }
        @Test
    public void Test()throws InterruptedException{
            LoginPage l = new LoginPage(driver);
            l.setLoginPageXpath(driver);
        }
}
