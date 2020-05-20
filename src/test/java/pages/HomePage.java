package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public WebDriver driver;

    By search = By.xpath("//input[@type='search']") ;
    By productName = By.cssSelector("h4.product-name");
    By increment = By.cssSelector("a.increment");
    By addToCart = By.xpath("//button[contains(.,'ADD TO CART')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchVegetable(String value) {
        driver.findElement(search).sendKeys(value);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".products div.product"), 1));
    }

    public WebElement getSearch() {
        return driver.findElement(search);
    }

    public WebElement getProductName() {
        return driver.findElement(productName);
    }

    public WebElement increment() {
        return driver.findElement(increment);
    }

    public WebElement addToCart() {
        return driver.findElement(addToCart);
    }

}
