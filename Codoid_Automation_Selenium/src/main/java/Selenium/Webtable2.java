package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Webtable2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:/Arunkumar/webtable.html");
        Scanner sc = new Scanner(System.in);
        String str0=sc.nextLine();

        String str1 = new StringBuilder()
                .append("//th[text()='")
                .append("<<str>>")
                .append("']/following::td").toString();
        WebElement table=driver.findElement(By.xpath(str1.replace("<<str>>",str0)));
        String text = table.getText();
        System.out.println(text);

    }
}
