package testSuit;

import browserfactory.BaseTest;
import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Locale;

public class TopMenuTest extends BaseTest {
    String baseUrl=("https://demo.nopcommerce.com/ ");
    @Before
    public void SetBrowser(){
        openBrowser(baseUrl);
    }

@Test
public void userShouldNavigateToComputerPageSuccessfully() {
    driver.findElement(By.xpath(("//ul[@class='top-menu notmobile']//a[text()='Computers ']"))).click();
    String actual = driver.findElement(By.xpath("//div[h1='Computers']")).getText();
    String Expected = "Computers";
    Assert.assertEquals("Expected and Actual text are equal",Expected,actual);
}

@Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
    driver.findElement(By.xpath(("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"))).click();
    driver.findElement(By.xpath(("//h1[text()='Electronics ']")));
    String expected = "Electronics ";
    String actual = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();

    Assert.assertEquals("Expected and Actual text are not same",expected,actual);
}

@Test
public void userShouldNavigateToApparelPageSuccessfully(){
driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
String actual =driver.findElement(By.xpath(("//h1[text()='Apparel']"))).getText();
String expected ="Apparel";
Assert.assertEquals("Actual and expected are same",actual,expected);
}

@Test
public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
      driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
      String actual = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
      String expected ="Digital downloads";
      Assert.assertEquals("Expected and Actual are not equal",expected,actual);

}

@Test
public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[Text()='Books ']")).click();
        String actual = driver.findElement(By.xpath("//h1[text()='Books ']")).getText();
        String expected = "Books ";
        Assert.assertEquals("Expected and actual are not equal",expected,actual);
}

@Test
public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        String actual = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        String expexcted= "Jewelry";
        Assert.assertEquals("Actual and expected are not equal",expexcted,actual);
}

@Test
public void userShouldNavigateToGiftCardsPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        String actual = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        String expected ="Gift Cards";
        Assert.assertEquals("Expected and actual are not equal",expected,actual);
}


   @After
    public void QuitBrowser(){
        closeBrowser();
    }
}
