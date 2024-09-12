package StepDefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteOperations {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("Navigate to {string} webpage")
	public void navigate_to_webpage(String siteURL) {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(siteURL);
		System.out.println(siteURL + " ===> is the website launched");
		System.out.println(driver.getTitle() + " ===> is the Title of the Page");    
	}

	@When("Search for {string} in the box")
	public void search_for_in_the_box(String searchWord) {
		
		//page.enter_in_the_searchbox(driver,searchWord);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchWord);
	    System.out.println("Entered the word in the searchbox");
	}
	
	@When("Click on the Search button")
	public void click_on_the_search_button() {
		
		//page.click_on_the_searchicon(driver);
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("Clicked on the searchicon");
		System.out.println(driver.getTitle() + " ===> is the Title of the page");
		System.out.println(driver.getCurrentUrl() + " ===> is the current URL");
	   
	}

	@Then("Click on the first result from the results")
	public void click_on_the_first_result_from_the_results() {
		//driver.findElement(By.className("a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal"));
		System.out.println("Closing the browser");
		driver.quit();
	    
	}


}
