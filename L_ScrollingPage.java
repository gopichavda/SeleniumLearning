package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_ScrollingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

 //       driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
         Thread.sleep(2000);
        js.executeScript("window(scrollBy(0,1000)");

        WebElement news = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[1]/strong"));
        js.executeScript("arguments[0].scrollIntoView();",news);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-1000)");
    }
}
