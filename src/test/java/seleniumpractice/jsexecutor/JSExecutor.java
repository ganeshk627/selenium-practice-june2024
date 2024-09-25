package seleniumpractice.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class JSExecutor {
    public static void main(String[] args) {
        CommonActions wait = new CommonActions();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");

        wait.waitFor(5);

        // WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Enter name']"));
        // firstName.click();


        WebElement open_modal_button = driver.findElement(By.cssSelector("#myBtn"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("console.log('hello');");

        // scrolling
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("#inp_val")));

        wait.waitFor(5);

        // js for click
        // open_modal_button.click(); // if throwing 'ElementClickInterceptedException', can use below code
        js.executeScript("arguments[0].click();", open_modal_button);

        // get title
//        js.executeScript("document.title");
        String title = (String) js.executeScript("return document.title");
        System.out.println(title);








        wait.waitFor(5);
        driver.quit();


    }
}
