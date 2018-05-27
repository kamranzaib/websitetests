import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class uploadfiles  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("src/driver/chromedriver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://files.fm/";
       // String filePath = "/Users/kamranzaib/Desktop/selenium.rtf";

        driver.get(baseUrl);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"uploadifive-file_upload\"]")).click();
        driver.switchTo()
                .activeElement()
                .sendKeys(
                        "//Users/kamranzaib/Desktop/selenium.rtf");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);







    }


    }

    /** driver.findElement(By.id("convertButton"));
     /*
     * driver.switchTo().activeElement()
     * .sendKeys("selenium_2_testing_tools.pdf"); ;
     *
         {
                 driver.wait(30000);
                 } catch (Exception er) {
                 System.out.println(er);
                 }

                 }**/