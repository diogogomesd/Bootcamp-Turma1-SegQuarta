package Pages.Home;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PlanoTestAoutoWeb {

    public WebDriver driver;
    public PlanoTestAoutoWeb(WebDriver driver){
        this.driver = driver;
    }

    public void PlanoTestAoutoWebXpath(WebDriver driver) {
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/planos-testes-automatizados/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/2/");
        JavascriptExecutor ident = (JavascriptExecutor)driver;
        ident.executeScript("document.getElementById('concluir_pedido').click();");
        JavascriptExecutor email = (JavascriptExecutor)driver;
        email.executeScript("document.getElementById('email_login').setAttribute('value','');");
        JavascriptExecutor senha = (JavascriptExecutor)driver;
        senha.executeScript("document.getElementById('senha_login').setAttribute('value','');");
        JavascriptExecutor entrar = (JavascriptExecutor)driver;
        entrar.executeScript("document.getElementById('btn_login').click();");

        /*driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/2/");
        driver.navigate().back();
        //inicia rodapé
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-web-2020-12-16-00-48-48/");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/tel:+5519998855989");
        driver.navigate().back();
        driver.get("https://api.whatsapp.com/send?1=pt_BR&phone=5519998855989");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/#contato");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/#politica-privacidade");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/certificado/");
        driver.navigate().back();
        driver.get("https://facebook.com/eadplataforma");
        driver.navigate().back();
        driver.get("https://youtube.com/eadplataforma");
        driver.navigate().back();
        driver.get("https://instagram.com/eadplataforma");
        driver.navigate().back();
        driver.get("https://www.facebook.com/eadplataforma/");
        driver.navigate().back();
        driver.get("https://www.facebook.com/sharer/sharer.php?app_id=776730922422337&u=https%3A%2F%2Fwww.facebook.com%2Feadplataforma%2F&display=popup&ref=plugin&src=page");
        driver.navigate().back();*/
    }
}
