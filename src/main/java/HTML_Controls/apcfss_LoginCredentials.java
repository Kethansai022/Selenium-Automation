package HTML_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apcfss_LoginCredentials {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cap.apcfss.in/");

        WebElement close = driver.findElement(By.xpath("//button[@aria-label='Close']"));
        Thread.sleep(2000);
        close.click();
        Thread.sleep(2000);

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.name("username"));
        Thread.sleep(2000);

        username.sendKeys("123456");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        Thread.sleep(2000);

        password.sendKeys("124567");
        Thread.sleep(1000);

        WebElement captcha = driver.findElement(By.xpath("//input[@placeholder='Captcha']"));
        captcha.sendKeys("123456");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}