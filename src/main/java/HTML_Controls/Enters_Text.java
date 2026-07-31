package HTML_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enters_Text {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.findElement(By.id("APjFqb")).sendKeys("Selenium Automation");

        Thread.sleep(3000);

        driver.findElement(By.name("btnK")).click();

        Thread.sleep(2000);

        driver.quit();
    }

}
