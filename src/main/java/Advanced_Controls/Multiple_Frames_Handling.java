package Advanced_Controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Multiple_Frames_Handling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("Text1");

        driver.switchTo().frame("frm1");
        Select dropdown = new Select(driver.findElement(By.id("selectnav1")));
        dropdown.selectByVisibleText("- Testing");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("sai");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Text2");
        Thread.sleep(1000);

        driver.quit();

    }
}
