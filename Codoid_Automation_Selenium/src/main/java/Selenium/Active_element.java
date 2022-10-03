package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Active_element {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        WebElement currentelement = driver.switchTo().activeElement();
        currentelement.sendKeys("Arun");
        System.out.println(currentelement.getAttribute("value"));
        System.out.println(currentelement.getAttribute("placeholder"));
        currentelement.submit();
    }
}
