import org.openqa.selenium.By;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ProductListingPage {
    private static WebDriver driver;

    public ProductListingPage(WebDriver driver){

        this.driver = driver;
    }
    public void SelectRandomProduct(){
        List<WebElement> inventoryList = driver.findElements(By.className("inventory_item"));
        Random random = new Random();
        int Number = random.nextInt(inventoryList.size());
        WebElement RandomProduct = inventoryList.get(Number);

        String Name = RandomProduct.findElement(By.className("inventory_item_name")).getText();
        String Price = RandomProduct.findElement(By.className("inventory_item_price")).getText();
        RandomProduct.findElement(By.className("inventory_item_name")).click();

      //      Verifying:


        WebElement ProductName = driver.findElement(By.className("inventory_details_name"));
        WebElement ProductPrice = driver.findElement(By.className("inventory_details_price"));

        String RealName = ProductName.getText();
        String RealPrice = ProductPrice.getText();

        if(RealName.equals(Name) & RealPrice.equals(Price)) {
            System.out.println("Name and Price of Product Verified! ");
        } else {
            System.out.println("Name and price of Product not Verified! ");
        }

    }
    public void AddtoCart(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement addtocartbutton = driver.findElement(By.className("btn_primary"));
        addtocartbutton.click();
    }
}
