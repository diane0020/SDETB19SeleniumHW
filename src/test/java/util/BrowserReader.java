package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserReader {

    public static WebDriver openChromeBrowser (String url) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
