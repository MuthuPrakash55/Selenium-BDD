package bdd.test;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefDemoApp {
	WebDriver driver;
	
	@Given("user open {string} browser")
	public void user_open_browser(String browser) {
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
	    	
	@When("user open the application url {string}")
	public void user_open_the_application_url(String url) {
	    driver.get(url);
	}
	
	@Then("verify that user is navigate to right application")
	public void verify_that_user_is_navigate_to_right_application() {
	  String title= driver.getTitle();
	  Assert.assertEquals("Register", title);	
	}
	
	@And("verify that user can able to write the first name{string} and last name {string} in the name field")
	public void verify_that_user_can_able_to_write_in_the_name_field(String fname,String lname) {
	    driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(fname);
	    driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lname);
	}
	@And("verify that user can to fill the address in the address text box field")
	public void verify_that_user_can_to_fill_the_address_in_the_address_text_box_field() {
	    driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("chennai");
	}
	
	@Then("verify that user can able to fill the email {string} in email text box field")
	public void verify_that_user_can_able_to_fill_the_email_in_email_text_box_field(String mail) {
	   driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(mail);
	}
	
	@Then("verify that user can able to fill the phone number {string} in phone box field")
	public void verify_that_user_can_able_to_fill_the_phone_number_in_phone_box_field(String phnno) {
	    driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys(phnno);
	}
	
	@Then("verify that user can able to click the radio button of gender")
	public void verify_that_user_can_able_to_click_the_radio_button_of_gender() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	@Then("verify that user can able to select the check box button of hobbie")
	public void verify_that_user_can_able_to_select_the_check_box_button_of_hobbie() {
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	}
	@Then("verify that user can able to select the  skill {string} from the dropdown")
	public void verify_that_user_can_able_to_select_the_skill_from_the_dropdown(String java) {
		WebElement skill=driver.findElement(By.xpath("//select[@ng-model=\"Skill\"]"));
		Select select=new Select(skill);
		select.selectByValue(java);
	}
	
	@Then("verify that user can able to select the country India from the dropdown")
	public void verify_that_user_can_able_to_select_the_country_from_the_dropdown() {
		WebElement ctry=driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
		ctry.click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
	}
	@Then("verify that user can able to select the year{string} and month of {string} and day of {string} from dropdown")
	public void verify_that_user_can_able_to_select_the_year_and_month_of_february_and_day_of_from_dropdown(String year, String mth,String dy)   {
		WebElement yr=driver.findElement(By.xpath("//select[@ng-model=\"yearbox\"]"));
		Select select=new Select(yr);
		select.selectByValue(year);
		WebElement month=driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		Select select1=new Select(month);
		select1.selectByValue(mth);
		WebElement day1=driver.findElement(By.xpath("//select[@ng-model=\"daybox\"]"));
		Select select2=new Select(day1);
		select2.selectByValue(dy);
	}
	@Then("verify that user can able write the password {string} in the password text box field")
	public void verify_that_user_can_able_write_the_password_in_the_password_text_box_field(String pwd) {
	    driver.findElement(By.id("firstpassword")).sendKeys(pwd);
	}
	
	@When("user click the submit icon button")
	public void user_click_the_submit_icon_button() {
	    driver.findElement(By.id("submitbtn")).click();
	}
	



	


}
