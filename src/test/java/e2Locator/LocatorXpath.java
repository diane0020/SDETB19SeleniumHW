package e2Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.BrowserReader;

public class LocatorXpath {
    public static void main(String[] args) {
        WebDriver driver = BrowserReader.openChromeBrowser("https://syntaxprojects.com/Xpath.php");
        var userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("alakazzam");

        // click button
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        // security question
        var sq1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        sq1.sendKeys("is ali from batch14?");

        // looking through the text
        var text = driver.findElement(By.xpath("//label[contains(text(), 'ipsum')]"));
        System.out.println(text.getText());

        // api setting
        WebElement apiSetting = driver.findElement(By.xpath("//input[starts-with(@id, 'api')]"));
        apiSetting.sendKeys("Shazzam is funny");

        // 1st email field
        var email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("hello1st@gmail.com");

        // 2nd email field
        var email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("hello@gmail.com");

        // 3rd email field
        var email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("hello3rdEmail@gmail.com");

        // 1st field; use of operator
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("testing the field 1");

        // 2nd field; use of operator
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("testing the field 2");

        // field using a xpath we choose
        var customField1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        customField1.sendKeys("testing custom xpath");

        // field using a xpath we choose
        var customField2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField1']"));
        customField2.sendKeys("testing 2nd custom xpath");
    }
}
