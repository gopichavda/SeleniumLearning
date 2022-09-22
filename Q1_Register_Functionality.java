package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Register_Functionality {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("aarti");
        driver.findElement(By.name("LastName")).sendKeys("chavda");
        Thread.sleep(2000);

        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
        Day.sendKeys("10");
        Month.sendKeys("Octomber");
        Year.sendKeys("1990");

        Thread.sleep(2000);

        driver.findElement(By.name("Email")).sendKeys("aarti22rajput@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Company")).sendKeys("nopCommerce");
        driver.findElement(By.id("Newsletter")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.id("register-button")).click();



    }




}