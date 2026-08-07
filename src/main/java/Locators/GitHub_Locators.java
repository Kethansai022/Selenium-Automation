package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub_Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://github.com/login");

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_field"))));

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))));

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-sign-in-button"))));

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot password?"))));

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Create an"))));

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))));

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Username or email address')]"))));

        highlight(driver, wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='commit']"))));

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