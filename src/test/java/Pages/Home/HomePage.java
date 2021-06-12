package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    static WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }
    public void homeXpath(){

        WebElement iconeTrios = driver.findElement(By.linkText("class=navbar-brand"));
        iconeTrios.click();

        WebElement home  = driver.findElement(By.linkText("HOME"));
        home.click();

        WebElement blog  = driver.findElement(By.linkText("BLOG"));
        blog.click();

        WebElement sobre  = driver.findElement(By.linkText("SOBRE NÒS"));
        sobre.click();

        WebElement treinamento  = driver.findElement(By.linkText("TREINAMENTOS ONLINE"));
        treinamento.click();

        WebElement empresa  = driver.findElement(By.linkText("EMPRESA"));
        empresa.click();

        WebElement contato  = driver.findElement(By.linkText("CONTATO"));
        contato.click();

        WebElement entrar  = driver.findElement(By.linkText("menu_entrar"));
        entrar.click();

        WebElement cadastre  = driver.findElement(By.linkText("btn-custom custom1"));
        cadastre.click();

        WebElement saibamais  = driver.findElement(By.linkText("btn-custom custom2"));
        saibamais.click();

        WebElement t1  = driver.findElement(
                        By.linkText("TESTE FUNCIONAL API KARATE (ABRIL/2021) "));
        t1.click();

        WebElement t2  = driver.findElement(
                    By.linkText("TESTE FUNCIONAL DE API POSTMAN (ABRIL/2021)"));
        t2.click();

        WebElement t3  = driver.findElement(
                       By.linkText("TESTE FUNCIONAL DE API REST ASSURED (ABRIL/2021)"));
        t3.click();
        WebElement t4  = driver.findElement(
                        By.linkText("TESTE FUNCIONAL DE API SOAPUI (ABRIL/2021)"));
        t4.click();
        WebElement t5  = driver.findElement(
                         By.linkText("TESTE FUNCIONAL DE API SWAGGER (ABRIL/2021)"));
        t5.click();
        WebElement t6  = driver.findElement(
                         By.linkText("TESTE FUNCIONAL MOBILE (ABRIL/2021)"));
        t6.click();
        WebElement t7  = driver.findElement(
                         By.linkText("TESTE FUNCIONAL WEB (ABRIL/2021)"));
        t7.click();
        WebElement t8  = driver.findElement(
                         By.linkText("TESTE FUNCIONAl DE API REST ASSURED (ABRIL/2021)"));
        t8.click();
        WebElement t9  = driver.findElement(
                         By.linkText("TESTES FUNCIONAIS WEB E MOBILE (ABRIL/2021)"));
        t9.click();
        WebElement t10  = driver.findElement(
                         By.linkText("TESTES FUNCIONAIS WEB E MOBILE (JANEIRO/2021) "));
        t10.click();




    }

}
