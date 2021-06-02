package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testprog2 {
    public static void main(String[] args) throws InterruptedException {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
       // WebElement mainButton = driver.findElement(By.xpath("//button[contains(@class, 'blue')]"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[@class='ui inverted huge blue button']"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[@onClick='showContent()']"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[text()='Get Started!']"));
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text(),'confirmPassword']/following::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(),'mail')]/following-sibling::input"));
        userName.sendKeys("NewUser");
        password.sendKeys("Password");
        confirmPassword.sendKeys("Password");
        email.sendKeys("real_email@xyz.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign-Up')]")).click();
     driver.close();
    }
}