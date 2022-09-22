package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_File_upload {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
        driver.manage().window().maximize();

        driver.findElement(By.name("upfile")).sendKeys("C:\\Testing\\Test.txt");

    }
}
