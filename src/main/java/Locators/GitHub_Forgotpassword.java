package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub_Forgotpassword {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://github.com/login");

        // Wait until the "Forgot password?" link is clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot password?"))).click();

        // Print the title of the current page
        System.out.println(driver.getTitle());

        driver.quit();
    }
}