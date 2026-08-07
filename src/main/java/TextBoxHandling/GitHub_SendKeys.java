package TextBoxHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub_SendKeys {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the username field is visible
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_field")));

        // Enter text
        username.sendKeys("Kethan");

        // Wait until the text box is clickable before clearing it
        wait.until(ExpectedConditions.elementToBeClickable(username));

        Thread.sleep(2);
        // Clear the text box
        username.clear();

        driver.quit();
    }
}