package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement btnDropDown = driver.findElement(By.xpath("//h5[text()='Drop down']"));
        btnDropDown.click();
        Thread.sleep(4000);
        WebElement btnDropDown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
        btnDropDown1.click();
        Select select = new Select(btnDropDown1);
        select.selectByIndex(1);
        System.out.println("Index 0 is selected");
       // driver.quit();


    }
}
