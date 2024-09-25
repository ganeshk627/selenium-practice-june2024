package seleniumpractice.multiplewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;
import java.util.Set;

public class MultipleTabs {
    public static void main(String[] args) {
        CommonActions waitUtil = new CommonActions();
        String browser = "EdgE";

        WebDriver driver;
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");

        System.out.println(driver.getWindowHandles().size());

        // Triggering new tab
        driver.findElement(By.cssSelector("a[href='https://bit.ly/tr_practice_2023']")).click();
        waitUtil.waitFor(5);
        System.out.println(driver.getWindowHandles().size());

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        driver.switchTo().newWindow(WindowType.TAB); // opens new
        waitUtil.waitFor(2);
        driver.get("https://google.com");
        System.out.println(driver.getWindowHandles().size());


        Set<String> windowIDs = driver.getWindowHandles();
        String currentId = driver.getWindowHandle();
        waitUtil.waitFor(2);

        for(String windowId: windowIDs) {
            System.out.println(windowId);
//            if(currentId.equalsIgnoreCase(windowId)) {
//                System.out.println("Cant switch to same page!");
//            } else {
                driver.switchTo().window(windowId);
                System.out.println(driver.getTitle());
                waitUtil.waitFor(2);
//            }
        }






        waitUtil.waitFor(5);
        driver.quit();

    }
}
