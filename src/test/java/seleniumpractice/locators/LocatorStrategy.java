package seleniumpractice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {
    public static void main(String[] args) {
        // Opening browser - chrome
        WebDriver driver = new ChromeDriver();

        // Open Test Application
        driver.get("https://selectorshub.com/xpath-practice-page/");


        //// LOCATORS
        // 1. XPATH - all attributes /
        // XPATH - 1. absolute xpath - /
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/button[1]"));
        // XPATH - 2. relative xpath - //
        //Relative xpath syntax --> //tagname[@attrname='attrvalue']
//        String name = "He said, \"hello\"";
        driver.findElement(By.xpath("//input"));
        driver.findElement(By.xpath("//input[@title='Email']"));

        // 2. CSS Selector - all attributes /
        // CSS Selector -syntax --> tagname[attrname='attrvalue']
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector("input[title='Email']"));

        // 3. TAG NAME - / duplicates
        driver.findElement(By.tagName("button"));
        driver.findElement(By.tagName("body"));

        // 4. NAME - unique /
        driver.findElement(By.name("email"));
        driver.findElement(By.name("Password"));

        // 5. CLASSNAME - / style - dynamic and duplicate
        driver.findElement(By.className("dropbtn"));

        // 6. ID - unique /
        driver.findElement(By.id("pass"));

        // 7. LINK TEXT - only 'a' tag / long or dynamic or duplicate
        driver.findElement(By.linkText("Learning Hub"));
        driver.findElement(By.linkText("Click to practice iframe inside shadow dom scenario"));

        // 8. PARTIAL LINK TEXT - only 'a' tag and long or dynamic / duplicate
        driver.findElement(By.partialLinkText("Learning Hu"));
        driver.findElement(By.partialLinkText("Click to Download PNG"));
        driver.findElement(By.partialLinkText("Click to practice"));
        driver.findElement(By.partialLinkText("to practice"));



        // Close
//        driver.close();
        driver.quit();

    }
}
