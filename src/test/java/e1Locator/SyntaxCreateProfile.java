package e1Locator;

import org.openqa.selenium.By;
import util.BrowserReader;
import util.Constants;

public class SyntaxCreateProfile {
    public static void main(String[] args) throws InterruptedException {
        var driver = BrowserReader.openChromeBrowser("https://syntaxprojects.com/input-form-locator.php");

        driver.findElement(By.id("first_name")).sendKeys("Jane");
        driver.findElement(By.name("last_name")).sendKeys("Doe");
        driver.findElement(By.name("email")).sendKeys("janedoe@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.id("submit_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Link")).click();

    }
}
