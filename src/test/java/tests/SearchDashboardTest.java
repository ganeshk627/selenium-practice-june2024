package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class SearchDashboardTest {
    public static void main(String[] args) {
        // test data
        String username = "admin";
        String password = "admin123";

        // 1. Open browser
        WebDriver driver = new ChromeDriver();

        // 2. Open Orange application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        // Implicit time - global timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        CommonActions comman = new CommonActions();
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        // 3. Enter username as "admin"
        loginPage.enterUsername(username);

        // 4. Enter password as "admin123"
        loginPage.enterPassword(password);

        // 5. Click the login button
        loginPage.clickLogin();

        // 6. Search in dashboard
        System.out.println(driver.getCurrentUrl());

        dashboardPage.search("time");


        comman.waitFor(5);

        // 7. close the browser/ application
        driver.quit();
    }


}
