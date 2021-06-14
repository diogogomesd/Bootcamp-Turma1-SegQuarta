package Pages.Home;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Teste {
    static WebDriver driver;
    public Teste(WebDriver driver){
        this.driver = driver;

    }

    public void TesteXpath(WebDriver driver) {
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-funcional/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/1/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('concluir_pedido').click();");
    }
}
