import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {

    SearchBar searchBar;

    By cartcountLocator = By.id("CartItemCount");
    By cartLocator = By.id("shoppingCart");
    By cookieLocator = By.id("onetrust-accept-btn-handler");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBar = new SearchBar(driver);
    }

    public SearchBar SearchBar() {
        return this.searchBar;
    }

    private int getCount() {
        String count = find(cartcountLocator).getText();
        return Integer.parseInt(count);
    }

    public boolean cartCount() {
        return getCount() > 0;

    }

    public void GoToCart() {
        click(cartLocator);
    }

    public void acceptCookies() {
        if (isDisplayed(cookieLocator)) {
            click(cookieLocator);
        }
    }
}