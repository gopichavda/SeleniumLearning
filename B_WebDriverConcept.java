package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class B_WebDriverConcept {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get ("https://demo.nopcommerce.com/");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();



    }


}
