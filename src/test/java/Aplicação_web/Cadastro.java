package Aplicação_web;

import Pages.Cadastro.CadastroPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cadastro {


    static WebDriver driver;
    static CadastroPage cadastro;
    static Object preenchimentoCadatroXpath;

    public void cadastro(WebDriver driver){
         this.driver = driver;
     }

    @Before
    public void setCadastroPage() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://triosdecapacitacao.eadplataforma.com/cadastro/");

    }
    @Test
    public void teste(){
        CadastroPage c;
        c = new CadastroPage(driver);
        c.preenchimentoCadatroXpath(driver);
    }

}
