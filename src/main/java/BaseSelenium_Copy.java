import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSelenium_Copy {
    public static void setupChromeDriver(String url) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\garich01\\Desktop\\3PT\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
