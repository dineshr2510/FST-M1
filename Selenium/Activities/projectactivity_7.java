package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class projectactivity_7 {
	    public static void main(String[] args) throws InterruptedException {
	    	String originalelement="My Account";
	    	//Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        //Open the browser
	        driver.navigate().to("https://alchemy.hguy.co/lms");  
	        //driver.get("https://alchemy.hguy.co/lms");
	        //Select button = new Select(driver.findElement(By.xpath("//a[contains(@href, 'my-account')]")));  
	        driver.findElement(By.xpath("//a[contains(@href, 'my-account')]")).click();
	        //String entrytitle = driver.findElement(By.xpath("//h3[contains(text(), 'Email Marketing Strategies')]")).getText();
	        //String entrytitle = driver.findElement(By.xpath("//a[contains(@href, 'my-account')]")).getText();
	        String entrytitle = driver.findElement(By.xpath("//h1[contains(@class,'uagb-ifb-title')]")).getText();
	    	System.out.println("The title is: " + entrytitle);
	        if (originalelement.contentEquals(entrytitle)){
	            System.out.println("You are on the correct page");
	        } else {
	            System.out.println("You are on the incorrect page");
	        } 
	        driver.findElement(By.xpath("//a[contains(@href, 'login')]")).click();
	        WebElement userName = driver.findElement(By.xpath("//input[contains(@id, 'user_login')]"));	    	
	        WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'user_pass')]"));
	        userName.sendKeys("root");	    	
	        password.sendKeys("pa$$w0rd");
	        driver.findElement(By.xpath("//input[contains(@class, 'button button-primary')]")).click();
	        driver.findElement(By.xpath("//img[contains(@class, 'avatar')]")).getText();
	        String loginMessage = driver.findElement(By.xpath("//h1[contains(@class,'uagb-ifb-title')]")).getText();
	    	System.out.println("Login message: " + loginMessage);
	        //Close browser
	        driver.close();
	}
	    }

