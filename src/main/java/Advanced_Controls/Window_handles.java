package Advanced_Controls;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_handles {

    public static void main(String[] args) {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Maximize Browser
        driver.manage().window().maximize();

        // Open Website
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#");

        // Store parent window ID and print its ID & Title
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        System.out.println("Parent Window Title: " + driver.getTitle());

        // Click button to open a new window
        wait.until(ExpectedConditions.elementToBeClickable(By.id("newWindowBtn"))).click();

        // Get all window IDs
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to child window
        for (String childWindow : allWindows) {

            if (!childWindow.equals(parentWindow)) {

                driver.switchTo().window(childWindow);
                driver.manage().window().maximize();

                // Wait until First Name textbox is visible
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))).sendKeys("sai");

                // Close child window
                driver.close();
            }
        }

        // Switch back to parent window
        driver.switchTo().window(parentWindow);

        // Wait until Name textbox is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("kethan");

        // Close all browser windows
        driver.quit();
    }
}