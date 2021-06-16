package Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlanoTestFuncWebMobcheckout {
    static WebDriver driver;


    public PlanoTestFuncWebMobcheckout(WebDriver driver){
        this.driver = driver;
    }

    public void PlanoTestFuncWebMobcheckoutXpath(WebDriver driver) {
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/");

        //aplicando cupom de desconto
        WebElement desc = driver.findElement(By.id("desconto"));
        desc.sendKeys("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/");
        WebElement aplicar = driver.findElement(By.id("btn_form_cupom"));
        aplicar.click();
        driver.navigate().back();

        //clicando no botao concluir pedido
        JavascriptExecutor ident = (JavascriptExecutor)driver;
        ident.executeScript("document.getElementById('concluir_pedido').click();");
        driver.navigate().back();

    }
}
