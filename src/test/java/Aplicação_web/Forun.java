package Aplicação_web;

import Pages.Forum.ForumPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Forun {
    static WebDriver driver;

    //
    public void Forun(WebDriver driver) {
        Aplicação_web.Home.driver = driver;
    }

    @Before
    public void setHomePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
    }
    @Test
    public void Test()throws InterruptedException{
        ForumPage f = new ForumPage(driver);
        f.forumXpath(driver);
    }

}
