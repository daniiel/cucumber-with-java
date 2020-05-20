package stepdefinitions;

import com.automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

    @Before("@MobileTest")
    public void beforeValidation() {
        System.out.println(">>BEFORE hook ");
    }

    @After("@MobileTest")
    public void afterValidation() {
        System.out.println(">>AFTER hook ");
    }

    @After("@SeleniumTest")
    public void afterMethod() {
        driver.close();
    }
}
