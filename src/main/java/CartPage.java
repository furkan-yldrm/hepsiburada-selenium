import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{

    By productcartLocator = By.xpath("//div[@class='product_name_2Klj3']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkCart() {
        return getProducts().size() > 0 ;
    }

    private List<WebElement> getProducts(){
        return findAll(productcartLocator);
    }
}
