package StepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MainBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Create_New_Time_And_Material {
    public WebDriver chromeDriver;
    MainBaseClass MBS;

    @Before
    public void SetUp()
    {
        MBS=new MainBaseClass();
        MBS.SetUp();
    }
    @Given("the user access the create new time and material page")
    public void the_user_access_the_create_new_time_and_material_page() {
        MBS.loginToPortal();
        MBS.chromeDriver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Administration')]")).click();
        MBS.chromeDriver.findElement(By.xpath("//a[@href='/TimeMaterial'][contains(text(),'Time & Materials')]")).click();
        MBS.chromeDriver.findElement(By.xpath("//a[@class='btn btn-primary'][contains(text(),'Create New')]")).click();
    }
    @When("the user selects the typecode from the dropdown list box")
    public void the_user_selects_the_typecode_from_the_dropdown_list_box() {

    }
    @And("the user enters a valid code")
    public void the_user_enters_a_valid_code() {

    }
    @And("the user enter a description")
    public void the_user_enter_a_description() {

    }
    @And("the user enters a valid price per unit")
    public void the_user_enters_a_valid_price_per_unit() {

    }
    @And("the user clicks on the save button")
    public void the_user_clicks_on_the_save_button() {

    }
    @Then("the record is saved and the user is directed to the main time and material page")
    public void the_record_is_saved_and_the_user_is_directed_to_the_main_time_and_material_page() {

    }

    @After
    public void TearDown()
    {
        MBS.TearDown();
    }


}
