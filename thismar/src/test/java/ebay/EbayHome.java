package ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome {
	
	WebDriver driver;

	public EbayHome(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id ="gh-ac")
	private WebElement searchTextField;
	
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	@FindBy(xpath = "//div[@class='hl-cat-nav']//li/a[text()='Electronics' ]")
	private WebElement electronicsOption;
	
	public WebElement getElectronicsOption() {
		return electronicsOption;
	}
	
	@FindBy(xpath = "//span[text()='Cell Phones & Accessories']")
	private WebElement cellphoneAndAccessories;
	
	public WebElement getCellphoneAndAccessories() {
		return cellphoneAndAccessories;
	}
	
		
	@FindBy(xpath = "//a[text()='Cell Phones & Smartphones']")
	private WebElement cellphonesAndSmartphones;
	
	public WebElement getCellphonesAndSmartphones() {
		return cellphonesAndSmartphones;
	
	}
	
	
	@FindBy(xpath = "//h2[text()='Shop by Brand']/../../../..//span[text()='See All']")
	private WebElement seeAllOption;
	
	public WebElement getSeeAllOption() {
		return seeAllOption;
	}
	
	
	@FindBy(xpath = "//span[text()='Screen Size']")
	private WebElement screenSizeOption;
	
	public WebElement getScreenSizeOption() {
		return screenSizeOption;
	}
	
	@FindBy(xpath = "//span[text()='4.0 - 4.4 in']/../..//input[@class='checkbox__control']")
	private WebElement fourPointZeroByFourPointFourInches;
	
	public WebElement getFourPointZeroByFourPointFourInches() {
		return fourPointZeroByFourPointFourInches;
	}
	
	@FindBy(xpath = "//div/span[text()='Price']")
    private WebElement priceOption;
	
	public WebElement getPriceOption() {
		return priceOption;
	}
	
	@FindBy(xpath = "(//span[text()='Show items priced from']/../..//input)[1]")
	private WebElement priceStartFromTextField;
	
	public WebElement getPriceStartFromTextField() {
		return priceStartFromTextField;
	}
	
	@FindBy(xpath = "(//span[text()='Show items priced from']/../..//input)[2]")
	private WebElement priceEndWithTextField;
	
	public WebElement getPriceEndWithTextField() {
		return priceEndWithTextField;
	}
	
	@FindBy(xpath = "//span[text()='Item Location']")
	private WebElement itemLocationOption;
	
	public WebElement getItemLocationOption() {
		return itemLocationOption;
	}
	
	
	@FindBy(xpath = "//span[text()='Worldwide']/../..//input")
	private WebElement worldWideCheckbox;
	
	public WebElement getWorldWideCheckbox() {
		return worldWideCheckbox;
	}
	
	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement applyButton;
	
	public WebElement getApplyButton() {
		return applyButton;
	}
	
	@FindBy(id = "gh-btn")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
}


