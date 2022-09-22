package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class G_ExplicitWait {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.titleContains("nopCommerce demo store"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-login")));
        System.out.println(driver.getTitle());

    }
}
