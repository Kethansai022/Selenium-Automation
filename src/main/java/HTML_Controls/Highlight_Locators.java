package HTML_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        highlight(driver, driver.findElement(By.id("input")));
        Thread.sleep(2000);

        highlight(driver, driver.findElement(By.className("searchbox-icon-button-container voice")));
        Thread.sleep(2000);

        highlight(driver, driver.findElement(By.linkText("Gmail")));
        Thread.sleep(2000);

        highlight(driver, driver.findElement(By.partialLinkText("Imag")));
        Thread.sleep(2000);

        highlight(driver, driver.findElement(By.cssSelector("input[id='logo']")));
        Thread.sleep(2000);

        highlight(driver, driver.findElement(By.xpath("//input[@id='addShortcutIcon']")));
        Thread.sleep(2000);

        driver.quit();

    }

    public static void highlight(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].style.border='4px solid red'; arguments[0].style.background='yellow';", element);
    }

}