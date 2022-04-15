package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {
	public WebDriver driver;
	
	
	 private By firstName= By.xpath("//input[@name='UserFirstName']");
	 private By lastName=By.xpath("//input[@name='UserLastName']");
	 private By employees=By.xpath("//select[@name='CompanyEmployees']");
	
	//locator
	
	//method
	
	
	
	
	 public signUpPageObjects(WebDriver driver2) {
		 this.driver=driver2;
	}

	public WebElement enterFirstName() {
		 return driver.findElement(firstName);
		 
	 }
	
	 public WebElement eneterLastName() {
		 return driver.findElement(lastName);
	 }
	
	 
	 public WebElement selectEmployees() {
		 return driver.findElement(employees);
	 }
	
	
	
	

}
