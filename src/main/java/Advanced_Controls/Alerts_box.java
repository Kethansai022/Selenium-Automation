package Advanced_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_box {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");

        // Click the Alert Box button
        driver.findElement(By.id("alertBox")).click();

        // Wait until the alert appears and accept it
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        // Wait until the output message is visible and print it
        String output = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("output"))).getText();

        System.out.println(output);

        driver.quit();
    }
}