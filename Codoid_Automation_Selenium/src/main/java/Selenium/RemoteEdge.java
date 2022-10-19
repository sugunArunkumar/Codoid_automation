package RemoteHub;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class RemoteEdge {
    static WebDriver driver;
    @Test
    public void tsetinedge() {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("MicrosoftEdge");//MicrosoftEdge
        try {
            driver = new RemoteWebDriver(new URL("http://10.0.0.2:4444"),caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement currentelement = driver.switchTo().activeElement();
        currentelement.sendKeys("selenium grid 4");
        currentelement.submit();

    }
}
