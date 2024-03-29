package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
	public static WebDriver driver;
	public void driverInitialize() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\pradnya\\eclipse-workspace\\Amazon2\\src\\main\\java\\resources\\data.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
				
				
		
		
	}

}
