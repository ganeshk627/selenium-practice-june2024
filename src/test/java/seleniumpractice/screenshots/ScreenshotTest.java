package seleniumpractice.screenshots;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.time.Duration;

public class ScreenshotTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");


        // Screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE); // screenshot
        File dest = new File("google.png"); // destination path to save
        FileUtils.copyFile(src, dest); // Save to location

        // simplified
        TakesScreenshot takesScreenshot1 = (TakesScreenshot) driver;
        FileUtils.copyFile(takesScreenshot1.getScreenshotAs(OutputType.FILE),  new File("google1.png"));
//        try {
//            FileUtils.copyFile(src, dest);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Screenshot saved!!!");
        driver.quit();
    }
}
