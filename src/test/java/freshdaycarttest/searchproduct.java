package freshdaycarttest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import freshdaycartpage.searchproductitem;

public class searchproduct 
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
  }
  @Test
  public void test() throws IOException 
  {
    searchproductitem sc= new searchproductitem(driver);
    sc.setvalues("BOOST 500GM");
    sc.tosearch();
    

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
