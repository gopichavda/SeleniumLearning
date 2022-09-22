package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_CustomXpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demo.nopcommerce.com");

        Driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        Driver.findElement(By.xpath("//input[@class='email' and @class='email']")).sendKeys();
        Driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys();
        Driver.findElement(By.xpath("//button[@class='button-1 register-button' and contains(@class,'button-1 register-button')]")).click();
        Driver.findElement(By.xpath("//a[text()='Apply for vendor account']")).click();



    }
}
