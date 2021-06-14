package Pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginPageXpath(WebDriver driver) {

        WebElement nome = driver.findElement(By.id("email"));
        nome.sendKeys("manoel@gmail.com");//colocar email valido
        WebElement senha = driver.findElement(By.id("senha"));
        senha.sendKeys("12345");//colocar senha valida
        WebElement entrar = driver.findElement(By.id("btn_login"));
        entrar.click();
        WebElement box = driver.findElement(By.name("remember"));
        box.click();

    }
}