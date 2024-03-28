package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Automation_L1_Pages extends StartupPage{
	
	By helloLoginButton=By.xpath("//a[.=' Hello, Login']");
    By loginButton=By.xpath("//a[@title='Log In']");
    By signInIframe=By.xpath("//iframe[@id='myframe']");
    By loginWithPasswordButton=By.xpath("(//li[.='Login with Password'])[2]");
    By emailIdField=By.xpath("(//input[@name='email'])[2]");
    By passwordField=By.xpath("(//input[@name='pwd'])[2]");
    By logInButton=By.xpath("(//button[@type=\"submit\"])[2]");
    By errorMessage=By.xpath("//div[.='Invalid User Id/EmailID or Password. Please try again.']");
    By logInButtonAtRightTopCorner=By.xpath("//span[.='Hi  Abhisek  ...']");

	String pageName = this.getClass().getSimpleName();

	public Login_Automation_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}
	
	/**@Test1
	 * about this method openTheLoginPanelByClickingOnLogin() 
	 * @param : null
	 * @description : open The Login Panel By Clicking On Login
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean openTheLoginPanelByClickingOnLogin() throws Exception {
		Boolean helloLoginButtonIsDisplayed=false;
		try {
			commonEvents.mouseHoverOperation(helloLoginButton, "elementName", "pageName");
			helloLoginButtonIsDisplayed=true;
		}catch(Exception e) {
			throw e;
		}	
		return helloLoginButtonIsDisplayed;
	}
	
	/**@Test2
	 * about this method clickOnLoginAndswitchToSigninIframe() 
	 * @param : null
	 * @description : click On Login And switch To Signin Iframe
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnLoginAndswitchToSigninIframe() throws Exception {
		Boolean signInIframeIsDisplayed=false;
		try {
			commonEvents.click(loginButton);
			if(commonEvents.isDisplayed(signInIframe))
			{
				commonEvents.switchToFrame(signInIframe);
				signInIframeIsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return signInIframeIsDisplayed;
	}
	
	/**@Test3
	 * about this method openLoginWithPasswordbox() 
	 * @param : null
	 * @description : open Login With Password box
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean openLoginWithPasswordbox() throws Exception {
		Boolean loginWithPasswordButtonIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(loginWithPasswordButton))
			{
				commonEvents.click(loginWithPasswordButton);
				loginWithPasswordButtonIsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return loginWithPasswordButtonIsDisplayed;
	}
	
	/**@Test4
	 * about this method enterEmailandPasswordInLoginBox() 
	 * @param : Map<String, String>
	 * @description : enter Email and Password In LoginBox
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterEmailandPasswordInLoginBox(Map<String, String> expectedData) throws Exception {
		String passwordFieldValue="";
		try {
			commonEvents.sendKeys(emailIdField,expectedData.get("emailId"));
			commonEvents.sendKeys(passwordField,expectedData.get("password"));

			passwordFieldValue=commonEvents.getAttribute(passwordField, "value");
			
		}catch(Exception e) {
			throw e;
		}	
		return passwordFieldValue;
	}
	
	/**@Test5
	 * about this method clickOnLoginButton() 
	 * @param : null
	 * @description : click On Login Button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnLoginButton() throws Exception {
		Boolean logInButtonIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(logInButton))
			{
				commonEvents.click(logInButton);
				Thread.sleep(4000);
				logInButtonIsDisplayed=true;
			}
		}
		catch(Exception e) {
			throw e;
		}	
		return logInButtonIsDisplayed;
	}
	
	/**@Test6
	 * about this method checkforFailureLoginValidateTheErrorMessage() 
	 * @param : null
	 * @description : check for Failure Login Validate The Error Message(Check for failure Login and validate the error message)
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkforFailureLoginValidateTheErrorMessage() throws Exception {
		String errorMessageText="";
		try {
				errorMessageText=commonEvents.getText(errorMessage);
				System.out.println("Error message is:" +errorMessageText);	
		}
		catch(Exception e) {
			throw e;
		}	
		return errorMessageText;	

	}
	
	/**@Test7
	 * about this method provideValidUserNameAndPasswordAndValidate() 
	 * @param : Map<String, String>
	 * @description : provide Valid User Name And Password And Validate, Check for success Login
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean provideValidUserNameAndPasswordAndValidate(Map<String, String> expectedData) throws Exception {
		Boolean logInButtonAtRightTopCornerIsDisplayed=false;
		try {
			commonEvents.clear(emailIdField);
			commonEvents.sendKeys(emailIdField,expectedData.get("ValidEmailId"));
			commonEvents.clear(passwordField);
			commonEvents.sendKeys(passwordField,expectedData.get("validPassword"));
			commonEvents.click(logInButton);
			if(commonEvents.isDisplayed(logInButtonAtRightTopCorner))
			{
				logInButtonAtRightTopCornerIsDisplayed=true;
			}
		}
		catch(Exception e) {
			throw e;
		}	
		return logInButtonAtRightTopCornerIsDisplayed;
	}
	
	
}
