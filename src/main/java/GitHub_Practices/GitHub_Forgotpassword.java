package GitHub_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_Forgotpassword {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        driver.findElement(By.linkText("Forgot password?")).click();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}