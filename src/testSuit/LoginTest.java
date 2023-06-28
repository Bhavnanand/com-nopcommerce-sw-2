package testSuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public void setupBrowser(){
        openBrowser(" https://demo.nopcommerce.com/");
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        driver.findElement(By.xpath(("//a[text() ='Log in']"))).click();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//a[strartswith@text()='Welcome']"));
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.xpath(("//input[@id='Email']"))).sendKeys("Prime123@gmail.com");
        driver.findElement(By.xpath("(\"//input[@id='Password']\")")).sendKeys("Prime123");
        driver.findElement(By.xpath("(\"//button[@fdprocessedid='mrznc']\")\n")).sendKeys("Prime123");
    WebElement checklogout =driver.findElement(By.xpath("(\"//a[text()='Log out']\")"));
        System.out.println(checklogout);
    }

    @Test
    public void verifyTheErrorMessage() {
        driver.findElement(By.xpath("//input[@id='Email']")).click();
        driver.findElement(By.xpath(("//input[@id='Email']"))).sendKeys("nj1234@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nj1234");
        String expected ="Login was unsuccessful. Please correct the errors and try again. No customer account found";
        String actual = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not dispayed",expected,actual);

    }

@After
public void tearDown(){
        closeBrowser();
}
}
