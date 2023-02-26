package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.Testbase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Googlehomepage;

public class simpleSearch extends Testbase {
	
	
	
	private static final String product_name = null;

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		launchBrowser();
		
		
	}

	
	
	@When("i enter the {string}")
	public void i_enter_the(String toys) {
		
		//WebElement  searchbar = driver.findElement(By.className("gLFyf"));
		
		//searchbar.sendKeys(toys);
		Googlehomepage gp = new Googlehomepage(driver);
		
		
		gp.enteringProductName(product_name);
	}

	@When("i click the search button")
	public void i_click_the_search_button() {
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.submit();
Googlehomepage gp = new Googlehomepage(driver);
		
		
		gp.clickingOnSearchButton();
	}

	@Then("I see the realted search results successfully")
	public void i_see_the_realted_search_results_successfully() {
	   
		WebElement searchResult = driver.findElement(By.id("result-stats"));
		System.out.println("========================================================================="); 
		String resultText = searchResult.getText();
		System.out.println(resultText);
		System.out.println("=========================================================================");
	

//boolean displayResults = searchResult.isDisplayed();
		Googlehomepage gp = new Googlehomepage(driver);
Assert.assertTrue(gp.isSearchResultVisible(),"search result is not displayed");
closeAll();
}
}