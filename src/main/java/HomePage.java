import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage{

    SearchBar searchBar;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBar = new SearchBar(driver);
    }

    public SearchBar SearchBar() {

    }

    public boolean cartCount() {
        return false;
    }

    public void GoToCart() {
    }
}
