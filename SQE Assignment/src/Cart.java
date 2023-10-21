import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Cart {
    private WebDriver driver;

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public void ViewCart() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        cart.click();
    }

}


