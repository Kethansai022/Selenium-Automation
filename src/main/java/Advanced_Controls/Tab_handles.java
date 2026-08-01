package Advanced_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Tab_handles {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#");
        Thread.sleep(1000);
        String parenttab = driver.getWindowHandle();
        System.out.println("Parent tab Handle: " + parenttab + driver.getTitle());
        driver.findElement(By.id("newTabBtn")).click();
        Set<String> childtab = driver.getWindowHandles();
        for (String windowHandle : childtab) {
            if (!windowHandle.equals(parenttab)) {
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
                driver.findElement(By.id("alertBox")).click();
                Thread.sleep(1000);
                driver.switchTo().alert().accept();
                Thread.sleep(1000);
                driver.findElement(By.id("output")).getText();
                Thread.sleep(1000);
                driver.close();
            }
        }
           driver.switchTo().window(parenttab);
           driver.findElement(By.id("name")).sendKeys("bye");
           Thread.sleep(1000);
           driver.quit();

    }
}