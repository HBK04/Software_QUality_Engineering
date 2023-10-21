import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Time;


public class Main {
    public static void main(String args[]) throws Exception{
        System.out.println("Assignment_20B-036-SE");
        try{
            System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            WebDriver driver    = new ChromeDriver(co);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            // For Login Page:
            Login login = new Login(driver);
            login.timeLogin();
            // For Product Listing Page:
            ProductListingPage productListingPage = new ProductListingPage(driver);
            productListingPage.SelectRandomProduct();
            productListingPage.AddtoCart();
            // For Viewing Cart:
            Cart cart = new Cart(driver);
            cart.ViewCart();
            Checkout checkout = new Checkout(driver);
            checkout.ProceedtoCheckout();
            checkout.info();
            checkout.Finish();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
