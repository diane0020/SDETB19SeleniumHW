package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserReader {
    public static WebDriver driver;

    public static WebDriver openChromeBrowser (String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
