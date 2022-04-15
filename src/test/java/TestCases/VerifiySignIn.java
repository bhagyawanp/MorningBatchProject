package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.signInPageObjects;
import Resources.Constants;
import Resources.baseClass;

public class VerifiySignIn extends baseClass{
	
	@Test(dataProvider="demo")
	public void enterCredientials(String username, String password) throws InterruptedException{
		
		signInPageObjects spo=new signInPageObjects(driver);
		spo.enterUserName().sendKeys(username);
		spo.enterPassword().sendKeys(password);
		spo.clickOnLogin().click();
		Thread.sleep(5000);
	/*	String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		String Expected="Pleas check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
	  // Assert.assertEquals(actual,Expected);  //Hard assert
		
		SoftAssert sp=new SoftAssert();  //Soft assert
		sp.assertEquals(actual,Expected);
		System.out.println("hello");
	    sp.assertAll(); //We need to add always at the end */
	    		
		
	}
	
	@DataProvider
	public Object[][] demo(){
		
		Object[][] data=new Object[3][2];
		
		//valid data
		data[0][0]=Constants.firstUsername;
		data[0][1]=Constants.firstPassword;
		
		//invalid data
		data[1][0]=Constants.SecondsUsername;
		data[1][1]=Constants.SecondPassword;
		
		
		
		return data;
			
		
	}
	
		

	
	
	/*
	@Test
	public void forgotYouPassword() throws InterruptedException{
		signInPageObjects spo=new signInPageObjects(driver);
		Thread.sleep(5000);
		spo.forgotYourPassword().click();
		
	}
	*/
	
	
	
	
	
	

	
	

}
