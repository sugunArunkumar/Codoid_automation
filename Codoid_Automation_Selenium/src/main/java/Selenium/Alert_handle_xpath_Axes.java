package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert_handle_xpath_Axes {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tnpsc.gov.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement btnapl = driver.findElement(By.linkText("Apply Online"));

        WebElement btnapl = driver.findElement(
                By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        btnapl.click();
        boolean result = false;
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            result = true;
            //driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
            int size = driver.getWindowHandles().size();
            System.out.println(size);
            String childwindow = String.valueOf(driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString()));

        } catch (NoSuchWindowException e) {
            System.out.println("NoSuchWindowException " + e);
        } catch (Exception a){
            System.out.println("Exception catch2" + a);
        }

        System.out.println(result);

    }
}



