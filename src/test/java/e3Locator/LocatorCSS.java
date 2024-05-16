package e3Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.BrowserReader;

public class LocatorCSS {
    public static void main(String[] args) {
        WebDriver driver = BrowserReader.openChromeBrowser("https://syntaxprojects.com/cssSelector.php");

        // Profile ID
        WebElement profileId = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileId.sendKeys("its me, no filter(who am I kidding!)");

        // profile
        WebElement profile = driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("shazzam");

        // feedback from Jenny
        var feedbackBox = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox.sendKeys("feedback is important");

        // feedback from Raj
        WebElement feedbackBoxRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackBoxRaj.sendKeys("Batch 19 is the best Syntax Batch");

        // email
        WebElement email = driver.findElement(By.cssSelector("input[name*=email]"));
        email.sendKeys("helloToYou@gmail.com");

        // course topic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*=content]"));
        courseTopic.sendKeys("Selenium Class");

        // intro to advance CSS
        WebElement introAdvanceCss = driver.findElement(By.cssSelector("input[name^='Intro']"));
        introAdvanceCss.sendKeys("using startsWith method");

        // conclusion
        var conclusionCss = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusionCss.sendKeys("concluded");
    }
}
