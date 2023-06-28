import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com";
    @Before
    public void SetBrowser(){
        openBrowser(baseUrl);
    }

@Test
public void userShouldNavigateToRegisterPageSuccessfully(){
      driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//Verify the text ‘Register’
    String expectedText = "Register";
    String actualText = driver.findElement(By.linkText("Register")).getText();
    Assert.assertEquals("Register text is not found", expectedText, actualText);

}
@Test
public void userSholdRegisterAccountSuccessfully(){
    //Verify the text ‘Register’
    String expectedText = "Register";
    String actualText = driver.findElement(By.linkText("Register")).getText();
    Assert.assertEquals("Register text is not found", expectedText, actualText);
//click on the ‘Register’ link
    WebElement linktext = driver.findElement(By.linkText("Register"));
    linktext.click();

    //Select gender radio button
    WebElement radiobutton = driver.findElement(By.xpath("//input[@value='M']"));
    radiobutton.click();

    //Enter First name
    WebElement firstNameField = driver.findElement(By.xpath("//input[@id='FirstName']"));
    firstNameField.sendKeys("milan");

    //Enter Last name
    WebElement lastNameField = driver.findElement(By.xpath("//input[@name='LastName']"));
    lastNameField.sendKeys("patel");

    //Select Day Month and Year
    WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
    day.sendKeys("10");

    WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
    month.sendKeys("January");

    WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
    year.sendKeys("2000");

    //Enter Email address
    WebElement emailField = driver.findElement(By.id("Email"));
    emailField.sendKeys("nj1234@gmail.com");

    //Enter Password
    WebElement passwordField = driver.findElement(By.id("Password"));
    passwordField.sendKeys("nj1234");

    //Enter Confirm password
    WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
    confirmPasswordField.sendKeys("nj1234");

    //Click on REGISTER button
    WebElement Registerbutton = driver.findElement(By.xpath("//button[@id='register-button']"));
    Registerbutton.click();
}





    @After
    public void QuitBrowser(){
        closeBrowser();
    }
}


