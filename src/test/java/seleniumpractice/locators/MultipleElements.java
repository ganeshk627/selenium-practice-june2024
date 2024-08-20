package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MultipleElements {

    public static void main(String[] args) {
        // Opening browser - chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Open Test Application
        driver.get("https://selectorshub.com/xpath-practice-page/");

        //// FINDELEMENT
        // Single Match
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hello");
        // Multiple match - only first element to be considered
//        driver.findElement(By.xpath("//input")).click();
        driver.findElement(By.xpath("//input")).clear();
        driver.findElement(By.xpath("//input")).sendKeys("hi");
        // Zero elements
//        driver.findElement(By.xpath("//input[@title='harry']")); // No such element Exeception


        //// FINDELEMENTS
        //Single element
        List<WebElement> multipleEmails = driver.findElements(By.xpath("//input[@name='email']"));
        System.out.println(multipleEmails.isEmpty());
        System.out.println(multipleEmails.size());
        // Multiple elements with findElements
        List<WebElement> multipleInputs = driver.findElements(By.xpath("//input"));
        System.out.println(multipleInputs.isEmpty());
        System.out.println(multipleInputs.size());
        // Zero elements
        List<WebElement> emptyList = driver.findElements(By.xpath("//input[@title='harry']")); // returns empty list
        System.out.println(emptyList.isEmpty()); // true
        System.out.println(emptyList.size()); // 0

        // PERFOMING ACTIONS
        List<WebElement> carOptions = driver.findElements(By.xpath("//select[@id='cars']/option"));
        System.out.println(carOptions.size());
        for(int i=0; i<carOptions.size(); i++) {
            WebElement ithoption = carOptions.get(i);
            System.out.println(ithoption.getText());
        }

        driver.quit();
    }
}
