package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_AlertPopupHandle {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        System.out.println(alert.getText());
        alert.dismiss();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);

    }
}
