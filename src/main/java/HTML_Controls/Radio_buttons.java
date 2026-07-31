package HTML_Controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radio_buttons {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        Thread.sleep(1000);
        WebElement txt = driver.findElement(By.className("bcTextBox"));
        txt.sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.id("femalerb")).click();
        Thread.sleep(1000);
        WebElement eng = driver.findElement(By.id("englishchbx"));
        Thread.sleep(1000);
        eng.click();
        Thread.sleep(1000);
        WebElement chi = driver.findElement(By.id("chinesechbx"));
        chi.click();
        Thread.sleep(1000);
        if (eng.isSelected()){
            eng.click(); // english deselected
        }
        Thread.sleep(2000);
        WebElement span = driver.findElement(By.id("spanishchbx"));
        span.click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("kjlhf;");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='registerbtn']")).click();
        System.out.println(driver.findElement(By.id("msg")).getText());
        Thread.sleep(1000);
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}

