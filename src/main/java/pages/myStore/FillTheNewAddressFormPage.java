package pages.myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FillTheNewAddressFormPage {

    private  WebDriver driver;

    public FillTheNewAddressFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "alias")
    private WebElement aliasInput;
    @FindBy(name = "address1")
    private WebElement addressInput;
    @FindBy(name = "city")
    private WebElement cityInput;
    @FindBy(name = "postcode")
    private WebElement postcodeInput;
    @FindBy(name = "phone")
    private WebElement phoneInput;
    @FindBy(xpath = "//select/option[@value='17']")
    private WebElement countryInput;


    public void NewAddressRegister(String alias, String address, String city, String postcode, String phone) {
        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        postcodeInput.sendKeys(postcode);
        countryInput.click();
        phoneInput.sendKeys(phone);
    }

    public void AddNewAddress() {
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.btn-primary.float-xs-right"))).click();


    }


}







