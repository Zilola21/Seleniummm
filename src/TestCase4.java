import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Random;


public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komronbek\\Desktop\\selenium\\3 drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // creates a nre browser session, opens a nre browser


        driver.get("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");


        Assert.assertEquals(driver.getTitle(), "Welcome to Duotify!");




        driver.findElement(By.id("hideLogin")).click();


        String randomUserName = generateRandomUserName();
        String randomEmail = generateRandomEmail();

        driver.findElement(By.name("username")).sendKeys(randomUserName);
        driver.findElement(By.id("firstName")).sendKeys("Bibi");
        driver.findElement(By.id("lastName")).sendKeys("Mas");
        driver.findElement(By.id("email")).sendKeys(randomEmail);
        driver.findElement(By.id("email2")).sendKeys(randomEmail);
        driver.findElement(By.id("password")).sendKeys("Masaidova21");
        driver.findElement(By.id("password2")).sendKeys("Masaidova21");
        Thread.sleep(2000);


        driver.findElement(By.name("registerButton")).click();
        Thread.sleep(2000);



        Assert.assertEquals(driver.getCurrentUrl(), "http://duotifyapp.us-east-2.elasticbeanstalk.com/browse.php?");
        Thread.sleep(1000);



        String firstAndLastName = "Bibi Mas";
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(firstAndLastName));
        Thread.sleep(1000);




        driver.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(1000);



        driver.findElement(By.id("Komronbek")).click();
        Thread.sleep(1000);



        Assert.assertEquals(driver.getCurrentUrl(), "http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");
        Thread.sleep(1000);



        driver.findElement(By.id("loginUsername")).sendKeys(randomUserName);
        driver.findElement(By.id("loginPassword")).sendKeys("Marmira2020");
        driver.findElement(By.name("loginButton")).click();
        Thread.sleep(2000);


        // need help

//   11. Verify successful login by verifying that the home page contains the text "You Might Also Like".

//            String expectedText = "You Might Also Like";
//            String pageSource1=driver.getPageSource();
//            Assert.assertTrue(pageSource1.contains(expectedText));


        String text = driver.findElement(By.className("pageHeadingBig")).getText();

        Assert.assertEquals(text, "You Might Also Like");
        Thread.sleep(1000);


        driver.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(1000);


//        12. Log out once again and verify that you are logged out.

        driver.findElement(By.id("Komronbek")).click();
        Thread.sleep(1000);



        driver.quit();

//


    }

    public static String generateRandomUserName() {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 7; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }


    public static String generateRandomEmail() {

        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 10; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));

        return sb.toString() + "@gmail.com";

        // String email=randomestring()+
    }
}