package HTML_Controls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.className("gLFyf")).sendKeys("instagram", Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123@gmail.com");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();

    }
}
