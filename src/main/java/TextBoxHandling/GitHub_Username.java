package TextBoxHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub_Username {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Open GitHub Login Page
        driver.get("https://github.com/login");

        // Wait until the username textbox is visible
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_field")));

        // Click on the username textbox
        username.click();
        Thread.sleep(2000);

        System.out.println("Username Textbox Located Successfully");

        // Close the browser
        driver.quit();
    }
}