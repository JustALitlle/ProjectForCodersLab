package pages.myStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAddressPage {
    private WebDriver driver;

    public CreateNewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=address']")
    private WebElement createNewAddressClick;

    @FindBy(id = "notifications")
    private WebElement checkAddressBodyOutput;


    public void createNewAddressClick() {

        createNewAddressClick.click();
    }

    public String getAddressNotify() {
        return checkAddressBodyOutput.getText();
    }

    }



