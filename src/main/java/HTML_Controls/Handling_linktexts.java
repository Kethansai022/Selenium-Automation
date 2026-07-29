package HTML_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_linktexts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.findElement(By.id("Gmail")).click();

        Thread.sleep(2000);

        System.out.println("page Title: " + driver.getTitle());

        driver.quit();
    }

}
