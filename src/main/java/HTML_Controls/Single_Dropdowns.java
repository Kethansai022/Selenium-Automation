package HTML_Controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Single_Dropdowns {
    public static void  main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);
        WebElement course = driver.findElement(By.id("course"));
        Select select = new Select(course);
        select.selectByVisibleText("Python");
        Thread.sleep(1000);
        select.selectByIndex(2);
        Thread.sleep(1000);
        driver.quit();
    }
}

