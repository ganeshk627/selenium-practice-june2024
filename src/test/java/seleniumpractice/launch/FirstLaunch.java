package seleniumpractice.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstLaunch {
    public static void main(String[] args) {
        // Browser open
//        ChromeDriver chromeDriver = new ChromeDriver();
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        EdgeDriver edgeDriver = new EdgeDriver();

        // Opening browser - chrome
        WebDriver driver = new ChromeDriver();

        // Open Test Application
        driver.get("https://www.google.com/");

        // Close
//        driver.close();
        driver.quit();

    }
}
