package Advanced_Controls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

public class PageLoad_TimeOut {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            // Set maximum page load time
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            // Record start time
            Instant startTime = Instant.now();
            System.out.println("Start Time : " + startTime);

            // Open the webpage
            driver.get("https://workspace.google.com/intl/en-US/gmail/");

            // Record end time
            Instant endTime = Instant.now();
            System.out.println("End Time   : " + endTime);

            // Calculate page load duration
            Duration pageLoadTime = Duration.between(startTime, endTime);

            System.out.println("Page Load Time : " + pageLoadTime.toMillis() + " ms");

        } finally {
            driver.quit();
        }
    }
}