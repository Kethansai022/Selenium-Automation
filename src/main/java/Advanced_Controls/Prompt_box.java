package Advanced_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prompt_box {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");

        // Click on Prompt Box button
        driver.findElement(By.id("promptBox")).click();

        // Wait until alert appears
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Enter text into the prompt alert
        alert.sendKeys("Okay");

        // Accept the alert
        alert.accept();

        // Wait until the output text is visible and print it
        String result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("output"))).getText();

        System.out.println(result);

        driver.quit();
    }
}