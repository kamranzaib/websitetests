package Assesment;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class verifying {


    static WebDriver driver = new ChromeDriver();


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("src/driver/chromedriver", "G:\\chromedriver.exe");


        driver.get("https://www.paypal.com");

         String myTitle = driver.getTitle();

          System.out.println("Title is " + myTitle);

         String expectedTitle = "https://www.paypal.com";

         Assert.assertTrue(driver.getTitle().contains("Send Money, Pay Online or Set Up a Merchant Account - PayPal"));

        System.out.println("correct title");

        List<WebElement> imgCount = driver.findElements(By.tagName("img"));
        System.out.println(imgCount.size());

        WebElement flag = driver.findElement(By.xpath("//*[@id=\"body\"]/footer/div/ul[1]/li[6]/a"));
        System.out.println("flag of " + flag.getAttribute("class"));

        /**   WebElement menu = driver.findElement(By.xpath("//*[@id=\"left-hero\"]/div/div/div[3]"));


        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       WebElement signuP =  driver.findElement(By.xpath("//*[@id=\"left-hero\"]/div/div/div[3]/a"));
        actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        signuP.click();

        Actions builder = new Actions(driver);
        WebElement email =   driver.findElement(By.xpath("//*[@id=\"paypalAccountData_email\"]"));
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"paypalAccountData_password\"]"));
        WebElement conpass = driver.findElement(By.xpath("//*[@id=\"paypalAccountData_confirmPassword\"]"));
        Action seriesOfActions = builder.moveToElement(email).click().sendKeys(email, "test@google.com ").sendKeys(pass,
        "test123").sendKeys(conpass, "test123").build();
         seriesOfActions.perform();

       Thread.sleep(2000);

        driver.findElement(By.id("/appData/action")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String actualError =  driver.findElement(By.xpath("//*[@id=\"PageMainForm\"]/div[2]/div[3]/div/div/div[2]")).getText();

        String expectedErrorStr = "It looks like you already signed up.";

        Assert.assertTrue( actualError.contains(expectedErrorStr));


      //conpass.getAttribute("placeholder");



        if(conpass.isDisplayed()){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }


        WebElement sendTxt = driver.findElement(By.id("uh-search-box"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder.moveToElement(sendTxt).click().sendKeys(sendTxt, "Nutrient").build();
        seriesOfActions.perform();

        driver.findElement(By.id("uh-search-button")).click();

        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        List<WebElement> optionCount = driver.findElements(By.tagName("img"));
        System.out.println(optionCount.size());

        driver.findElement(By.linkText("Sign in")).click();

       WebElement checkbox =  driver.findElement(By.id("persistent"));


        boolean checkboxstatus = checkbox.isSelected();
        System.out.println("status of check box " + checkboxstatus );


        driver.findElement(By.id("login-signin")).click();

      String actualError =  driver.findElement(By.xpath("//*[@id=\"login-username-form\"]/p[1]")).getText();

      String expectedError = "Sorry, we don't recognize this email.";

     // Assert.assertEquals(actualError, expectedError);

    //  Assert.assertTrue(actualError.contains("Sorry, we don't recognize this email."));
        Assert.assertTrue( actualError.contains(expectedError));






    }

**/
}}