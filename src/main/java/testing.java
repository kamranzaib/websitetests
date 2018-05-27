import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

    public static void main(String[] args) {
        System.setProperty("src/driver/chromedriver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.facebook.com/login.php?login_attempt=1&lwv=111";
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[1]/div/div/h1/a")).click();{

        }


        driver.close();

    }

    }





