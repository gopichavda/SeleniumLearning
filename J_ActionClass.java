package SeleniumSession;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.ws.Action;

public class J_ActionClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();

        WebElement sourceElements = driver.findElement(By.id("draggable"));
        WebElement targetElements = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDrop(sourceElements,targetElements).build().perform();

    }
}
