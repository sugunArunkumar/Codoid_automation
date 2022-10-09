package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Drg_and_drop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(4000);
//        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//        driver.switchTo().frame(frame);
        driver.switchTo().frame(0);
        WebElement elemdrag = driver.findElement(By.id("draggable"));
        WebElement elemdrop = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(elemdrag,elemdrop).build().perform();
    }
}
