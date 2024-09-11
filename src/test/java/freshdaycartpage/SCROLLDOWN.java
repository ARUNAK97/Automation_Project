package freshdaycartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLLDOWN 
{
 ChromeDriver driver;
 
 By scrolldown=By.xpath("/html/body/footer/div[2]/div[1]/div[1]/ul/li[1]/a");
 
 public SCROLLDOWN(ChromeDriver driver)
 {
	 this.driver=driver;
 }
 public void click()
 {
	 driver.findElement(scrolldown);
 }
}
