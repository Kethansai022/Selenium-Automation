package Advanced_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiple_Frames_Handling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        // Enter text in the main page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Text1");

        // Switch to Frame 1
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm1"));

        // Select option from dropdown
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("selectnav1")));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("- Testing");

        // Return to main page
        driver.switchTo().defaultContent();

        // Switch to Frame 2
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm2"));

        // Enter first name
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))).sendKeys("Sai");

        // Return to main page
        driver.switchTo().defaultContent();

        // Clear and enter new text
        WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        textBox.clear();
        textBox.sendKeys("Text2");

        // Close browser
        driver.quit();
    }
}