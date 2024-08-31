import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_To_Cart extends BaseTest{

    HomePage homePage;
    ProductsPage  productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void Search_Product(){

        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.SearchBar().search("iphone");
        Assertions.assertTrue(productsPage.isOnProductsPage(), "Not on products page!");
    }

    @Test
    @Order(2)
    public void Select_Product(){

        productDetailPage = new ProductDetailPage(driver);
        productsPage.SelectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page!");
    }

    @Test
    @Order(3)
    public void Add_To_Cart(){
        productDetailPage.AddToCart();
        Assertions.assertTrue(homePage.cartCount(), "Count did not increase!");
        productDetailPage.closePopUp();
    }

    @Test
    @Order(4)
    public void Goto_Cart(){

        cartPage = new CartPage(driver);
        homePage.GoToCart();
        Assertions.assertTrue(cartPage.checkCart(), "Product was not added!!");
    }
}
