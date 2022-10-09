package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class Web_table {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("C:/Arunkumar/Selenium_task.html");


        WebElement table = driver.findElement(By.xpath("//table[count(.//tr/th)=4]"));
        //WebElement table = driver.findElement(By.xpath("//table[@id='Datatable']"));
        //It find the last Row by using nth-child method
        WebElement lastrow = driver.findElement(By.cssSelector("table#Datatable tr:nth-child(5)"));
        //It find the last Row by using last() method
        WebElement lastrow2 = driver.findElement(By.xpath("//table[@id='Datatable']//tr[last()]"));
        //WebElement alterrow = driver.findElement(By.xpath("table[id='Datatable'] tr:nth-child(2n+1)"));
        //System.out.println(alterrow.getText());
        System.out.println(lastrow.getText());
        //System.out.println(lastrow2.getText());
        List<WebElement> rowsList = table.findElements(By.tagName("tr"));

        List<WebElement> columnsList = null;
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();

        for (WebElement row : rowsList) {
            //System.out.println();
            columnsList = row.findElements(By.tagName("td"));
            //System.out.println(columnsList.get(i).getText());
            for (WebElement column : columnsList) {
                //System.out.print(column.getText() + ",");
            }
        }
        //System.out.println(rowsList.get(i).getText());
        driver.quit();
    }}