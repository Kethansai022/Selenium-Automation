package Advanced_Controls;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

    public static void main(String[] args) throws IOException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open GitHub Login page
        driver.get("https://github.com/login");

        // Take screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Specify destination path
        File destinationFile = new File("D:\\OneDrive\\Desktop\\Selenium-Automation\\screenshots\\github.jpg");

        // Copy screenshot to destination
        FileHandler.copy(sourceFile, destinationFile);

        System.out.println("Screenshot captured and saved successfully.");

        // Close browser
        driver.quit();
    }
}