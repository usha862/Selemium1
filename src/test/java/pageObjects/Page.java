package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {



    WebDriver driver;
    public Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="userEmail")
    WebElement userEmail;




    @FindBy(id="userPassword")
    WebElement userPwd;


    @FindBy(id="login")
    WebElement btn;



    public void gosetCredentials(String userName,String password)
    {
        userEmail.sendKeys(userName);
        userPwd.sendKeys(password);
    }


    public void gotoLogin()
    {
        btn.click();
    }









}
