import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By categorytextLocator = By.xpath("//div[normalize-space()='Kategori']");

    By productnameLocator = By.xpath("//li[@class='productListContent-zAP0Y5msy8OHn5z7T_K_']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {
        return isDisplayed(categorytextLocator);
    }

    private List<WebElement> getAllProducts(){
        return findAll(productnameLocator);
    }
    public void SelectProduct(int i) {
        getAllProducts().get(i).click();
    }
}
