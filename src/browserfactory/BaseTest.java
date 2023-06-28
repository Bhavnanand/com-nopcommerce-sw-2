package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public void openBrowser(String baseUrl){

        driver = new ChromeDriver();

        //open the baseUrl
        driver.get(baseUrl);
        //maximize the screen
        driver.manage().window().maximize();
        //set implicite wait ime
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.close();
    }
    }

