package Advanced_Controls;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tab_handles {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#");

        // Store the parent tab
        String parentTab = driver.getWindowHandle();
        System.out.println("Parent Tab Handle: " + parentTab);
        System.out.println("Parent Page Title: " + driver.getTitle());

        // Open a new tab
        wait.until(ExpectedConditions.elementToBeClickable(By.id("newTabBtn"))).click();

        // Get all window handles
        Set<String> allTabs = driver.getWindowHandles();

        // Switch to the child tab
        for (String childTab : allTabs) {

            if (!childTab.equals(parentTab)) {

                driver.switchTo().window(childTab);
                driver.manage().window().maximize();

                // Click Alert button
                wait.until(ExpectedConditions.elementToBeClickable(By.id("alertBox"))).click();

                // Wait for alert and accept it
                wait.until(ExpectedConditions.alertIsPresent());
                driver.switchTo().alert().accept();

                // Read output text
                String output = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("output"))).getText();

                System.out.println("Output: " + output);

                // Close child tab
                driver.close();
            }
        }

        // Switch back to parent tab
        driver.switchTo().window(parentTab);

        // Enter text in parent page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("bye");

        // Close browser
        driver.quit();
    }
}