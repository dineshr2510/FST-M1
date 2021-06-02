package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath1 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://www.training-support.net/selenium");
        WebElement mainButton = driver.findElement(By.xpath("//button[contains(@class, 'blue')]"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[@class='ui inverted huge blue button']"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[@onClick='showContent()']"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[text()='Get Started!']"));
        
        System.out.println(mainButton.getText());
        mainButton.click();
        
        WebElement heading = driver.findElement(By.xpath("//div[@id='content']"));
        System.out.println(heading.getText());
        //driver.close();
    }
}