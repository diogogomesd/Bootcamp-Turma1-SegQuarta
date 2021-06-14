package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void homeXpath(WebDriver driver) throws InterruptedException {


        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/planos-testes-automatizados/");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional-api/");
        driver.navigate().back();
        //Thread.sleep(3000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-web-mobile/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-mobile-ios/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-api/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-automatizados-swe/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-testes-automatizados-api-rest/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-automatizado-api-postman/");


        //precisa de um click na logo para ser direcionado novamente para home
        WebElement pesquisa = driver.findElement(By.id("searchtext"));
        pesquisa.sendKeys("teste funcional web");

        WebElement lupa = driver.findElement(By.id("btn_form_search"));
        lupa.click();



        //combo de testes funcionais
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-38-04/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/21/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-38-04-2020-12-15-23-54-43/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/22/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-33-37/");
            //saiba mais está duplicado porque consta esgotado direcionando pro mesmo lugar
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2020-12-15-22-33-37/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-api-2020-12-15-22-29-10/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/19/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-api-2020-12-15-22-29-10-2021-02-07-08-26-35/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/42/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-api-2020-12-15-22-29-10-2021-02-07-08-15-38/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/41/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

            //testes automatizados

            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/6/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-10-11-20-29-32/");
            //matricule se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/15/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-10-11-20-29-32/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/15/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-12-16-00-48-48/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/23/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-10-11-20-29-32-2020/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/24/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-10-11-20-08-28-2020-12-16-00-56-04/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/25/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-soapui-2020-12-16-00-58-01/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/26/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-swagger-2020-12-16-00-59-39/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/27/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-rest-assured-2020-12-16-01-02-08/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/api-postman-2020-12-16-01-03-42/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/29/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/api-postman-2020-12-16-01-06-34/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/30/");
            //saiba mais
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-api-karate/");
            //matricule-se
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/17/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

            //testes funcionais
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/metodologia-agil-bdd-cucumber-ghenki/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/5/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2021-01-31-14-44-24-2021-02-07-10-09-22-2/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/45/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2021-01-31-14-44-24-2021-02-07-10-09-22/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/44/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-api-2020-12-15-22-29-10-2021-02-07-08-15-38-2021-02-07/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/43/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile-2021-01-31-14-44-24/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/40/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-swagger/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/10/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-soapui/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/9/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
            //esgotado

        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/api-postman/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/api-postman/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-api-karate-2021-02-07-10-26-19/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/46/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/api-postman-2021-06-07-10-56-58/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/49/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

            //combo de testes automatizados

        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/testes-automatizados-web-mobile-api/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/35/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/testes-automatizados-web-mobile/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/33/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/testes-automatizados-de-web-api/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/39/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-12-16-00-48-48-2020-12-16-01-11-52/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/31/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-12-16-00-48-48-2020-12-16-01-11-52-2020/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/32/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/testes-automatizados-de-mobile-api/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/course/38/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        WebElement cadEmail = driver.findElement(By.cssSelector("#email_news"));
        cadEmail.sendKeys("diogo1@gmail.com");
        WebElement cad = driver.findElement(By.cssSelector("#btn_register_news"));
        cad.click();
        Thread.sleep(5000);

        driver.get("https://triosdecapacitacao.eadplataforma.com/tel:+5519998855989");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://api.whatsapp.com/send?1=pt_BR&phone=5519998855989");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://triosdecapacitacao.eadplataforma.com/#contato");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://triosdecapacitacao.eadplataforma.com/#politica-privacidade");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://triosdecapacitacao.eadplataforma.com/certificado/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://facebook.com/eadplataforma");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://youtube.com/eadplataforma");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://instagram.com/eadplataforma");


        driver.get("https://www.facebook.com/eadplataforma/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");

        driver.get("https://www.facebook.com/sharer/sharer.php?app_id=776730922422337&u=https%3A%2F%2Fwww.facebook.com%2Feadplataforma%2F&display=popup&ref=plugin&src=page");
        driver.get("https://triosdecapacitacao.eadplataforma.com/");
    }

}