package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Software/Driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopCommerce.com/");


    }
}
