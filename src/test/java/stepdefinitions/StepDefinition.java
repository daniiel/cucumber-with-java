package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDefinition {

    @Given("^validate the browser$")
    public void validate_the_browser() {
        System.out.println("background - given");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() {
        System.out.println("background - when");
    }

    @Then("^check is browser is started$")
    public void check_is_browser_is_started() {
        System.out.println("background - then \n\n");
    }

    @Given("User is on landing page")
    public void user_is_on_loading_page() {
        System.out.println("Logged in success");
    }

    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String username, String password) {
        System.out.println("username: " + username + " password: " + password);
    }

    @When("User sign up with following details")
    public void user_sign_up_with_following_details(DataTable dataTable) {

        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            System.out.println(columns.get("name"));
            System.out.println(columns.get("code"));
            System.out.println(columns.get("email"));
            System.out.println(columns.get("phone"));
        }
    }

    @Then("Homepage is displayed")
    public void homepage_is_displayed() {
        System.out.println("validated home page");
    }

    @And("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
        System.out.println("cards displayed");
    }

    @When("^User login in to application with (.+) and password (.+)$")
    public void userLoginIntoApplicationWithUsernameAndPasswordPassword(String username, String password) {
        System.out.println("username: " + username + ", password: " + password);
    }
}
