import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBar extends BasePage{

    By searchBarLocator = By.xpath("//input[@class='theme-IYtZzqYPto8PhOx3ku3c theme-JOTHTAYrQhCBEf9bVgI8']");

    By searchbuttonLocator = By.xpath("//div[@class='searchBoxOld-yDJzsIfi_S5gVgoapx6f']");

    public SearchBar(WebDriver driver) {
        super(driver);
    }

    public void search(String text){
        type(searchBarLocator, text);
        click(searchbuttonLocator);
    }
}
