import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

//for Building Series of Multiple Actions

public class sendingTexts {
    public static void main(String[] args) {


        System.setProperty("src/driver/chromedriver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.facebook.com/";
        driver.get(baseUrl);

        WebElement txtUsrname = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder.moveToElement(txtUsrname).click()
                .keyDown(txtUsrname, Keys.SHIFT).sendKeys(txtUsrname, "kamxeb")
                .keyUp(txtUsrname, Keys.SHIFT).doubleClick(txtUsrname).build();
        seriesOfActions.perform();

        //driver.quit();

    }
}