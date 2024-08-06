package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {

        // Opening browser - chrome
        WebDriver driver = new ChromeDriver();

        // Open Google Application
        driver.get("https://www.google.com/");
        // Open Facebook Application
        driver.get("https://www.facebook.com/");
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Navigation Commands
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        // Close
//        driver.close();
        driver.quit();

    }
}
