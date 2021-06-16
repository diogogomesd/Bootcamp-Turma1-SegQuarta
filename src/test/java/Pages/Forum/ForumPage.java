package Pages.Forum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    static WebDriver driver;
    public ForumPage(WebDriver driver){

        this.driver = driver;
    }
    public void forumXpath(WebDriver driver){
        WebElement c = driver.findElement(By.id("//*[@id=\"plans\"]/div[2]/div/div/div[1]/div/div[1]/a"));
        c.click();
    }
}
