package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Find_elements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tnpsc.gov.in/");
        List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='notice']"));
        System.out.println(elementList.size());
        WebElement element1 = elementList.get(0);
        System.out.println("element1" + element1.getText());
//        for (int i = 0; i <elementList.size(); i++){
//            elementList.get(i);
//        }
        for (WebElement element:elementList){
            System.out.println(element.getText());
        }
        //lambda expression
        //elementList.forEach(elem->elem.getText());
        elementList.forEach(WebElement::getText);
    }
}
