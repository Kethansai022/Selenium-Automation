package HTML_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropboxes {

    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        WebElement dropdown = driver.findElement(By.id("course"));

        Select selectdropdown = new Select(dropdown);
        Thread.sleep(2000);

        selectdropdown.selectByIndex(0);
        Thread.sleep(2000);

        selectdropdown.selectByValue("js");
        Thread.sleep(2000);

        selectdropdown.selectByIndex(2);
        Thread.sleep(2000);

        selectdropdown.selectByVisibleText("Python");
        Thread.sleep(2000);

        driver.quit();

    }
}
