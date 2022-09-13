package SeleniumSession;

import org.openqa.selenium.WebDriver;

public class EdgeDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:/Software/Driver/msedgedriver.exe");

        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();

        driver.get("https://demo.nopCommerce.com/");
    }
}
