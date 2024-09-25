package seleniumpractice.upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class UploadPractice {
    public static void main(String[] args) {
        CommonActions commonActions = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/upload");


        WebElement upload = driver.findElement(By.id("file-upload"));

//        upload.sendKeys("/Users/ganeshk/Automation Testing/Automation Classes/selenium-practice-june2024/selenium-practice-june2024/upload.txt");

        upload.sendKeys("/Users/ganeshk/Automation Testing/Automation Classes/selenium-practice-june2024/selenium-practice-june2024/src/test/java/seleniumpractice/upload/uploadi.txt");
        commonActions.waitFor(5);
//        driver.quit();
    }
}
