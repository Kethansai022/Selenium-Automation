package Advanced_Controls;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshots {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        // Capture Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Save Screenshot
        File destination = new File("D:\\OneDrive\\Desktop\\Selenium-Automation\\screenshots\\github.jpg");

        FileHandler.copy(source, destination);

        System.out.println("Screenshot captured & saved successfully!");

        driver.quit();
    }
}