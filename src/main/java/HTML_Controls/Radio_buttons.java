package HTML_Controls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radio_buttons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

        // Enter text in the textbox
        WebElement txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bcTextBox")));
        txt.sendKeys("1234");

        // Select Female radio button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("femalerb"))).click();

        // Select English checkbox
        WebElement eng = wait.until(ExpectedConditions.elementToBeClickable(By.id("englishchbx")));
        eng.click();

        // Select Chinese checkbox
        WebElement chi = wait.until(ExpectedConditions.elementToBeClickable(By.id("chinesechbx")));
        chi.click();

        // Deselect English checkbox if selected
        if (eng.isSelected()) {
            eng.click();
        }

        // Select Spanish checkbox
        WebElement spanish = wait.until(ExpectedConditions.elementToBeClickable(By.id("spanishchbx")));
        spanish.click();

        // Enter email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("kjlhf;");

        // Click Register button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("registerbtn"))).click();

        // Print success message
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("msg")));
        System.out.println(message.getText());

        // Navigate to home page
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Click here to navigate to the home page"))).click();

        driver.quit();
    }
}