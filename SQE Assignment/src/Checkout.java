import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Checkout {
    private WebDriver driver;

    public Checkout(WebDriver driver){
        this.driver = driver;
    }

    public void ProceedtoCheckout(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
    }
    public void info(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement firstnametextbox = driver.findElement(By.id("first-name"));
        firstnametextbox.sendKeys("Muhammad Haseeb");
        WebElement lastnametextbox = driver.findElement(By.id("last-name"));
        lastnametextbox.sendKeys("Khalid");
        WebElement PostalAddresstextbox = driver.findElement(By.id("postal-code"));
        PostalAddresstextbox.sendKeys("75300");
        WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();
    }
    public void Finish(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
    }
}
