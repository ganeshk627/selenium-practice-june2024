package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;

import java.time.Duration;

public class ForgotPasswordTest {
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

        LoginPage loginPage = new LoginPage(driver);

       loginPage.clickForgotPassword();

       // remaining steps
        // TASK

        // 7. close the browser/ application
        driver.quit();
    }


}
