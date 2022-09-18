package in.swiggyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutBtn {
	
	@FindBy(xpath = "(//button[contains(@class,'gPB')]")
	private WebElement checkOutBtn;
	
	public CheckOutBtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		public void clickCheckOutBtn() {
			checkOutBtn.click();
		
	}
	

}
	
	


