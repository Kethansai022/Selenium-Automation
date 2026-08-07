package HTML_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Highlight_Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // Highlight Gmail link
        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))));
        // Highlight Images link
        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Imag"))));
        driver.quit();
    }

    public static void highlight(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].style.border='4px solid red';" +
                        "arguments[0].style.background='yellow';",
                element);
    }
}