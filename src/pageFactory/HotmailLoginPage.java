package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotmailLoginPage {
WebDriver driver;
	
	@FindBy(xpath = "//*[@id='CredentialsInputPane']/div[2]/div/div/div[3]/div/div/div[2]/div")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id='idSIButton9']")
	WebElement nextButton;
	
	@FindBy(xpath = "//*[@id='CredentialsInputPane']/div[2]/div/div/div[3]/div/div/div/div")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='idChkBx_PWD_KMSI0Pwd']")
	WebElement chkBoxKeepMeSignedIn;
	
	@FindBy(xpath = "//*[@id='idBtn_Back']")
	WebElement backButton;
	
	@FindBy(xpath = "//*[@id='idSIButton9']")
	WebElement submitButton;
	
	
	public HotmailLoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String username){
		userName.sendKeys(username);
	}
	
	public void clickNextButton(){
		nextButton.click();
	}
	
	public void setPassword(String pass){
		password.sendKeys(pass);
	}
	
	public void setKeepSignedInChkBox(){
		chkBoxKeepMeSignedIn.click();
	}
	
	public void clickBackButton(){
		backButton.click();
	}

	public void clickSubmitButton(){
		submitButton.click();
	}
	
	public void login(String user, String pass, char keepSignedIn) throws InterruptedException{
		setUserName(user);
		//Thread.sleep(3000);
		clickNextButton();
		Thread.sleep(3000);
		setPassword(pass);
		//Thread.sleep(3000);
		
		if(keepSignedIn == 'Y'){
			setKeepSignedInChkBox();
		}
		//Thread.sleep(3000);
		
		clickSubmitButton();
	}

}
