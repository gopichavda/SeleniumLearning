package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WebDriverBasics {
    public static void main(String[] args) throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        System.out.println(driver.getTitle());

        String Title = driver.getTitle();
        System.out.println("Page Title:" + Title);

        if (Title.equals("nopCommerce demo store1")){
            System.out.println("Page title is correct");
        }else{
            System.out.println("Page is incorrect");
        }
        if(Title =="nopCommerce demo store1"){
            System.out.println("Page Title is correct");
        }else{
            System.out.println("Page Title is incorrect");
        }

        driver.findElement(By.className("ico-login")).click();

        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        driver.manage().window().maximize();

//        driver.manage().window().minimize();

        driver.navigate().refresh();

        String Url = driver.getCurrentUrl();
        System.out.println("Current URL:" + Url);



        driver.quit();

        driver.close();
    }
}
