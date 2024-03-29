/**
 * 
 */
package PageObjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;



/**
 * @author kpkmt942
 *
 */
public class IndexPage extends BasePage{

	
	
	public IndexPage(WebDriver driver) 
	{
		super(driver);
		}

	
	@FindBy(xpath = "//span[text()=\"My Account\"]")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	WebElement Register;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement LogIn;
	
	@FindBy(xpath="//img[@title='Your Store']")
	WebElement Logo;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement SearchBox;
	
	@FindBy(xpath="//button[@class='btn btn-light btn-lg']")
	WebElement SeacrhBtn;
	
	
	public ProductSearchPage ProductSearch(String Product)
    {
		act.TextSend(SearchBox, Product);
		act.Click(driver, SeacrhBtn);
		return new ProductSearchPage(driver);
	 
    }
 

	 public void Click_MyAccount()
	    {
		 act.JavascriptExe(driver, MyAccount);
		 
	    }
	 

	    public NewAccountReg_Page Click_RegBtn()
	    {
	    	act.Click(driver, Register);
	    	return new NewAccountReg_Page(driver);
	    }  
	    
	    public LogIn_Page ClickOn_LogIn()
	    {
	    	act.Click(driver, LogIn);
	    	return new LogIn_Page(driver);
	    }  
	    
	    public boolean VerifyLogo()
	    {
	    	return act.Isdisplayed(driver, Logo);
	    }  
	    
	    public String GetCurrentTitle()
	    {
	    	 String title=driver.getTitle();
	    	 System.out.println(title);
	     return title;
	    }
	    
	    

}
