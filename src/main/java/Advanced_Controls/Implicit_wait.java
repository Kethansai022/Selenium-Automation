package Advanced_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Implicit_wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("login_field")).sendKeys("sai");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}
