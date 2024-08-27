import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addtocartLocator = By.xpath("//button[@class='sf-AxhDW iTKpDL spn1e406fsu z8QiDixMPSOOi87wSJ1D']");
    By popupLocator = By.xpath("//button[normalize-space()='Sepete git']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addtocartLocator);
    }

    public void AddToCart() {
        click(addtocartLocator);
    }

    public void closePopUp(){
        click(popupLocator);
    }
}
