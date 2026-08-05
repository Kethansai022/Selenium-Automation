package Advanced_Controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class PageLoad_TimeOut {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        //give timeout
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        //startime
        Instant starttime = Instant.now();
        System.out.println("starttime.tostring()");
        driver.get("https://workspace.google.com/intl/en-US/gmail/");
        //endtime
        Instant endtime = Instant.now();
        System.out.println("endtime.tostring()");

        //Duration between start & end
        Duration duration = Duration.between(starttime, endtime);
        System.out.println("PageLoad time: " +duration.toMillis() + "milliseconds");
        driver.quit();

    }
}
