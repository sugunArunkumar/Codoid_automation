package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Implicitly_wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tnpsc.gov.in/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement btnapl = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        wait.until(ExpectedConditions.elementToBeClickable(btnapl));
        btnapl.click();
        new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

//        FluentWait fluentWait = new FluentWait(driver);
//        fluentWait.withTimeout(Duration.ofSeconds(50));
//        fluentWait.pollingEvery(Duration.ofSeconds(5));
//        fluentWait.ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.alertIsPresent());
    }
}
