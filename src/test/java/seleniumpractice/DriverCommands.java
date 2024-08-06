package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommands {
    public static void main(String[] args) {

        // Opening browser - chrome
        WebDriver driver = new ChromeDriver();

        // Open Google Application
        driver.get("https://www.google.com/");

        // Driver commands
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);

        // Close
//        driver.close();
        driver.quit();

    }
}
