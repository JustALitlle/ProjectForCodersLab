package myStore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.myStore.CheckOutPage;
import pages.myStore.ClothSectionPage;
import pages.myStore.MyStoreLoginPage;
import pages.myStore.ScreenShotPage;

import java.io.IOException;
import java.time.Duration;

public class StepDefsV2 {

    private WebDriver driver;

    @Given("Open browser with test Store.")
    public void openMyStoreLoginToAddItem() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=addresses");

    }


    @When("Login on account asadas@10minutemail.com Waldekn22.")
    public void loginToMyStore() {
        MyStoreLoginPage myStoreLoginPage = new MyStoreLoginPage(driver);
        myStoreLoginPage.loginToMyStore("asadas@10minutemail.com", "Waldekn22");
    }

    @And("Go to cloth section.")
    public void chooseCategory() {
        ClothSectionPage clothSectionPage = new ClothSectionPage(driver);
        clothSectionPage.chooseCategory();
    }

    @When("Add Hummingbird Printed Sweater with size M and add 5 pieces.")
    public  void  sweaterDetails(){
        ClothSectionPage clothSectionPage = new ClothSectionPage(driver);
        clothSectionPage.hummingbirdChoice();
        clothSectionPage.sizeChoiceOfSweater();
        clothSectionPage.qualityOfSweater();
    }

    @And("Process checkout.")
    public void proceedToCheckOut() throws IOException {
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.proceedToCheckOut();

    }

    @Then("Take a screenshot of the order confirmation and the amount.")
    public void  screenShot() throws IOException {
        ScreenShotPage ScreenShotPage = new ScreenShotPage(driver);
        ScreenShotPage.main();
    }


    @And("Close browser.")
    public void closeBrowser(){
        driver.quit();
    }

}