package e9Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E9Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{"Admin"});
        driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"Hum@nhrm123"});
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

        //click calendar button
        WebElement fromDate = driver.findElement(By.xpath("//input[@name='leaveList[calFromDate]']/following-sibling::img"));
        fromDate.click();

        //select month
        WebElement fromDateMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth = new Select(fromDateMonth);
        selectMonth.selectByValue("0");

        //select year
        WebElement fromDateYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(fromDateYear);
        selectYear.selectByValue("1990");

        //select day
        List<WebElement> fromDateDay = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement dateDay : fromDateDay) {
            if (dateDay.getText().equals("20")){
                dateDay.click();
                break;
            }
        }
    }
}
