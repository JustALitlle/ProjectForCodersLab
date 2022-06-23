package pages.myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothSectionPage {
    private WebDriver driver;

    public ClothSectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "category-3")
    private WebElement clothCategories;

    @FindBy(xpath = "//a[@href='https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s']")
    private WebElement sweaterChoice;

    @FindBy(xpath = "//select/option[@value='2']")//Zmiana Vaule od 1-4 to zmiania rozmiarów S, M ,L , XL )
    private WebElement sizeChoiceInput;

    @FindBy(id = "quantity_wanted")
    private WebElement qualityOfSweaterInput;

    @FindBy(className = "add-to-cart")
    private WebElement addToCart;

    public void chooseCategory() {
        clothCategories.click();
    }

    public void hummingbirdChoice() {
        sweaterChoice.click();

    }

    public void sizeChoiceOfSweater() {
        sizeChoiceInput.click();
    }


    public void qualityOfSweater() {

        qualityOfSweaterInput.clear();
        qualityOfSweaterInput.sendKeys("5");//Zmiana tego powoduje zmiane parametu ilości sztuk ( jako opcja dodatkowa )
        addToCart.click();


    }
    public String getDiscountText(){
        WebElement discountText = driver.findElement(By.className("discount discount-percentage"));
        return discountText.getText();
    }
}
