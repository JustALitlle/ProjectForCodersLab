package pages.myStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage {

    public MyStoreLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    private WebElement loginEmailInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(id = "submit-login")
    private WebElement submitLoginButton;

    public void loginToMyStore(String email, String password) {
        loginEmailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitLoginButton.click();
    }
}
