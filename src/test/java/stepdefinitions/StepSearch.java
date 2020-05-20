package stepdefinitions;

import com.automation.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CheckoutPage;
import pages.HomePage;

public class StepSearch extends Base {

    HomePage homePage;
    CheckoutPage checkoutPage;

    @Given("User is on Greencart landing page")
    public void user_is_on_Greencart_landing_page() {
        driver = Base.getDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_vegetable(String value) {
        homePage = new HomePage(driver);
        homePage.searchVegetable(value);
    }

    @Then("{string} results are displayed")
    public void results_are_displayed(String value) {
        Assert.assertTrue(homePage.getProductName().getText().toLowerCase().contains(value));
    }

    @When("Added items to cart")
    public void added_items_to_cart() {
        homePage.increment().click();
        homePage.addToCart().click();
    }

    @When("User proceed to checkout page for purchase")
    public void user_proceed_to_checkout_page_for_purchase() {
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }

    @Then("^verify selected (.+) items are displayed in check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String value) {
        checkoutPage = new CheckoutPage(driver);
        Assert.assertTrue(checkoutPage.getProductName().getText().contains(value));
    }


}
