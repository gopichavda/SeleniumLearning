package SeleniumSession;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class K1_Dropdown extends K2_Utils{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();
//        1.
//        driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
//        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("November");
//        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");

//        2.
//        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
//        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
//        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
//        Day.sendKeys("10");
//        Month.sendKeys("November");
//        Year.sendKeys("1990");

//        3.








    }
}
