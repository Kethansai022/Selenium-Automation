package Advanced_Controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("Text1"); //Main HTML doc

        driver.switchTo().frame("frm1"); //switch to frame1
        Select dropdown = new Select(driver.findElement(By.id("selectnav1")));
        dropdown.selectByVisibleText("- Testing");
        Thread.sleep(2000);

        driver.switchTo().defaultContent(); // switch to Main frame

        driver.switchTo().frame("frm2"); // switch to frame 2
        driver.findElement(By.id("firstName")).sendKeys("sai");
        Thread.sleep(1000);

        driver.switchTo().defaultContent(); // Switch to Main frame
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Text2");
        Thread.sleep(1000);

        driver.quit();

    }
}
