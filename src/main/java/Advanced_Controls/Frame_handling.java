package Advanced_Controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_handling {
    public static   void main(String[] args)throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("lapalapa");
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        Select dropdown2 = new Select(driver.findElement(By.id("course")));
        dropdown2.selectByIndex(2);
        Thread.sleep(1000);
        dropdown2.selectByVisibleText("Java");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        driver.findElement(By.id("name")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("palapala");
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.quit();
    }
}
