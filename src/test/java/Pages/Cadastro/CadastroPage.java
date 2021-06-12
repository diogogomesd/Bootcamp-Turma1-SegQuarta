package Pages.Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage{

    public  WebDriver driver;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }
/*
public  WebDriver driver;
        public CadastroPage(WebDriver driver){
            this.driver = driver;
        }
*/
    public void preenchimentoCadatroXpath(WebDriver driver){
        //WebDriver driver = new ChromeDriver();
        WebElement nome = driver.findElement(By.id("nome"));
        nome.sendKeys("Trios de Capacitação");//colocar nome
/*
        WebElement telefone = driver.findElement(By.xpath("id=telefone"));
        telefone.sendKeys("(19)00000000");//colocar telefone

        WebElement email = driver.findElement(By.xpath("id=email"));
        email.sendKeys("diogogomes467@gmail.com");//colocar email

        WebElement senha = driver.findElement(By.xpath("id=senha"));
        senha.sendKeys("12345");//colocar senha

        WebElement captcha = driver.findElement(By.xpath("id=captcha"));
        captcha.sendKeys("12345");//colocar senha

        WebElement CriarConta = driver.findElement(By.xpath("id=btn_cadastro"));
        CriarConta.click();


        //ou dessa forma
        /*WedDriver CriarConta = null;
        CriarConta.findElement(By.linkText("id=btn_cadastro)).click();*/

        }


}
