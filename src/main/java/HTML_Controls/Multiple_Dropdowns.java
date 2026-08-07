package HTML_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiple_Dropdowns {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        WebElement ide = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ide")));

        Select select = new Select(ide);

        select.selectByIndex(0);
        select.selectByVisibleText("IntelliJ IDEA");
        select.selectByValue("nb");

        select.deselectAll();
        System.out.println("Cleared all");

        driver.quit();
    }
}