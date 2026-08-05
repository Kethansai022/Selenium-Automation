package Advanced_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Window_handles {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Maximize Browser
        driver.manage().window().maximize();

        // Open Website
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#");
        Thread.sleep(1000);

        //store parent window Id & print Id, Title.
        String parentwindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentwindow + driver.getTitle());

        //opens parent window
        driver.findElement(By.id("newWindowBtn")).click();

        //get all windows Id's
        Set<String> allwindows = driver.getWindowHandles();

        //Loop through windows
        for (String childwindow : allwindows) { // Reads every window ID one by one
            if (!childwindow.equals(parentwindow)) { // Skip parent window
                driver.switchTo().window(childwindow); // switch to child window
                driver.manage().window().maximize();
                Thread.sleep(2000);
                driver.findElement(By.id("firstName")).sendKeys("sai");
                Thread.sleep(1000);
                driver.close();
            }
        }
        //Switch to parent window and enters text
        driver.switchTo().window(parentwindow);
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("kethan");
        Thread.sleep(3000);
        driver.quit();
    }
}