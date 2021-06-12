package Aplicação_web;

import Pages.Home.HomePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
    static WebDriver driver;
    static HomePage Home;
    static Object homeXpath;


    public void Home(WebDriver driver) {
        Aplicação_web.Home.driver = driver;
    }

    @Before
    public void setHomePage() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
    }

        @Test

        public void Test () {
            HomePage h = new HomePage(driver);
            h.homeXpath(driver);
        }
    }