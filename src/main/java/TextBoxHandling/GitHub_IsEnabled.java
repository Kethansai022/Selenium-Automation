package TextBoxHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_IsEnabled {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login/");

        WebElement username = driver.findElement(By.id("login_field"));

        System.out.println(username.isEnabled());

        Thread.sleep(3000);

        driver.quit();
    }
}
