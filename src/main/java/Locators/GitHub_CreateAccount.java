package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_CreateAccount {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        driver.findElement(By.linkText("Create an account")).click();

        Thread.sleep(1000);

        System.out.println(driver.getTitle());

        Thread.sleep(5000);

        driver.quit();
    }
}