import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public WebDriver driver;
    public Login(WebDriver driver){

        this.driver = driver;
    }
    public void timeLogin(){
        WebElement usernameTextBox = driver.findElement(By.id("user-name"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement loginButtonBox = driver.findElement(By.id("login-button"));

        usernameTextBox.sendKeys("standard_user");
        passwordTextBox.sendKeys("secret_sauce");
        loginButtonBox.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




}



