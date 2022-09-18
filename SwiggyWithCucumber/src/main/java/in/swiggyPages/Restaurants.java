package in.swiggyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Restaurants {
	
	@FindBy(xpath = "//div[contains(@class,'HEuF')][1]")
	private WebElement firstRestaurant;
	
	public Restaurants(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		public void clickfirstRestaurant() {
			firstRestaurant.click();
		}

}


