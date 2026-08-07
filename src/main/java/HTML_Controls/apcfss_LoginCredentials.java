package HTML_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class apcfss_LoginCredentials {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://cap.apcfss.in/");

        // Close popup
        WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close']")));
        close.click();

        // Click Login button
        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();

        // Enter Username
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("123456");

        // Enter Password
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        password.sendKeys("124567");

        // Enter Captcha
        WebElement captcha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Captcha']")));
        captcha.sendKeys("123456");

        // Click Submit
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

        driver.quit();
    }
}