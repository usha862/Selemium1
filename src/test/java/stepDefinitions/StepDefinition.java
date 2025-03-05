package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.Page;

public class StepDefinition {


  public WebDriver driver;
  public Page page;

    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Initialize driver with options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        page = new Page(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
  driver.get(url);
    }

    @When("User enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
     page.gosetCredentials(email, password);
    }

    @Then("Click on login")
    public void click_on_login() {
    page.gotoLogin();
    }

    @And("close the browser")
    public void close_the_browser() {
    driver.quit();
    }












}
