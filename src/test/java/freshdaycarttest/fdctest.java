package freshdaycarttest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import freshdaycartpage.fdcpage;

public class fdctest 
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void URL()
	{
		//driver.get("https://freshdaykart.com/sign-up");
		driver.get("https://freshdaykart.com/sign-in");
	}
	@Test
	public void test()
	{
		 //fdcpage FD=new fdcpage (driver);
		 //FD.setvalues("somino", "somino5223@obisims.com", "0123456789", "1234567DI*#SOMINO", "1234567DI*#SOMINO");
		 //FD.register();
		
		fdcpage fk=new fdcpage(driver);
	    fk.setvalues( "somino5223@obisims.com","1234567DI*#SOMINO" );
	    fk.signin();  
}
}
