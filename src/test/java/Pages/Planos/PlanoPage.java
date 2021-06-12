package Pages.Planos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlanoPage {
    static WebDriver driver;

    public PlanoPage(WebDriver driver){
        this.driver = driver;
    }
    public void PlanoXpath(){



        WebElement nome = driver.findElement(By.xpath("id=nome"));
        nome.sendKeys("Trios de Capacitação");//colocar nome

    }
}
