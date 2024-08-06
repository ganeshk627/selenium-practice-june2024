package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {
    public static void main(String[] args) {
        // Opening browser - chrome
        WebDriver driver = new ChromeDriver();

        // Open Test Application
        driver.get("https://www.google.com/");


        //// LOCATORS
        // XPATH - 1. absolute - /
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
        // XPATH - 2. relative - //
        driver.findElement(By.xpath("//input"));





        // Close
//        driver.close();
        driver.quit();

    }
}
