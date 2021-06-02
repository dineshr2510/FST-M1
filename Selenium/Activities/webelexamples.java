package examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelexamples {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        WebElement input = driver.findElement(By.id("firstname"));
        input.sendKeys("Test");
        String inputText = input.getAttribute("value");
        System.out.println(inputText);        
        driver.close();
    }
}