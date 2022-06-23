package myStore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.myStore.CreateNewAddressPage;
import pages.myStore.FillTheNewAddressFormPage;
import pages.myStore.MyStoreLoginPage;

import java.time.Duration;

public class StepDefs {

    private WebDriver driver;

    @Given("open browser with test Store")
    public void openMyStoreLogin() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=addresses");

    }

    @When("login on account asadas@10minutemail.com Waldekn22")
    public void loginToMyStore() {
        MyStoreLoginPage myStoreLoginPage = new MyStoreLoginPage(driver);
        myStoreLoginPage.loginToMyStore("asadas@10minutemail.com", "Waldekn22");
    }

    @And("create new address")
    public void createNewAddress() {
        CreateNewAddressPage createNewAddress = new CreateNewAddressPage(driver);
        createNewAddress.createNewAddressClick();
    }

    @When("fill out the form of new address with {word}, {word}, {word}, {word}, {word}")
    public void fillOutNewAddress(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5) {
        FillTheNewAddressFormPage fillOutNewAddress = new FillTheNewAddressFormPage(driver);
        fillOutNewAddress.NewAddressRegister(keyword1, keyword2, keyword3, keyword4, keyword5);
    }

    @Then("new address should be added")
    public void addNewAddress() {
        FillTheNewAddressFormPage fillOutNewAddressButton = new FillTheNewAddressFormPage(driver);
        fillOutNewAddressButton.AddNewAddress();

        CreateNewAddressPage createNewAddress = new CreateNewAddressPage(driver);
       Assert.assertEquals("Address successfully added!", createNewAddress.getAddressNotify());




    }

    @And("close the browser")
    public void closeBrowser() {
        driver.quit();
    }

}
