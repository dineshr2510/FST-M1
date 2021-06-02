package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testprog {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
       // WebElement mainButton = driver.findElement(By.xpath("//button[contains(@class, 'blue')]"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[@class='ui inverted huge blue button']"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[@onClick='showContent()']"));
       // WebElement mainButton = driver.findElement(By.xpath("//button[text()='Get Started!']"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@id=['input-text']"));
        checkbox.click();
        
        System.out.println("Is the checkbox visible? " + checkbox.isDisplayed());
        System.out.println("Is the checkbox selected? " + checkbox.isSelected());
        
        driver.findElement(By.id("toggleCheckbox")).click();
        
        System.out.println("Is the checkbox visible? " + checkbox.isDisplayed());
        System.out.println("Is the checkbox selected? " + checkbox.isSelected());
        
        driver.close();
    }
}