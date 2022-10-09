package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Window_handles {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(4000);
        //WebElement btnapl = driver.findElement(By.linkText("Apply Online"));
        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("samsung s20 ultra" + Keys.ENTER);

        String window1 = driver.getWindowHandle();
        System.out.println("window1 = "+window1);
        driver.findElement(By.xpath("//span[contains(text(),'(Renewed) Samsung Galaxy Note')]")).click();
        Thread.sleep(2000);
        driver.switchTo().window(String.valueOf(driver.getWindowHandle().toCharArray()[0]));


        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

        Set<String> windows = driver.getWindowHandles();
        for (String window2 : windows) {
            System.out.println(window2);
            if (!window2.equals(window1)) {
                driver.switchTo().window(window2);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
                Thread.sleep(2000);

                driver.navigate().back();
                //driver.close();
            }

        }
    }}