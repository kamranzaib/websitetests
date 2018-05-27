import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//Mouse DropDown Hover Menu Test//




public class mouseTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("src/driver/chromedriver", "G:\\chromedriver.exe");

        driver.get("https://www.nike.com/us/en_us/");

        WebElement menu = driver.findElement(By.linkText("MEN"));
//        WebElement menuOptions = driver.findElement(By.xpath("//*[@id=\"gnav-bar--section-menu-subnav--men\"]/div/div/div[2]/div/div"));
     //   WebElement basketball = driver.findElement(By.xpath("//*[@id=\"gnav-bar--section-menu-subnav--men\"]/div/div/div[2]/div/div/ul/li[6]/a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Jordan")).click();

    }



    /**public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement elementToClick) {
       Actions action = new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }


        public static void Hover(WebDriver driver, WebElement element) {
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }**/

    }







