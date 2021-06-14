package Pages.Home;

import org.openqa.selenium.WebDriver;

public class PlaTestAutApiSw {
    static WebDriver driver;
    public PlaTestAutApiSw(WebDriver driver){
        this.driver = driver;
    }

    public void PlaTestAutApiSwXpath(WebDriver driver) {
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-automatizados-swe/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/7/");
        driver.navigate().back();
        driver.get("https://triosdecapacitacao.eadplataforma.com/curso/teste-automatizado-na-aplicacao-api-swagger/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-automatizados-swe/");
        driver.get("https://triosdecapacitacao.eadplataforma.com/checkout/plan/7/");

        driver.get("https://triosdecapacitacao.eadplataforma.com/plano/plano-teste-automatizados-swe/tel:+5519998855989");
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
        driver.navigate().back();
    }
}
