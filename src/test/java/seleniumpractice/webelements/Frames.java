package seleniumpractice.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.CommonActions;

import java.time.Duration;

public class Frames {

    public static void main(String[] args) {
        CommonActions wait = new CommonActions();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        wait.waitFor(5);





        WebElement frame_bottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
        driver.switchTo().frame(frame_bottom);
        String bottom_text = driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']")).getText();
        System.out.println(bottom_text);


        driver.switchTo().parentFrame(); // one step above

        WebElement frame_top = driver.findElement(By.xpath("//frame[@src='/frame_top']"));
        driver.switchTo().frame(frame_top);
        WebElement frame_left = driver.findElement(By.xpath("//frame[@src='/frame_left']"));
        driver.switchTo().frame(frame_left);
        String left_text = driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
        System.out.println(left_text);

        driver.switchTo().defaultContent(); // directly goes to the top most parent

        System.out.println(driver.getTitle());




driver.quit();
    }
}
