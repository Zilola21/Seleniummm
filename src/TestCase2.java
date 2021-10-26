import com.sun.javafx.geom.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static org.testng.Assert.*;

import static org.testng.Assert.*;

    public class TestCase2 {
        public static void main(String[] args) throws InterruptedException{

            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komronbek\\Desktop\\selenium\\3 drivers\\chromedriver.exe");
            // WebDriver driver2 = new FirefoxDriver();
            // driver.get("https://www.google.com/");


            //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Komronbek\\Desktop\\selenium\\3 drivers\\geckodriver.exe");
            // WebDriver driver = new FirefoxDriver();
            /// driver.get("https://www.google.com/");

            //System.setProperty("webdriver.edge.driver", "C:\\Users\\Komronbek\\Desktop\\selenium\\3 drivers\\msedgedriver.exe");
            /// WebDriver driver2 = new EdgeDriver();
            ///driver2.get("https://www.google.com/");

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komronbek\\Desktop\\selenium\\3 drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver(); // creates a nre browser session, opens a nre browser

            //1. Navigate to homepage
            driver.get("https://www.duotech.io/");

            //2. Verify the URL is "https://www.duotech.io/"
            String expectedURL = "https://www.duotech.io/";
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals(actualURL, expectedURL);

            //3. Verify that the Homepage contains "Start New IT" text
            String expectedText = "Start New IT";
            String pageSource = driver.getPageSource();
            Assert.assertTrue(pageSource.contains(expectedText));
            driver.close();






            String url =  driver.getCurrentUrl();
            System.out.println(url);
            // 2. Get the title

            String expectedTitle = "Software QA Automation Engineer program | SDET | QA School | Software Testing";

            String actualTitle = driver.getTitle();

////////////////////////

// 3. Compare and verify the expected title with the actual title
            Assert.assertEquals(actualTitle, expectedTitle);
        }
    }


