package testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObjectModl.CategorySelectionObject;
import resources.Baseclass;

public class VerifyCategorySelection extends Baseclass {
	
	@Test
	public void hamburgMenu() throws IOException, InterruptedException
	{
		driverInitialize();
		
		driver.get("https://www.thesouledstore.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		CategorySelectionObject cso=new CategorySelectionObject(driver);
		
		cso.clickOnWomen().click();
		
		Thread.sleep(2000);
		
		//cso.moveToAlert().click();
		
		
		Alert alert1=driver.switchTo().alert();
		
		alert1.dismiss();
		
		
		/*cso.clickOnWW().click();
		
		Select s=new Select(cso.clickOnWW());
		
		s.selectByVisibleText("Sweaters");*/
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
	
	}

}
