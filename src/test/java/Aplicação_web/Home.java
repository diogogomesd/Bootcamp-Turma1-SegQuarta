package Aplicação_web;

import Pages.Home.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.time.Duration.ofSeconds;

public class Home {
    static WebDriver driver;

        //
        public void Home(WebDriver driver) {
            Aplicação_web.Home.driver = driver;
        }

        @Before
        public void setHomePage() {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(ofSeconds(10));
            driver.get("https://triosdecapacitacao.eadplataforma.com/");
    }

    @Test

    public void Test() throws InterruptedException {
        HomePage h = new HomePage(driver);
        h.homeXpath(driver);

    }
//plano de testes automatizados web e mobile(pronto)
    @Test
    public void TestPlanoTestFuncWebMob() throws InterruptedException {
        PlanoTestFuncWebMob h1 = new PlanoTestFuncWebMob(driver);
        h1.PlanoTestFuncWebMobXpath(driver);

    }
    //plano de testes automatizados web e mobile checkout(em desenvolvimento)
    @Test
    public void TestPlanoTestFuncWebMobcheckout()throws InterruptedException{
        PlanoTestFuncWebMobcheckout h01 = new PlanoTestFuncWebMobcheckout(driver);
        h01.PlanoTestFuncWebMobcheckoutXpath(driver);
    }


//plano de testes automatizados web
    @Test
    public void Test2()  {
        PlanoTestAoutoWeb h2 = new PlanoTestAoutoWeb(driver);
        h2.PlanoTestAoutoWebXpath(driver);
    }

    @Test
    public void Test3()  {
        PlaTestFuncWebServApiPost h3 = new PlaTestFuncWebServApiPost(driver);
        h3.PlaTestFuncWebServApiPostXpath(driver);
    }

    @Test
    public void Test4()  {
        PlaTestAutMobAnd h4 = new PlaTestAutMobAnd(driver);
        h4.PlaTestAutMobAndXpath(driver);

    }

    @Test
    public void Test5()  {
        PlaTestAutMobIos h5 = new PlaTestAutMobIos(driver);
        h5.PlaTestAutMobIosXpath(driver);
    }

    @Test
    public void Test6()  {
        PlaTestAutMobApiSoap h6 = new PlaTestAutMobApiSoap(driver);
        h6.PlaTestAutMobSoapXpath(driver);
    }
    @Test
    public void Test7()  {
        PlaTestAutApiSw h7 = new PlaTestAutApiSw(driver);
        h7.PlaTestAutApiSwXpath(driver);
    }
    @Test
    public void Test8()  {
        PlaTestAutApiRestAssu h8 = new PlaTestAutApiRestAssu(driver);
        h8.PlaTestAutApiRestAssuXpath(driver);
    }
    @Test
    public void Test9()  {
        PlaTestAutApiPost h9 = new  PlaTestAutApiPost(driver);
        h9. PlaTestAutApiPostXpath(driver);
    }
    @Test
    public void Test10()  {
        Teste h9 = new  Teste(driver);
        h9. TesteXpath(driver);
    }

}