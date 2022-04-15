package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.signInPageObjects;
import PageObjectModel.signUpPageObjects;
import Resources.Constants;
import Resources.baseClass;

public class VerifySignUP extends baseClass{
	
	@Test
	public void signupData() throws InterruptedException {
		
		signInPageObjects spo=new signInPageObjects(driver);
		spo.openSignupPage().click();
		Thread.sleep(5000);
		signUpPageObjects sup= new signUpPageObjects(driver);
		sup.enterFirstName().sendKeys(Constants.FirstName);
		sup.eneterLastName().sendKeys(Constants.LastName);
		
		
		
		Select s=new Select(sup.selectEmployees());
		Thread.sleep(5000);
		s.selectByIndex(1);
		Thread.sleep(5000);
			
			
	}
	
	
	//method
	//signuppageonject(driver)
	//method
	
	
	

}
