package GitHub_TextBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_SendKeys {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        WebElement username = driver.findElement(By.id("login_field"));

        username.sendKeys("Kethan");

        Thread.sleep(3000);

        username.clear();

        Thread.sleep(3000);

        driver.quit();

    }
}
