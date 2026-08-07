package Advanced_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Confirm_box {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        // Click Confirm Box button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmBox"))).click();

        // Wait for alert and dismiss it
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();

        // Wait for output message and print it
        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("output"))).getText());

        driver.quit();
    }
}