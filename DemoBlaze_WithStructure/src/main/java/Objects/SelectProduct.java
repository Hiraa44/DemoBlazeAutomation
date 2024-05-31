package Objects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProduct {

	 WebDriver driver;
public SelectProduct(WebDriver driver) {
		 this.driver=driver;
	 }
	 
public void Redirect(){
		
	 driver.navigate().to("https://www.demoblaze.com/prod.html?idp_=1");
		
	 }
public void ClickButton() {
	 Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")));
	   // driver.manage().timeouts().setScriptTimeout(100,SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	    
}
     public void ClickContact(String email,String name, String text) {
    	 
	 driver.findElement(By.xpath("//*[@id=\"navbarExample\"]//a[@href=\"#\"]")).click();
	 Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	 WebElement el=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"form-group\"]//input[@id=\"recipient-email\"]")));
	 WebElement e2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"form-group\"]//input[@id=\"recipient-name\"]")));
	 WebElement e3= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"form-group\"]//textarea[@id=\"message-text\"]")));

     el.sendKeys(email);
     e2.sendKeys(name);
     e3.sendKeys(text);
	 driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
	 
	 
}
     public void AcceptAlert() {
    	 Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	 wait.until(ExpectedConditions.alertIsPresent());
    	 Alert alert = driver.switchTo().alert();
    	 alert.accept();

     }
  public void Screenshot() throws IOException {
	  TakesScreenshot  scr=(TakesScreenshot)driver;
	  scr.getScreenshotAs(OutputType.FILE);
	  File dest = new File("C:\\Users\\h.ali\\Desktop\\DemoBlaze_WithStructure\\Screenshots\\ABC.jpg");
	  FileHandler.copy((File) scr, dest);
	
}

}
