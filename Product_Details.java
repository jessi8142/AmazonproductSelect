package product_select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Product_Details {
	WebDriver driver ;

	
@BeforeClass
public void openApplication () {
	driver = new FirefoxDriver();
	System.out.println("Amazon Application started");
	driver.navigate().to("https://www.amazon.in/");
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	System.out.println("Login into application");
	Reporter.log("Application Login");
	}
@AfterClass
public void CloseApplication() {
driver.close();
Reporter.log("Application Closed");
}


@Test
	public void Login () {
		driver.findElement(By.id("ap_email")).sendKeys("venkataprashanth8142@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Venkat@8142");
		driver.findElement(By.id("signInSubmit")).click();
		
}
@Test
		public void clickOnProduct() throws Exception {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("colgate toothpaste");
			driver.findElement(By.id("nav-search-submit-button")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
			driver.findElement(By.id("a-autoid-3-announce")).click();
			
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.id("nav-cart-text-container")).click();
		
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		System.out.println("Amazon Application Closed");
		
		
}

		}
		
		
		
	
	


