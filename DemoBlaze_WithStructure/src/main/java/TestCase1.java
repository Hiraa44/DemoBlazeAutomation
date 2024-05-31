import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import Objects.SelectProduct;
public class TestCase1 {
	
	static WebDriver driver= new ChromeDriver();
	@BeforeTest()
	public void Function1() throws IOException {
	
	System.setProperty("webdriver.chrome.drvier", "C:\\Users\\h.ali\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
	
	driver.get("https://www.demoblaze.com/");
	}
	
	@Test(priority=1)
	public void Navigate_to_product() {
	
	SelectProduct p1= new SelectProduct(driver);
	p1.Redirect();
	p1.ClickButton();
	p1.AcceptAlert();
	
	}
    @Test(priority=0)
    public void ClickContact() {
       String email ="xyz@yahoo.com";
       String name = "Raj";
       String text = "This website is working fine!";
    	SelectProduct p2= new SelectProduct(driver);
    	
    	
    	p2.ClickContact(email,name, text);
    	p2.AcceptAlert();
    	//Add inputs
    	//*[@id="exampleModal"]/div/div/div[3]/button[2]
    }
	
	
}
	
	  		   






