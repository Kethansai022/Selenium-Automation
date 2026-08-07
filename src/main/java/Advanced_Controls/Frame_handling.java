package Advanced_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame_handling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        // Enter text in the main page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Hi");

        // Switch to frame
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frm1")));

        // Handle dropdown inside frame
        Select dropdown = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("course"))));

        dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("Java");

        // Switch back to main page
        driver.switchTo().defaultContent();

        // Clear and enter new text
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).clear();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Bye");

        // Refresh page
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

        // Navigate back
        driver.navigate().back();
        Thread.sleep(2000);

        // Navigate forward
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.quit();
    }
}