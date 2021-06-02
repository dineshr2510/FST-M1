package activities;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class projectactivity_3 {

		    public static void main(String[] args) throws InterruptedException {
		    	String originalelement="Actionable Training";
		    	System.out.println("Text in element: " + originalelement);
		    	//Create a new instance of the Firefox driver
		        WebDriver driver = new FirefoxDriver();
		        //Open the browser
		        driver.get("https://alchemy.hguy.co/lms");
		        WebElement element = driver.findElement(By.tagName("h3"));
		        //driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		        //String str = divElement.getText();
		        System.out.println("Text in element: " + element.getText());
		        if (originalelement.contentEquals(element.getText())){
		            System.out.println("Pass");
		        } else {
		            System.out.println("Fail");
		        } driver.close();
	}
	}

