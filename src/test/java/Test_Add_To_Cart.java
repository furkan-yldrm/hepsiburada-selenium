import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Add_To_Cart {

    HomePage homePage;
    ProductsPage  productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    public void Search_Product(){
        homePage.SearchBar().search("Notebook");
        Assertions.assertTrue(productsPage.isOnProductsPage(), "Not on products page!");
    }

    @Test
    public void Select_Product(){
        productsPage.SelectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page!");
    }

    @Test
    public void Add_To_Cart(){
        productDetailPage.AddToCart();
        Assertions.assertTrue(homePage.cartCount(), "Count did not increase!");
    }

    @Test
    public void Goto_Cart(){
        homePage.GoToCart();
        Assertions.assertTrue(cartPage.checkCart(), "Product was not added!!");
    }
}
