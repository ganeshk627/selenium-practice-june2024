package seleniumpractice.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeLogin {
    public static void main(String[] args) {

        String username = "admin";
        String password = "admin123";

        // 1. Open browser
        WebDriver driver = new ChromeDriver();

        // 2. Open Orange application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        // Implicit time - global timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // 3. Enter username as "admin"
        WebElement inputUsername = driver.findElement(By.name("username"));
        inputUsername.click();
//        inputUsername.sendKeys("admin");
        inputUsername.sendKeys(username);

        // 4. Enter password as "admin123"
        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputPassword.sendKeys(password);

        // 5. Click the login button
        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();


        // 6. Verify dashboard url

        // 7. close the browser/ application
//        driver.quit();

    }
}
