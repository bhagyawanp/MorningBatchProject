package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public  WebDriver driver;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException {
		
		//To read the properties file
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		 prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");  
		
		if(browserName.equals("chrome")) {
			
		//	WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); //To run  specic chrome driver	
		   WebDriverManager.chromedriver().setup(); //To ru  in  latest
	         driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			 //Firefox code
			
		}
		
		else if(browserName.equals("IE")) {
			 //IE code
		}
		
		else {
			
			System.out.println("you should choose any one of above browser");
		}
		

		return driver;
		
	
	
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
	
		
	}
	
	

	@AfterClass
	public void quitBrowser() throws IOException {
		driver.quit();
	}
	
	
	
	

}
