package bdd.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class stepDefMeesho {
	WebDriver driver;
	
	@When("user can open {string} browser")
	public void user_can_open_browser(String browser) {
	    switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			break;
		}
	}
	@Then("user enter app url {string}")
	public void user_enter_app_url(String url) {
	    driver.get(url);
	}
	@Then("verify that user landed in right application page")
	public void verify_that_user_landed_in_right_application_page() {
		String title= driver.getTitle();
		org.junit.Assert.assertEquals("Online Shopping Site for Fashion, Electronics, Home & More | Meesho", title);
		
	}
	@Then("verify that user can able  to move to element {string}")
	public void verify_that_user_can_able_to_move_to_element(String product) {
	    Actions act=new Actions(driver);
	    WebElement title = driver.findElement(By.xpath("//span[text()='"+product+"']"));
	    act.moveToElement(title).build().perform();
	}
	@Then("verify that user can able to click the {string}")
	public void verify_that_user_can_able_to_click_the(String beauty) {
	WebElement products=  driver.findElement(By.xpath("//p[contains(text(),'"+beauty+"')]"));
	products.click();
	}
	@Then("verify that user landed in right page {string}")
	public void verify_that_user_landed_in_right_page(String pagetitle) {
		for(String id:driver.getWindowHandles()) {
			driver.switchTo().window(id);
		if(pagetitle.contains(driver.getTitle())) {
			break;
		}
		    
		}
			}

	@Then("verify that user able to click")
	public void verify_that_user_able_to_click() {
		WebElement click= driver.findElement(By.xpath("//a[text()=\"Men Keychains\"]")); 
		click.click();
	}








}
