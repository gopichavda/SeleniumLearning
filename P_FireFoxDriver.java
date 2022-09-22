package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P_FireFoxDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Software/Driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopCommerce.com/");

                        driver.findElement(By.className("ico-login")).click();

                        driver.findElement(By.id("Email")).sendKeys("Test@gmail.com");

                        driver.findElement(By.id("Password")).sendKeys("1234");

                        driver.findElement(By.linkText("Log in")).click();



    }
}
