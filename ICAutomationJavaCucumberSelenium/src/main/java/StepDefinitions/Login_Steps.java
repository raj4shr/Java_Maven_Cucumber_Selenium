package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MainBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;

public class Login_Steps {

    @BeforeTest
    public void SetUp()
    {
        MBS= new MainBaseClass();
        MBS.SetUp();
    }
    private WebDriver chromeDriver;
    MainBaseClass MBS;
    @Given("the user access the IC login portal page")
    public void the_user_access_the_ic_login_portal_page() throws InterruptedException {
        chromeDriver= MainBaseClass.chromeDriver;
        Thread.sleep(3000);
    }
    @When("the user enters a valid username")
    public void the_user_enters_a_valid_username() {
        chromeDriver.findElement(By.id("UserName")).sendKeys("hari");
    }
    @And("the user enters a valid password")
    public void the_user_enters_a_valid_password() {
        chromeDriver.findElement(By.id("Password")).sendKeys("123123");
    }
    @And("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        chromeDriver.findElement(By.xpath("//input[@type='submit'][@value='Log in']")).click();
    }
    @Then("the user is directed to the IC connect home page")
    public void the_user_is_directed_to_the_ic_connect_home_page() throws InterruptedException {

        assertEquals(chromeDriver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Hello hari!')]")).getText(), "Hello hari!");
        //Thread.sleep(3000);

    }

    @AfterTest
    public void TearDown()
    {
        MBS.TearDown();
    }

}
