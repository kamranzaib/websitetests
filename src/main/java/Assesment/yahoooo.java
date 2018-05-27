package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class yahoooo {

    public static void main(String[] args)  {


        System.setProperty("src/driver/chromedriver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.paypal.com/welcome/signup/#/email_password");

        Actions builder = new Actions(driver);
        WebElement email =   driver.findElement(By.xpath("//*[@id=\"paypalAccountData_email\"]"));
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"paypalAccountData_password\"]"));
        WebElement conpass = driver.findElement(By.xpath("//*[@id=\"paypalAccountData_confirmPassword\"]"));
        WebElement toClick = driver.findElement(By.id("/appData/action"));
        Action seriesOfActions = builder.moveToElement(email).click().sendKeys(email, "test@google.com ").sendKeys(pass,
                "test123").sendKeys(conpass, "test123").click(toClick).build();
        seriesOfActions.perform();


        //driver.findElement(By.id("/appData/action")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String actualError =  driver.findElement(By.xpath("//*[@id=\"PageMainForm\"]/div[2]/div[3]/div/div/div[2]/p/span")).getText();

        String expectedErrorStr = "It looks like you already signed up.";

        Assert.assertTrue( actualError.contains(expectedErrorStr));

        System.out.println(expectedErrorStr);


        boolean checkboxstatus = conpass.isSelected();
        System.out.println("status of check box " + checkboxstatus );

        List<WebElement> imgCount = driver.findElements(By.tagName("img"));
        System.out.println(imgCount.size());


    }
}