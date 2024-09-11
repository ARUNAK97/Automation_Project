package freshdaycarttest;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import freshdaycartpage.SCROLLDOWN;

public class sdowndtest 
{
 ChromeDriver driver;
 
 @BeforeTest
 public void setup()
 {
	 driver= new ChromeDriver();
 }
 @BeforeMethod
  public void url()
  {
	 driver.get("https://freshdaykart.com/");
  }
 @Test
 
 public void test() throws IOException
 {
	 SCROLLDOWN aa = new SCROLLDOWN(driver);
	 aa.click();
	 
	 //scrolldown by using pixel
	 JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("/html/body/footer/div[2]/div[1]/div[1]/ul/li[1]/a")).click();
		
	//Screenshot particular content
		WebElement gb=driver.findElement(By.xpath("/html/body/div[2]"));
		File Screenshot=gb.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Screenshot, new File("D:/scrnsht/FDKabout.png"));
		
	//Screenshot fullscreen	
	 Shutterbug.shootPage(driver, Capture.FULL, true).save("D:/scrnsht/fullsreen.png");
	 
	
		
 }
}
