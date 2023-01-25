package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class featuresgluecode {

	WebDriver driver = new FirefoxDriver();
	@Given("USer is on internisified homepage")
	public void u_ser_is_on_internisified_homepage() {
	    driver.get("https://testground.internsified.com/");
	    driver.manage().window().maximize();
	}

	@When("User enter correct email and password")
	public void user_enter_correct_email_and_password() {
		driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[1]/div/a")).click();
		driver.findElement(By.name("email")).sendKeys("meetmonikakapoor@gmail.com");
		driver.findElement(By.name("password")).sendKeys("monika.kapoor");
	}

	@When("user hits Sign in")
	public void user_hits_sign_in_button() {
	    driver.findElement(By.id("submit-login")).click();
	}

	@Then("user should redirect to internisified webpage")
	public void user_should_redirect_to_internisified_webpage() {
	    // Write code here that turns the phrase above into concrete actions
	   String title=driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[1]/div/a[2]")).getAttribute("title");
	   assert(title.equals("View my customer account"));
	  // driver.close();
	}
	
	@When("user enters the keyword in search bar")
	public void user_click_the_search_tab() throws InterruptedException {
		Thread.sleep(4000);
	 driver.findElement(By.name("s")).sendKeys("Hummingbird Printed T-Shirt");	
	 Thread.sleep(5000);
	}

	@When("user hit enter button")
	public void enters_the_correct_keyword() {
		driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
	   
	}
	@Then("close the session")
	public void close_the_session() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(4000);
	}

	@Then("User should get the expected result")
	public void user_should_get_the_expected_result() {
		assert(driver.getTitle().equals("Search"));
	}

	@When("user hovers on Clothes tab")
	public void user_click_on_clothes_tab() {
	 WebElement element =  driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[1]/a"));
	 Actions action = new Actions(driver);
	 action.moveToElement(element);
	 action.build().perform();
	}



	@When("user click on Men option")
	public void user_click_on_men_option() {
	    driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a")).click();
	}

	@Then("user should redirected on men page")
	public void user_should_redirected_on_men_page() {
	    // Write code here that turns the phrase above into concrete actions
	    assert(driver.getTitle().equals("Men"));
	}
	
	@Then("user selects the small size checkbox")
	public void user_selects_the_small_size_checkbox() {
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	
	@Then("user click on the product picture")
	public void user_click_on_the_product_picture() {
	    driver.findElement(By.xpath("//img[@alt='Hummingbird printed t-shirt']")).click();
	}

	@Then("user add specific product to the cart")
	public void user_add_specific_product_to_the_cart() throws InterruptedException {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	}
	@Then("user clicks on proceed to checkout")
	public void user_clicks_on_proceed_to_checkout() {
	driver.findElement(By.partialLinkText("PROCEED")).click();
	}
	
	@Then("user signoffs")
	public void user_signoffs() {
	  driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[1]/div/a[1]")).click();
	
	}
	@Then("user redirected to Signin page")
	public void user_redirected_to_signin_page() {
		  assert(driver.getTitle().equals("Cart"));  
		  driver.close();
	}


}
 