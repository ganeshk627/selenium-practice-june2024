package seleniumpractice.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementStates {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
        System.out.println(email.isEnabled());
        System.out.println(email.isDisplayed());

        if(email.isEnabled()){
            System.out.println("Please start typing!!!");
        } else {
            System.out.println("Not able to type since, input is disabled!");
        }


        WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));
        System.out.println(fname.isEnabled());
        System.out.println(fname.isDisplayed());

        if(fname.isEnabled()){
            System.out.println("Please start typing!!!");
        } else {
            System.out.println("Not able to type since, input is disabled!");
        }

        WebElement drp = driver.findElement(By.xpath("//a[normalize-space()='Join Training']"));
        System.out.println(drp.isEnabled());
        System.out.println(drp.isDisplayed());


        WebElement checkbox = driver.findElement(By.xpath("//input[@name='chkSelectAll']"));
        System.out.println(checkbox.isEnabled());
        System.out.println(checkbox.isDisplayed());
        System.out.println(checkbox.isSelected());

        if(checkbox.isSelected()){
            System.out.println("All values selected!");
        } else {
            System.out.println("Not all values selected!");
        }

        String submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).getText();

        // STRING OPERATIONS
        System.out.println(submit);
        System.out.println(submit.contains("mit"));
        System.out.println(submit.contains("sub"));
        System.out.println(submit.length());
        System.out.println(submit.split("b").length);
        System.out.println(submit.split("b")[0]);
        System.out.println(submit.split("b")[1]);
        System.out.println(submit.substring(2, 4));
        System.out.println(submit.toLowerCase());
        System.out.println(submit.toUpperCase());
        String card = "3333444455556666";
        System.out.println(card.length());
        System.out.println(card.substring(12, 16)); // last 4 digits in card
        System.out.println(card.charAt(3)); // 3rd index
        System.out.println(card.charAt(4)); // 4th index
        System.out.println(card.charAt(5)); // 5th index

        driver.quit();

    }
}
