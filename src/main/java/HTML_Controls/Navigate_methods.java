package HTML_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigate_methods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com/");

        // Search for Instagram
        WebElement enter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));
        enter.sendKeys("instagram", Keys.ENTER);

        // Navigate to Facebook
        driver.navigate().to("https://www.facebook.com/");

        // Enter email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")))
                .sendKeys("123@gmail.com");

        // Refresh the page
        driver.navigate().refresh();

        // Wait until the email field is visible again after refresh
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));

        // Navigate back
        driver.navigate().back();

        // Wait until Google search box is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));

        // Navigate forward
        driver.navigate().forward();

        // Wait until Facebook page loads again
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));

        driver.quit();
    }
}