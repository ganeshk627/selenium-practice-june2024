package seleniumpractice.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class PromptAlert {
    public static void main(String[] args) {
        CommonActions ca = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Triggering the Prompt alert
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        ca.waitFor(2);

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText(); // getting alert title/text
        System.out.println(alertText);

        alert.sendKeys("Hello Harry!");
        ca.waitFor(2);
        alert.accept(); // ok

        ca.waitFor(5);

        driver.quit();
    }
}
