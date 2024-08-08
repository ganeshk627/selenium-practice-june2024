package seleniumpractice.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {

        // Opening browser - chrome
        WebDriver driver = new ChromeDriver();

        // Open Google Application
        driver.get("https://www.google.com/");

        // Browser Commands
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        driver.manage().window().maximize();

        // Close
//        driver.close(); // current tab
        driver.quit(); // whole browser/ window
    }
}
