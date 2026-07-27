package GitHub_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_Username {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        driver.findElement(By.id("login_field"))
                .sendKeys("your_username");

        Thread.sleep(5000);

        driver.quit();
    }
}