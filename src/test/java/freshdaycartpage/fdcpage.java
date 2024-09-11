package freshdaycartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fdcpage 
{
	ChromeDriver driver;
	 //By FDCfirstname=By.name("name");
	 By FDCemailid=By.name("email");
	 //By FDCphoneno=By.name("phone");
	 //By FDCpassword=By.name("pass1");
	 By FDCcnfrmpass=By.name("pass2");
	 //By FDCregister=By.xpath("/html/body/div[2]/div/form/button");
	 By FDCsignin=By.xpath("/html/body/div[2]/div/form[1]/button");
	 
	 //homepage handle
	By FDChome=By.xpath("/html/body/header/div[3]/div[1]/div[1]");
	 
	 public fdcpage(ChromeDriver driver) 
	 {
		 this.driver=driver;
	 }

	  By FDCPASSWORD=By.name("password");
	 
	 
	 //public void setvalues(String name,String email,String phone,String pass1, String pass2)
	 {
		//driver.findElement(FDCfirstname).sendKeys(name); 
		//driver.findElement(FDCemailid).sendKeys(email);
		//driver.findElement(FDCphoneno).sendKeys(phone);
		//driver.findElement(FDCpassword).sendKeys(pass1);
		//driver.findElement(FDCcnfrmpass).sendKeys(password);
	 }
	 //public void register()
	 {
		 //driver.findElement(FDCregister).click();
		 
	 }
	   // Signin
	 
	public void setvalues(String email, String password) 
	{
		driver.findElement(FDCemailid).sendKeys(email);
		driver.findElement(FDCPASSWORD).sendKeys(password);
		
	} 
	public void signin() 
	{
		driver.findElement(FDCsignin).click();
		driver.findElement(FDChome).click();	
	}
}
