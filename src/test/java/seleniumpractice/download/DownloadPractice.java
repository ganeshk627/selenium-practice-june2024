package seleniumpractice.download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class DownloadPractice {
    public static void main(String[] args) {
        CommonActions commonActions = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/download");


        driver.findElement(By.xpath("//a[normalize-space()='Scenario.txt']"))
                .click();

        System.out.println("File is downloading!!!");


        commonActions.waitFor(5);
        driver.quit();
    }
}
