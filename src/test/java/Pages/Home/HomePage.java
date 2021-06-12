package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void homeXpath(WebDriver driver) {
        /*
        WebElement h1 = driver.findElement(By.partialLinkText("PLANO TESTES FUNCIONAIS WEB E MOBILE"));
        h1.click();
        */
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
        try{
            Thread.sleep(300);
            for (String winHandle:driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/planos-testes-automatizados/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional-api/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-web-mobile/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-mobile-ios/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-api/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-automatizados-swe/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-api-rest/");
            driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-automatizado-api-postman/");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
//precisa de um click na logo para ser direcionado novamente para home
    WebElement pesquisa = driver.findElement(By.id("searchtext"));
    pesquisa.sendKeys("teste funcional web");

    WebElement lupa = driver.findElement(By.id("btn_form_search"));
    lupa.click();

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
        try {
            Thread.sleep(300);
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            //combo de testes funcionais
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-38-04/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/21/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-38-04-2020-12-15-23-54-43/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/22/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-33-37/");
            //saiba mais está duplicado porque consta esgotado direcionando pro mesmo lugar
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-33-37/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-api-2020-12-15-22-29-10/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/19/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-api-2020-12-15-22-29-10-2021-02-07-08-26-35/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/42/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-api-2020-12-15-22-29-10-2021-02-07-08-15-38/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/41/");

            //combo de testes automatizados

            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/6/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-10-11-20-29-32/");
            //matricule se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/15/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-10-11-20-29-32/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/15/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-12-16-00-48-48/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/23/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-10-11-20-29-32-2020/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/24/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-12-16-00-56-04/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/25/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-soapui-2020-12-16-00-58-01/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/26/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-swagger-2020-12-16-00-59-39/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/27/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-rest-assured-2020-12-16-01-02-08/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/api-postman-2020-12-16-01-03-42/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/29/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/api-postman-2020-12-16-01-06-34/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/30/");
            //saiba mais
            driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-api-karate/");
            //matricule-se
            driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/17/");

            //testes funcionais




        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}