package seleniumpractice.waitmechanisms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement inputSearch =driver.findElement(By.tagName("textarea"));
        inputSearch.sendKeys("Google Water");
        WebElement inputButton =driver.findElement(By.name(("btnI")));
        inputButton.click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // close browser
        driver.quit();
    }
}
