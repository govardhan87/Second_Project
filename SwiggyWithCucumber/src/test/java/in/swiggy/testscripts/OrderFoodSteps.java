package in.swiggy.testscripts;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import in.swiggyPages.AddBtn;
import in.swiggyPages.CheckOutBtn;
import in.swiggyPages.LocateArea;
import in.swiggyPages.Restaurants;
import in.swiggyPages.SearchBtn;
import io.cucumber.java.en.*;


public class OrderFoodSteps {
	WebDriver driver;
	
	@Given("Go to Swiggy.com")
	public void go_to_swiggy_com() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swiggy.com");
		  
	}

	@When("Enter ‘Bangalore, Karnatka, India’ in the search box")
	public void enter_bangalore_karnatka_india_in_the_search_box() {
	LocateArea locateArea = new LocateArea(driver);
	locateArea.LocateArea("Bangalore, karnataka, India");
	System.out.println("Bangalore, Karnataka, India");
	locateArea.clickSearchButton();
	
		
	}

	@When("Click Go")
	public void click_go() {
		SearchBtn searchBtn = new SearchBtn(driver);
		searchBtn.clickSearchBtn();
	    
	}

	@When("Click on the first restaurant on the next page")
	public void click_on_the_first_restaurant_on_the_next_page() {
		driver.manage().window().maximize();
		Restaurants restaurants = new Restaurants(driver);
		restaurants.clickfirstRestaurant();
		
}

	@When("Click ‘Add’ on the first item of the restaurant page")
	public void click_add_on_the_first_item_of_the_restaurant_page() {
		AddBtn addBtn = new AddBtn(driver);
		addBtn.clickAddBtn();
		    		
	}

	@When("Click ‘Checkout’ button")
	public void click_checkout_button() {
		CheckOutBtn checkOutBtn = new CheckOutBtn(driver);
		checkOutBtn.clickCheckOutBtn();
	    
	}
	@Then("Verify you are on Checkout page by verifying the text ‘SECURE CHECKOUT’.")
	public void verify_you_are_on_checkout_page_by_verifying_the_text_secure_checkout() {
		String expectedTitle = "SECURE CHECKOUT";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle );
		driver.quit();
	    
	}


}
