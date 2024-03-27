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
import pages.Emi_Calculator_L1_Pages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class Emi_Calculator_L1_Testcases extends AppTestBase
{
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	Emi_Calculator_L1_Pages emiCalculatorPageInstance;
	LocatorsFactory locatorsFactoryInstance;
  
	
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
	
	@Test(priority = 1, groups = {"sanity"}, description="Mouse hover on Personal Finance and click on “Tools” under Explore")
	public void mousehoverOnPersonalFinanceAndClickOnTools() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Assert.assertTrue(emiCalculatorPageInstance.mouseHoverOnPersonalFinanceAndClickOnTools(),"Personal Finance is not present in the current page, Please check manually") ;	
		Assert.assertTrue(locatorsFactoryInstance.toolsTitleIsPresent(driver).isDisplayed(), "ToolsTitle is not present in the current page, Please check manually");
	}
	
	@Test(priority = 2, groups = {"sanity"}, description="In Tools page, click on “Home Loan EMI Calculator”.")
	public void clickOnHomeLoanEMICalculator() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Assert.assertTrue(emiCalculatorPageInstance.clickonHomeLoanEMICalculator(),"Home Loan EMI Calculator is not present in the current page, Please check manually") ;	
		Assert.assertTrue(locatorsFactoryInstance.loanAmountTextFieldIsPresent(driver).isDisplayed(), "Loan Amount TextField is not present in the current page, Please check manually");
	}
	
	@Test(priority = 3, groups = {"sanity"}, description="Enter the load amount as 3000000")
	public void enterTheLoadAmount() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEMICalculator");
		Assert.assertEquals(emiCalculatorPageInstance.entertheLoadAmountAs3000000(expectedData),expectedData.get("LoanAmount"),"Load Amount is not present in the current page, Please check manually") ;	
		Assert.assertEquals(locatorsFactoryInstance.loanAmountTextFieldValueIsPresent(),expectedData.get("LoanAmount"), "Loan Amount TextField value is not present in the current page, Please check manually");
	}
	@Test(priority = 4, groups = {"sanity"}, description="Enter the load period as 20")
	public void enterTheLoadPeriod() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEMICalculator");
		Assert.assertEquals(emiCalculatorPageInstance.enterTheLoanPeriodAs20(expectedData),expectedData.get("LoanPeriod"),"Loan Period is not present in the current page, Please check manually") ;	
		Assert.assertEquals(locatorsFactoryInstance.loanPeriodTextFieldValueIsPresent(),expectedData.get("LoanPeriod"), "Loan Period value is not present in the current page, Please check manually");
	}
	@Test(priority = 5, groups = {"sanity"}, description="Enter interest rate as “10.5”")
	public void enterInterestRate() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEMICalculator");
		Assert.assertEquals(emiCalculatorPageInstance.enterInterestRateAs10_5(expectedData),expectedData.get("interestRate"),"Interest Rate is not present in the current page, Please check manually") ;	
		Assert.assertEquals(locatorsFactoryInstance.interestRateTextFieldValueIsPresent(),expectedData.get("interestRate"), "Interest Rate TextField value is not present in the current page, Please check manually");
	}
	@Test(priority = 6, groups = {"sanity"}, description="Enter Upfront charges as 10000")
	public void enterUpfrontCharges() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEMICalculator");
		Assert.assertEquals(emiCalculatorPageInstance.enterUpfrontChargesAs10000(expectedData),expectedData.get("upfrontCharges"),"Up front Charges is not present in the current page, Please check manually") ;	
		Assert.assertEquals(locatorsFactoryInstance.upfrontChargesTextFieldValueIsPresent(),expectedData.get("upfrontCharges"), "Up front Charges value is not present in the current page, Please check manually");
	}
	@Test(priority = 7, groups = {"sanity"}, description="Click on Submit")
	public void clickOnSubmit() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Assert.assertTrue(emiCalculatorPageInstance.clickOnSubmitButton(),"Submit button is not present in the current page, Please check manually") ;	
		Assert.assertTrue(locatorsFactoryInstance.resetButtonIsPresent(driver).isDisplayed(), "Reset Button is not present in the current page, Please check manually");
	}
	@Test(priority = 8, groups = {"sanity"}, description="Print Total payment and EMI in console")
	public void printTotalPaymentAndEMIInConsole() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Assert.assertTrue(emiCalculatorPageInstance.printTotalPaymentandEMIInConsole(),"Total payment and EMI is not present in the current page, Please check manually") ;	
		Assert.assertTrue(locatorsFactoryInstance.emiReadOnlyFieldIsPresent(driver).isDisplayed(), "Emi Read Only Field is not present in the current page, Please check manually");
	}
	@Test(priority = 9, groups = {"sanity"}, description="Under load payment schedule table, print the following details 7th year")
	public void printEMIPaymentInterestPaymentPrincipalPaymentOf7thYear() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Assert.assertTrue(emiCalculatorPageInstance.printEmiPaymentInterestPaymentPrincipalPaymentOf7thYear(),"following details are not present in the current page, Please check manually") ;	
		Assert.assertTrue(locatorsFactoryInstance.interestPaymentInTheYearFieldIsPresent(driver).isDisplayed(), "Interest Payment In The Year Field is not present in the current table, Please check manually");
	}
	@Test(priority = 10, groups = {"sanity"}, description="Print “Outstanding Principal at end of year” value for 5th year in the table")
	public void printOutstandingPrincipalAtEndOfYearValueFor5thYearInTheTable() throws Exception {
		emiCalculatorPageInstance = new Emi_Calculator_L1_Pages(driver);
		Assert.assertTrue(emiCalculatorPageInstance.printOutstandingPrincipalAtEndOfYearValueFor5thYearIntheTable(),"Outstanding Principal at end of year is not present in the current page, Please check manually") ;	
		Assert.assertTrue(locatorsFactoryInstance.emiPaymentInTheYearFieldIsPresent(driver).isDisplayed(), "Emi Payment In The Year Field is not present in the current table, Please check manually");
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
