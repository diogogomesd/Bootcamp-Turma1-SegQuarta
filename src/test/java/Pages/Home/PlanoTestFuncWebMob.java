package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlanoTestFuncWebMob {

    public WebDriver driver;


    public PlanoTestFuncWebMob(WebDriver driver){
        this.driver = driver;

    }


    public void PlanoTestFuncWebMobXpath(WebDriver driver) throws InterruptedException{

        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/");
        Thread.sleep(5000);
        WebElement desc = driver.findElement(By.id("desconto"));
        desc.sendKeys("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/");
        WebElement btn = driver.findElement(By.id("btn_form_cupom"));
        btn.click();
        Thread.sleep(5000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/#");
        Thread.sleep(3000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/#carrinho");
        Thread.sleep(3000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/#identificacao");
        Thread.sleep(3000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/#endereco");
        Thread.sleep(3000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/#contrato");
        Thread.sleep(3000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/#pagamento");
        Thread.sleep(3000);
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/#sucesso");
        Thread.sleep(5000);

/*
        WebElement log = driver.findElement(By.id("email_login"));
        log.sendKeys("diogogomes467@gmail.com");
        WebElement pass = driver.findElement(By.id("senha_login"));
        pass.sendKeys("d2g6s9");
        Thread.sleep(5000);


        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/tel:+5519998855989");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://api.whatsapp.com/send?1=pt_BR&phone=5519998855989");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/#contato");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/#politica-privacidade");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/certificado/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://facebook.com/eadplataforma");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://youtube.com/eadplataforma");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://instagram.com/eadplataforma");
        driver.get("https://www.facebook.com/eadplataforma/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://www.facebook.com/sharer/sharer.php?app_id=776730922422337&u=https%3A%2F%2Fwww.facebook.com%2Feadplataforma%2F&display=popup&ref=plugin&src=page");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
*/
    }
}
