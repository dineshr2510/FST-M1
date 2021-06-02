package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class projectactivity_1 {

	    public static void main(String[] args) throws InterruptedException {
	    	String originalTitle="Alchemy LMS – An LMS Application";
	    	//Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        //Open the browser
	        driver.get("https://alchemy.hguy.co/lms");
	        //Check the title of the page
	    	String actualTitle = driver.getTitle();
		    //Print the title of the page
		    System.out.println("Page title is: " + actualTitle);
	        if (actualTitle.contentEquals(originalTitle)){
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
		    driver.close();
}
}