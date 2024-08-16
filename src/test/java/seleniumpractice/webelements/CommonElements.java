package seleniumpractice.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonElements {
    public static void main(String[] args) throws InterruptedException {

        String username = "admin";
        String password = "admin123";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.google.com/");


        // 1 .input - sendKeys, clear
        driver.findElement(By.tagName("textarea")).sendKeys("ganesh");
        Thread.sleep(2000);
        driver.findElement(By.tagName("textarea")).clear();
        Thread.sleep(2000);

        // 2. button - click
        WebElement inputSearch =driver.findElement(By.tagName("textarea"));
        inputSearch.sendKeys("Google Water");
        WebElement inputButton =driver.findElement(By.name(("btnI")));
        inputButton.click();




    }
}
