package HTML_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enters_Text {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        // Wait for the search box to be visible and enter text
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb"))).sendKeys("Selenium Automation");

        // Wait for the Google Search button to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();

        driver.quit();
    }
}