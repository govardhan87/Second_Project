package in.swiggyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBtn {
	
	//@FindBy(xpath = "(//a[contains(@class,'T-E')])[4]")
	//private WebElement searchBtn;
	
	@FindBy(id = "location")
	private WebElement searchBtn;
	
	
	
	
	public SearchBtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	
	
	

}



