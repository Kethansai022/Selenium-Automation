package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub_CreateAccount {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        // Wait until the "Create an account" link is clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create an account"))).click();

        // Wait until the page title contains "Sign up"
        wait.until(ExpectedConditions.titleContains("Sign up"));

        System.out.println(driver.getTitle());

        driver.quit();
    }
}