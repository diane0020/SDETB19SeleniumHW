package e2Locator;

import org.openqa.selenium.By;
import util.BrowserReader;
import util.Constants;

public class LocatorAdvanceXpath {
    public static void main(String[] args) {

        var driver = BrowserReader.openChromeBrowser(Constants.SYNTAX_PROJECT_URL_ADVANCE_XPATH);



        // favourite book
        driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]")).sendKeys("Gone Girl");
        driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]")).sendKeys("Harry " +
                "Potter");
        driver.findElement(By.xpath("//input[@id='favourite-book']")).sendKeys("Bible");

        // least favourite
        driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]")).sendKeys("Twilight");
        driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]")).sendKeys(
                "Unfinished Novel");
        driver.findElement(By.xpath("//input[@id='least-favorite']")).sendKeys("Naruto");

        // family tree
        driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]")).sendKeys("grandparent");
        driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]")).sendKeys("parent");
        driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]")).sendKeys("child");


    }
}
