package login.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import login.settings.AppiumSetting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginStep extends AppiumSetting{

    private String username;
    private String password;

    @Given("^the username a \"(.*?)\"$")
    public void the_username_a(String username) throws Throwable {
        this.username = username;
    }

    @Given("^the password a \"(.*?)\"$")
    public void the_password_a(String password) throws Throwable {
        this.password = password;
    }

    @When("^user click log in button$")
    public void user_click_log_in_button() throws Throwable {
        WebElement edtUsername = getDriver().findElement(By.id("com.example.vee.androidappiumcucumber:id/editTextUserName"));
        edtUsername.sendKeys(username);
        WebElement edtPassword = getDriver().findElement(By.id("com.example.vee.androidappiumcucumber:id/editTextPassword"));
        edtPassword.sendKeys(password);
        WebElement btnLogin = getDriver().findElement(By.id("com.example.vee.androidappiumcucumber:id/btnLogin"));
        btnLogin.click();
    }

    @Then("^show data$")
    public void show_data() throws Throwable {
        WebElement tvResult = getDriver().findElement(By.id("com.example.vee.androidappiumcucumber:id/tvResult"));
        assertEquals("Pass" ,tvResult.getText().toString() );

        Thread.sleep(3000);

        getDriver().quit();
    }

}
