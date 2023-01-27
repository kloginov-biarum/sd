import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    protected WebDriver driver;

    @FindBy(id = "user-name")
    WebElement userNameField;

    @FindBy(id = "password")
    WebElement passwordFiled;

    @FindBy(id ="login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @Step("Filling out user name and pass and push the Login button")
    public void loginValidUser(User user){
        userNameField.sendKeys(user.getName());
        passwordFiled.sendKeys(user.getPassword());
        loginButton.click();
       // return new LoginPage(driver);
    }
}
