package Aplicação_web;

import Pages.Home.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
    static WebDriver driver;

    //
    public void Home(WebDriver driver) {
        Aplicação_web.Home.driver = driver;
    }

    @Before
    public void setHomePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
    }

    @Test

    public void Test() throws InterruptedException {
        HomePage h = new HomePage(driver);
        h.homeXpath(driver);

    }
//plano de testes automatizados web e mobile
    @Test
    public void Test1() throws InterruptedException {
        PlanoTestFuncWebMob h1 = new PlanoTestFuncWebMob(driver);
        h1.PlanoTestFuncWebMobXpath(driver);

    }
//plano de testes automatizados web (com javascript) em desenvolvimento no memento
    @Test
    public void Test2() throws InterruptedException {
        PlanoTestAoutoWeb h2 = new PlanoTestAoutoWeb(driver);
        h2.PlanoTestAoutoWebXpath(driver);
    }

    @Test
    public void Test3() throws InterruptedException {
        PlaTestFuncWebServApiPost h3 = new PlaTestFuncWebServApiPost(driver);
        h3.PlaTestFuncWebServApiPostXpath(driver);
    }

    @Test
    public void Test4() throws InterruptedException {
        PlaTestAutMobAnd h4 = new PlaTestAutMobAnd(driver);
        h4.PlaTestAutMobAndXpath(driver);

    }

    @Test
    public void Test5() throws InterruptedException {
        PlaTestAutMobIos h5 = new PlaTestAutMobIos(driver);
        h5.PlaTestAutMobIosXpath(driver);
    }

    @Test
    public void Test6() throws InterruptedException {
        PlaTestAutMobApiSoap h6 = new PlaTestAutMobApiSoap(driver);
        h6.PlaTestAutMobSoapXpath(driver);
    }
    @Test
    public void Test7() throws InterruptedException {
        PlaTestAutApiSw h7 = new PlaTestAutApiSw(driver);
        h7.PlaTestAutApiSwXpath(driver);
    }
    @Test
    public void Test8() throws InterruptedException {
        PlaTestAutApiRestAssu h8 = new PlaTestAutApiRestAssu(driver);
        h8.PlaTestAutApiRestAssuXpath(driver);
    }
    @Test
    public void Test9() throws InterruptedException {
        PlaTestAutApiPost h9 = new  PlaTestAutApiPost(driver);
        h9. PlaTestAutApiPostXpath(driver);
    }
    @Test
    public void Test10() throws InterruptedException {
        Teste h9 = new  Teste(driver);
        h9. TesteXpath(driver);
    }
}