package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_launch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codoid.com/about-us/");
        Thread.sleep(4000);
        WebElement btnlogin = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
        btnlogin.click();
        WebElement btnlogin2 = driver.findElement(By.xpath("(//a[text()='Hom'])[1]"));
        System.out.println(btnlogin2.isDisplayed());
//        btnlogin.getTagName();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        Actions actions = new Actions(driver);
//        actions.moveToElement(btnlogin);
//        actions.perform();
        //System.out.println(driver.getPageSource());
        //driver.quit();
    }
}
