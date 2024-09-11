package freshdaycartpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DROUPDOWN 
{
 ChromeDriver driver;
 
 //By fdcdown= By.xpath("/html/body/header/div[3]/div[2]/div/nav/div[2]/ul/li[3]");
 //By fdcitem= By.xpath("/html/body/header/div[3]/div[2]/div/nav/div[2]/ul/li[3]/ul/li[4]/a");

 public DROUPDOWN(ChromeDriver driver) 
 {
	 this.driver=driver;
 }
 public void setvalues(String search)
	{
		//driver.findElement(onname).sendKeys(firstname);
	}
      public void click()
 {    
	 //driver.findElement(fdcdown).click();
	 //driver.findElement(fdcitem).click();
    	 // driver.findElement(By.li)
    	
    	  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/span/form/select")).click();
    	  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/span/form/select/option[3]")).click();

 }
 
}
 
	 