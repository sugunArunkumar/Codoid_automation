package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Try_Actionclass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement btnlogin = driver.findElement(By.xpath("//a[text()='Login']"));
        System.out.println(btnlogin.getText());
        Actions actions = new Actions(driver);
        actions.moveToElement(btnlogin);
        actions.perform();
        WebElement btnzone = driver.findElement(By.xpath("//div[text()='Flipkart Plus Zone']"));
        btnzone.click();
        WebElement btnmore = driver.findElement(By.xpath("//div[text()='More']"));
        actions.moveToElement(btnmore);
        actions.perform();
        driver.quit();

    }
}
