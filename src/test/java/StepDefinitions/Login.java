package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	
	
	WebDriver driver = null;

	@Given("^Launch the Url$")
	public void launch_the_url() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		System.out.println("Launch the Url Framework1");
	}

	@When("^homepage should open$")
	public void homepage_should_open() {

		System.out.println("homepage should open");
	}

	@Then("^Enter Username$")
	public void enter_username() {

		driver.findElement(By.xpath("//*[@id ='user-name']")).sendKeys("standard_user");
		System.out.println("Enter Username");
	}

	@Then("^Enter password$")
	public void enter_password() {

		driver.findElement(By.xpath("//*[@id ='password']")).sendKeys("secret_sauce");
		System.out.println("Enter password");
	}

	@Then("^close$")
	public void close() {

		driver.close();
		System.out.println("Close");
	}

	@And("^Click on login$")
	public void click_on_login() {

		driver.findElement(By.xpath("//*[@id ='login-button']")).click();
		System.out.println("Click on login");
	}

	@Then("^Enter invalid Username$")
	public void enter_invalid_username() {
		driver.findElement(By.xpath("//*[@id ='user-name']")).sendKeys("Nag");
	}

	@Then("^Enter invalid password$")
	public void enter_invalid_password() {
		driver.findElement(By.xpath("//*[@id ='password']")).sendKeys("Nag");
	}

	
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password(DataTable data) throws Exception {
		
		List<List<String>> obj = data.asLists();
		
		String username = obj.get(0).get(0);
		String password = obj.get(0).get(1);
	
		driver.findElement(By.xpath("//*[@id ='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id ='password']")).sendKeys(password);
		
		Thread.sleep(5000);
		
		
	}
	
	
	
	 @When("^user enters (.+) and (.+)$")
	    public void user_enters_and(String username, String password) throws Throwable {
	        
		 driver.findElement(By.xpath("//*[@id ='user-name']")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id ='password']")).sendKeys(password);
		 
	    }
	 
	 @Then("close the browser")
	 public void close_the_browser() {
	     driver.close();
	 System.out.println("Close **********");    
	 }
	 

}
