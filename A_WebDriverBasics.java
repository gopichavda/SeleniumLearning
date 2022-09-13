package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WebDriverBasics {
    public static void main(String[] args) {
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
    }
}
