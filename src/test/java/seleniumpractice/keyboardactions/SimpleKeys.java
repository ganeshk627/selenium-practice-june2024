package seleniumpractice.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class SimpleKeys {
    public static void main(String[] args) {
        CommonActions commonActions = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/intl/en/inputtools/try/");


        WebElement textarea = driver.findElement(By.xpath("//textarea[@class='editor-box']"));

        textarea.sendKeys("Hello Harry!");
        textarea.sendKeys(Keys.ENTER);
        textarea.sendKeys("How are youu??");
        textarea.sendKeys(Keys.BACK_SPACE);
        textarea.sendKeys(Keys.ARROW_LEFT);
        textarea.sendKeys(Keys.BACK_SPACE);

        commonActions.waitFor(5);

        driver.quit();
    }
}
