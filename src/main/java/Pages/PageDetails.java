package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageDetails {
	
//WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	@FindBy(id = "nav-search-submit-button")
	WebElement searchIcon;
	@FindBy(partialLinkText = "boAt Rockerz 450")
	WebElement resultLink;
	
	public PageDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getResultLink() {
		return resultLink;
	}
}
