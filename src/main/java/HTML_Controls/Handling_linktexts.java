package HTML_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_linktexts {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com");

        // Wait until the Gmail link is clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail"))).click();

        // Wait until the page title contains "Gmail"
        wait.until(ExpectedConditions.titleContains("Gmail"));

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}