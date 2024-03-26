package testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.Login_Automation_L1_Pages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class Login_Automation_L1_Testcases extends AppTestBase
{
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	Login_Automation_L1_Pages logInAutomationPageInstance;
	LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
	
	
	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
	}
	@Test(priority = 1, groups = {"sanity"}, description="Open the Login Panel")
	public void openTheLoginPanel() throws Exception {
		logInAutomationPageInstance = new Login_Automation_L1_Pages(driver);
		Assert.assertTrue(logInAutomationPageInstance.openTheLoginPanelByClickingOnLogin(),"Hello & login button is not present in the current page, Please check manually") ;	
		Assert.assertTrue(LocatorsFactoryInstance.loginButtonIsPresent(driver).isDisplayed(), "Login button is not present in the current page, Please check manually");
	}
	@Test(priority = 2, groups = {"sanity"}, description="Switch to Log-in Iframe")
	public void switchToSigninIframe() throws Exception {
		logInAutomationPageInstance = new Login_Automation_L1_Pages(driver);
		Assert.assertTrue(logInAutomationPageInstance.clickOnLoginAndswitchToSigninIframe(),"Login button is not present in the current page, Please check manually") ;	
		Assert.assertTrue(LocatorsFactoryInstance.loginWithOtpButtonIsPresent(driver).isDisplayed(), "Login button With Otp Button is not present in the current page, Please check manually");
	}
	
	@Test(priority = 3, groups = {"sanity"}, description="Open Login with password Box")
	public void openLoginWithPasswordBox() throws Exception {
		logInAutomationPageInstance = new Login_Automation_L1_Pages(driver);
		Assert.assertTrue(logInAutomationPageInstance.openLoginWithPasswordbox(),"Login With Password box is not present in the current page, Please check manually") ;	
		Assert.assertTrue(LocatorsFactoryInstance.emailIdFieldIsPresent(driver).isDisplayed(), "EmailId Field is not present in the current page, Please check manually");
	}
	@Test(priority = 4, groups = {"sanity"}, description="Enter Email & Password in Login Box")
	public void enterEmailAndPasswordInLoginBox() throws Exception {
		logInAutomationPageInstance = new Login_Automation_L1_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForLogInAutomation");
		Assert.assertTrue(logInAutomationPageInstance.enterEmailandPasswordInLoginBox(expectedData),"Email and Password button is not present in the current page, Please check manually") ;	
		Assert.assertTrue(LocatorsFactoryInstance.forgotPasswordIsPresent(driver).isDisplayed(), "forgot Password is not present in the current page, Please check manually");
	}
	@Test(priority = 5, groups = {"sanity"}, description="Click on the login button")
	public void clickOnTheLoginButton() throws Exception {
		Assert.assertTrue(logInAutomationPageInstance.clickOnLoginButton(),"Login button is not present in the current page, Please check manually") ;	
		Assert.assertTrue(LocatorsFactoryInstance.errorMessageIsPresent(driver).isDisplayed(), "Error Message is not present in the current page, Please check manually");
	}
	@Test(priority = 6, groups = {"sanity"}, description="Check for failure Login and validate the error message")
	public void checkforFailureLogin() throws Exception {
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ErrorMessages");
		Assert.assertEquals(logInAutomationPageInstance.checkforFailureLoginValidateTheErrorMessage(),expectedData.get("invalidUserNameAndPassword")) ;	
		Assert.assertTrue(LocatorsFactoryInstance.errorMessageIsPresent(driver).isDisplayed(), "Error Message is not present in the current page, Please check manually");
	}
	@Test(priority = 7, groups = {"sanity"}, description="Check for success Login")
	public void checkforSuccessLogin() throws Exception {
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForLogInAutomation");
		Assert.assertTrue(logInAutomationPageInstance.provideValidUserNameAndPasswordAndValidate(expectedData),"Login Failed, Please check manually") ;	
		Assert.assertTrue(LocatorsFactoryInstance.logInButtonAtRightTopCornerIsPresent(driver).isDisplayed(), "Login button is not present in the current page, Please check manually");
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
	}
	
	@AfterMethod
	public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
	}
}
