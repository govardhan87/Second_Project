package in.swiggyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBtn {
	
	@FindBy(xpath = "(//div[contains(@class,'RPOp')][1])")
	private WebElement addBtn;
	
	public AddBtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickAddBtn() {
		addBtn.click();
	}

}
	


