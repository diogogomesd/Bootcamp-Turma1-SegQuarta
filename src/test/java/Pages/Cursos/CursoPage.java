package Pages.Cursos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {

    static WebDriver driver;

    public CursoPage(WebDriver driver){

        this.driver = driver;
    }
    public void elementoCursoXpath(){

        //campo da pesquisa
        WebElement pesquisa = driver.findElement(By.xpath("id=searchtext"));
        pesquisa.sendKeys("cursos");//colocar curso desejado

        WebElement botaoPesquisa = driver.findElement(By.linkText("class=btn_form_search"));
        botaoPesquisa.click();

        WebElement contato = driver.findElement(By.linkText("class = fa fa-phone"));
        botaoPesquisa.click();
    }
}
