package in.swiggyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocateArea {
	
	WebDriver driver = null;
	 
	//@FindBy(xpath = "(//input[contains(@type,'text')]")
	 //WebElement LocateArea;
	
	By textbox_search = By.xpath("//input[contains(@type,'text')]");
	//By button_search = By.xpath("a[contains(@href,'search')])[1]");
	
	public LocateArea(WebDriver driver) {
		this.driver = driver;
		
	}
		public void LocateArea(String text) {
		 driver.findElement(textbox_search).sendKeys(text);	
		}
	 
	
	public void clickSearchButton() {
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
		//LocateArea.click();
		
	}
}


