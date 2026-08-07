package Advanced_Controls;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_wait {
    public static void main(String[] args)  throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Webdriver instance created
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://cirro.io/users/sign_in");

        //Wait.until
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        driver.findElement(By.id("user_email")).sendKeys("admin");
        driver.quit();
    }
}

