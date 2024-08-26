package seleniumpractice.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class SimpleAlert {
    public static void main(String[] args) {
        CommonActions ca = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        // Triggering the simple alert
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
        ca.waitFor(2);

        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
        String alertText = alert.getText(); // getting alert title/text
        System.out.println(alertText);
        alert.accept(); // ok

        ca.waitFor(5);

        driver.quit();
    }
}
