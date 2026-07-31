package HTML_Controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Multiple_Dropdowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement ide = driver.findElement(By.id("ide"));
        Select select = new Select(ide);
        Thread.sleep(1000);
        select.selectByIndex(0);
        Thread.sleep(1000);
        select.selectByVisibleText("IntelliJ IDEA");
        Thread.sleep(1000);
        select.selectByValue("nb");
        Thread.sleep(1000);
        select.deselectAll();
        System.out.println("Cleared all");
        Thread.sleep(1000);
        driver.quit();

    }
}
