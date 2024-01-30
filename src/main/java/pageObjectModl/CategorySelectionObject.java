package pageObjectModl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategorySelectionObject {
	
	public static WebDriver driver;
	
	private By CTS=By.xpath("//a[@href='/women']");
	
	private By alert=By.xpath("(//button[@class='ng-binding'])[1]");
	
	private By WW=By.xpath("//div[@id='navbarDropdownMenuLinkDiff0Women']");
	
	
	
	public CategorySelectionObject(WebDriver driver2) {
		CategorySelectionObject.driver=driver2;
	}

	public WebElement clickOnWomen()
	{
		return driver.findElement(CTS);	
	}
	
	public WebElement moveToAlert()
	{
		return driver.findElement(alert);
	}
	
	public WebElement clickOnWW()
	{
		return driver.findElement(WW);
	}
	
	
	
	
	
	
	
	

}
