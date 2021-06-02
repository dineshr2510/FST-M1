package examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumtest {
    public static void main(String[] args) throws InterruptedException {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.close();
    }
}