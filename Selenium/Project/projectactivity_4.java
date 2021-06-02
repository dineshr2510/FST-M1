package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class projectactivity_4 {
    public static void main(String[] args) throws InterruptedException {
    	String originalelement="Social Media Marketing";
    	//Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
        //String entrytitle = driver.findElement(By.xpath("//h3[contains(text(), 'Email Marketing Strategies')]")).getText();
        String entrytitle = driver.findElement(By.xpath("//h3[contains(@class, 'entry-title')]")).getText();
    	System.out.println("The second most popular course is: " + entrytitle);
        if (originalelement.contentEquals(entrytitle)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        } 
    	//Close browser
        driver.close();
}}
