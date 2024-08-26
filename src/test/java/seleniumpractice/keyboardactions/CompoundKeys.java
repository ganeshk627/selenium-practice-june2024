package seleniumpractice.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class CompoundKeys {
    public static void main(String[] args) {
        CommonActions commonActions = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/intl/en/inputtools/try/");


        WebElement textarea = driver.findElement(By.xpath("//textarea[@class='editor-box']"));

        textarea.sendKeys("Hello Harry!");
        commonActions.waitFor(1);
        textarea.sendKeys(Keys.ENTER);
        commonActions.waitFor(1);
        textarea.sendKeys(Keys.chord(Keys.CONTROL, "a")); // select all
        commonActions.waitFor(1);
        textarea.sendKeys(Keys.chord(Keys.CONTROL, "x")); // cut all
        commonActions.waitFor(1);
        textarea.sendKeys(Keys.chord(Keys.CONTROL, "v")); // paste all
        commonActions.waitFor(1);
        textarea.sendKeys(Keys.chord(Keys.CONTROL, "v")); // paste all again

        commonActions.waitFor(5);

        driver.quit();
    }
}
