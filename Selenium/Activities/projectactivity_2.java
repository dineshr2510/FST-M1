package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class projectactivity_2 {

	    public static void main(String[] args) throws InterruptedException {
	    	String originalclassNameLocator="Learn from Industry Experts";
	    	//Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        //Open the browser
	        driver.get("https://alchemy.hguy.co/lms");
	        WebElement classNameLocator = driver.findElement(By.className("uagb-ifb-title"));
	    	System.out.println("Text in element: " + classNameLocator.getText());
	        if (originalclassNameLocator.contentEquals(classNameLocator.getText())){
	            System.out.println("Pass");
	        } else {
	            System.out.println("Fail");
	        }
	   	    driver.close();
}
}
