package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-funcional-aplicacao-web-e-mobile/");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/");
        driver.navigate().back();

        //rodapé inicio
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/tel:+5519998855989");
        driver.navigate().back();
        driver.get("https://api.whatsapp.com/send?1=pt_BR&phone=5519998855989");
        driver.navigate().back();

        //abre o modal de contato do rodapé
        WebElement contato = driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/ul/li[1]/a"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", contato);
        driver.navigate().back();

        //abre modal de politica de privacidade
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/#politica-privacidade");
        driver.navigate().back();

        //abre pg de certificados
        driver.get("https://triosdecapacitacao.eadplataforma.com/certificado/");
        driver.navigate().back();
        driver.close();




    }
}
