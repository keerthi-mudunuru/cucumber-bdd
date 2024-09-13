package StepDefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralUtils.DriverManager;
import Pages.PageDetails;

import org.openqa.selenium.JavascriptExecutor;

public class WebsiteOperations {
	
	WebDriver driver;
	PageDetails pgdObject;
	
	@Given("Navigate to {string} webpage in {string} browser")
	public void navigate_to_webpage_in_browser(String siteURL, String browser){
		driver = DriverManager.getDriver(browser);
		pgdObject = new PageDetails(driver);
		driver.get(siteURL);
		System.out.println(siteURL + " ===> is the website launched");
		System.out.println(driver.getTitle() + " ===> is the Title of the Page");    
	}

	@When("Search for {string} in the box")
	public void search_for_in_the_box(String searchWord) {
		//driverForBrowser.findElement(By.id("twotabsearchtextbox")).sendKeys(searchWord);
		pgdObject.getSearchBox().sendKeys(searchWord);
	    System.out.println("Entered the word in the searchbox");
	}
	
	@When("Click on the Search button")
	public void click_on_the_search_button() {
		//driverForBrowser.findElement(By.id("nav-search-submit-button")).click();
		pgdObject.getSearchIcon().click();
		System.out.println("Clicked on the searchicon");
		System.out.println(driver.getTitle() + " ===> is the Title of the page");
		System.out.println(driver.getCurrentUrl() + " ===> is the current URL");
	   
	}

	@Then("Click on the first result from the results")
	public void click_on_the_first_result_from_the_results() throws InterruptedException {
		WebElement resultLink = pgdObject.getResultLink();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", resultLink);
		Thread.sleep(3000);
		resultLink.click();
		Thread.sleep(3000);
		DriverManager.quitDriver();
	}


}
