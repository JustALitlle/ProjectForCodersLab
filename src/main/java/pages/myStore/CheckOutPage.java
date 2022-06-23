package pages.myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
    private  WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "confirm-addresses")
    private WebElement continueInput;

    @FindBy(name = "confirmDeliveryOption")
    private WebElement confirmDeliveryOptionInput;
    @FindBy(id = "payment-option-1")
    private WebElement payByCheckInput;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsOfConditionInput;


    public void proceedToCheckOut() {


        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary"))).submit();
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary"))).click();

        continueInput.click();
        confirmDeliveryOptionInput.click();
        payByCheckInput.click();
        termsOfConditionInput.click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("payment-confirmation"))).click();

    }


}