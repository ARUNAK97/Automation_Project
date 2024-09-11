package freshdaycarttest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import freshdaycartpage.DROUPDOWN;

public class LISTDROUP 
{
	 ChromeDriver driver;
	  
	  @BeforeTest
	  public void setup()
	  {
		  driver =new ChromeDriver();
	  }
	  @BeforeMethod
	  public void url()
	  {
		  driver.get("https://freshdaykart.com/");
		  driver.get("https://freshdaykart.com/stationery?c=c0010");
	  }
	  @Test
	  public void test() throws IOException
	  {
		  DROUPDOWN DD=new DROUPDOWN(driver);
		  DD.click();
		  

		  String url="https://freshdaykart.com/";
			 URL ob=new URL(url);
		    
		     HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		     int code=con.getResponseCode();
		     System.out.println(code);
		     con.connect();
		     if(con.getResponseCode()==200)
		     {
		     System.out.println("valid url");
		     }
		     else
		      {
		     System.out.println("invalid");
		          
		      }
		  
		  
	  }
}
