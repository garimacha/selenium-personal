import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by garich01 on 4/6/2017.
 */
public class BaseSelenium {

    //protected static WebDriver driver;
    //ChromeDriver driver;


    public static void setupIE(String url) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\garich01\\Desktop\\3PT\\chromeDriver\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get(url);

        /*DesiredCapabilities caps= new ChromeDriver()
                .setLocation();*/

    }

    //below is the new way of creating a firefox driver in 3.3.0
   /* DesiredCapabilities caps = new FirefoxOptions()
            // For example purposes only
            .setProfile(new FirefoxProfile())
            .addTo(DesiredCapabilities.firefox());
    WebDriver driver = new FirefoxDriver(caps);*/
}
