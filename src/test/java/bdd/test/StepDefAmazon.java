package bdd.test;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.*;

public class StepDefAmazon {
	
	WebDriver driver;
	
	@Given("User can open {string} browser")
	public void openBroswer(String browser)
	{
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
	}
	
	@Then("User can open application url {string}")
	public void openApplication(String url)
	{
		driver.get(url);
	}
	
	@And("Verify that user landed in right application")
	public void verifyApplicationLandedPage()
	{
		String title=driver.getTitle();
		Assert.assertEquals("Online Shopping site in India: Shop Online for "
				+ "Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
	}
	
	@When("User enter the Moblie {string} in search text box")
	public void enterMobileItem(String item)
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
	}
	
	@Then("User click search icon")
	public void clickSerachIcon()
	{
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@And("User able to select mobile in search list {string}")
	public void selectMobileFromList(String mobile)
	{
		driver.findElement(By.xpath("(//span[contains(text(),'"+mobile+"')])[1]")).click();
	}
	
	@When("User able to navigate in searched mobile page {string}")
	public void switchToMobilePage(String pageTitle)
	{
		for(String windowId:driver.getWindowHandles())
		{
			driver.switchTo().window(windowId);
			if(pageTitle.contains(driver.getTitle()))
			{
				break;
			}
		}
	}
	
	@Then("User selected quantity {string}")
	public void selectqty(String numOfQty)
	{
		Select dropDown= new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
		dropDown.selectByValue(numOfQty);
	}
	
	@And("User able to click Add to Cart")
	public void clickAddToCart()
	{
		driver.findElement(By.id("add-to-cart-button")).click();
	}
    

}