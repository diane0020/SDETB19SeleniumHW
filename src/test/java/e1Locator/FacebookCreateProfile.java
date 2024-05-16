package e1Locator;

import org.openqa.selenium.By;
import util.BrowserReader;
import util.Constants;

public class FacebookCreateProfile {

    public static void main(String[] args) throws InterruptedException {

        var driver = BrowserReader.openChromeBrowser(Constants.FACEBOOK_URL);
        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Jane");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("reg_email__")).sendKeys("janedoe@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("password123");
        driver.findElement(By.name("birthday_month")).sendKeys("Jan");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_year")).sendKeys("1918");
        driver.findElement(By.name("birthday_year")).sendKeys("1918");
        driver.findElement(By.name("sex")).sendKeys("Female");

    }
}
