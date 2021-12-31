package contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CreateContactTest 
{
	public WebDriver driver;
	@Test(groups = {"smokeTest"})

	public void createContactTest()
	{

		/*String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);*/
			System.out.println("create contact");
		
	}
		@Test(groups =  {"regressionTest"})
		public void createContactTest2()
		{
			System.out.println("create contact test2");
		}

	}
