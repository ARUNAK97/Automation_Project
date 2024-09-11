package freshdaycartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchproductitem 
{
 ChromeDriver driver;
 By search=By.name("search_text");
 By searchbutton=By.xpath("/html/body/header/div[3]/div[1]/div[2]/div/form/button");
 
 //product quantity +1
 By FDCproductquantity=By.xpath("/html/body/div/div/div[1]/span/div/div/div[2]/div[2]/div/b");
 
 //add_to_cart
 By FDCproductADDcart=By.xpath("/html/body/div/div/div[1]/span/div/div/span/b/a");
 
 //cart view
 By FDCcartview=By.xpath("/html/body/header/div[3]/div[1]/div[4]/ul/li[1]/a[1]");
 
 //final product quantity
 By FDCproductquant=By.xpath("//*[@id=\"mycrt\"]/div/div[2]/div/div[3]/div[1]/div/div/div[1]/span[2]");
 
 public searchproductitem(ChromeDriver driver)
 {
	 this.driver=driver;
 }
 public void setvalues(String search_text)
 {
	 //driver.findElement(search).sendKeys(search_text);
 }
  public void tosearch()
  {
	  driver.findElement(search).sendKeys("BOOST 500GM");
	  driver.findElement(searchbutton).click();
	  driver.findElement(FDCproductquantity).click();
	  driver.findElement(FDCproductADDcart).click();
	  driver.findElement(FDCcartview).click();
  } 
}
