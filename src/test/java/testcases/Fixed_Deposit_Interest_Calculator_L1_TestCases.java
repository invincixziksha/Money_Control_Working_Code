

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
import pages.Fixed_Deposit_Interest_Calculator_L1_Pages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class Fixed_Deposit_Interest_Calculator_L1_TestCases extends AppTestBase {
	
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	Fixed_Deposit_Interest_Calculator_L1_Pages moneyControlInstance;
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
	
	
	@Test(priority = 1, groups = {"sanity"}, description="Navigate to “Fixed Deposit Interest Calculator” sub-menu from “Personal Finance” Menu.")
	public void navigateToFixedDepositInterestCalculatorPage() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "MoneyControlPageTitle");
		Assert.assertEquals(moneyControlInstance.validateTitleOfCurrentPage(), expectedData.get("HomepageTitle"));
		Assert.assertEquals(moneyControlInstance.navigateToFixedDepositInterestCalculatorPage(),expectedData.get("FixedDepositInterestCalculatorPageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.fixedDepositCalculatorHeader(driver).isDisplayed(), "fixed Deposit Calculator Header is not present in the current page, Please check manually");
	}	
	
	@Test(priority = 2, groups = {"sanity"}, description="Enter Investment amount.")
	public void enterInvestmentAmountInFixedDepositInterestCalculatorForm() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "fixedDepositInterestCalculatorCalculatorForm");
		Assert.assertEquals(moneyControlInstance.enterInvestmentAmountInFixedDepositInterestCalculatorForm(expectedData), expectedData.get("InvestmentAmountValue"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredInvestmentAmountIsPresent(), expectedData.get("InvestmentAmountValue"));
		Assert.assertTrue(LocatorsFactoryInstance.investmentPeriodTextfield(driver).isDisplayed(), "investment Period Textfield is not present in the current page, Please check manually");
	}
	
	@Test(priority = 3, groups = {"sanity"}, description="Enter Investment period.")
	public void enterInvestmentPeriodInFixedDepositInterestCalculatorForm() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "fixedDepositInterestCalculatorCalculatorForm");
		Assert.assertEquals(moneyControlInstance.enterInvestmentPeriodInFixedDepositInterestCalculatorForm(expectedData), expectedData.get("InvestmentPeriodValue"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredInvestmentPeriodIsPresent(), expectedData.get("InvestmentPeriodValue"));
		Assert.assertTrue(LocatorsFactoryInstance.rateOfReturnTextfield(driver).isDisplayed(), "rate Of Return Textfield is not present in the current page, Please check manually");
	}
	
	@Test(priority = 4, groups = {"sanity"}, description="Enter rate of return.")
	public void enterRateOfReturnInFixedDepositInterestCalculatorForm() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		LocatorsFactory LocatorsFactoryInstance = new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "fixedDepositInterestCalculatorCalculatorForm");
		Assert.assertEquals(moneyControlInstance.enterRateOfReturnInFixedDepositInterestCalculatorForm(expectedData), expectedData.get("RateOfReturnValue"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredRateOfReturnIsPresent(), expectedData.get("RateOfReturnValue"));
		Assert.assertTrue(LocatorsFactoryInstance.interestFrequencyYearlyButton(driver).isDisplayed(), "interest Frequency Yearly Button is not present in the current page, Please check manually");
	}
	
	@Test(priority = 5, groups = {"sanity"}, description="Select interest frequency.")
	public void selectInterestFrequencyButtonInFixedDepositInterestCalculatorForm() throws Exception {	
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		Assert.assertTrue(moneyControlInstance.selectInterestFrequencyButtonInFixedDepositInterestCalculatorForm(), "yearly Interest frequency button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.taxRateTextfield(driver).isDisplayed(), "tax Rate Textfield is not present in the current page, Please check manually");
	}
	
	@Test(priority = 6, groups = {"sanity"}, description="Enter tax rate.")
	public void enterTaxRateInFixedDepositInterestCalculatorForm() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		LocatorsFactory LocatorsFactoryInstance = new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "fixedDepositInterestCalculatorCalculatorForm");
		Assert.assertEquals(moneyControlInstance.enterTaxRateInFixedDepositInterestCalculatorForm(expectedData), expectedData.get("TaxRateValue"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyTaxRateEnteredValueIsPresent(), expectedData.get("TaxRateValue"));
		Assert.assertTrue(LocatorsFactoryInstance.submitButton(driver).isDisplayed(), "submit Button is not present in the current page, Please check manually");
	}
	
	@Test(priority = 7, groups = {"sanity"}, description="Fetch total interest.")
	public void fetchTotalInterest() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		Assert.assertTrue(moneyControlInstance.fetchTotalInterest(), "total interest result button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.totalInterestResultButton(driver).isDisplayed(), "total Interest Result Button is not present in the current page, Please check manually");
	}
	
	@Test(priority = 8, groups = {"sanity"}, description="fetch Total Payment")
	public void fetchTotalPayment() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		Assert.assertTrue(moneyControlInstance.fetchTotalPayment(), "total payment result button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.totalPaymentResultButton(driver).isDisplayed(), "total Payment Result Button is not present in the current page, Please check manually");
	}
	
	@Test(priority = 9, groups = {"sanity"}, description="Fetch total corpus.")
	public void fetchTotalCorpus() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		Assert.assertTrue(moneyControlInstance.fetchTotalCorpus(), "total Corpus result button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.totalCorpusResultButton(driver).isDisplayed(), "total Corpus Result Button is not present in the current page, Please check manually");
	}
	
	@Test(priority = 10, groups = {"sanity"}, description="Fetch tax amount.")
	public void fetchTaxAmount() throws Exception {
		moneyControlInstance = new Fixed_Deposit_Interest_Calculator_L1_Pages(driver);
		Assert.assertTrue(moneyControlInstance.fetchTaxAmount(), "total tax amount result button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.totalTaxAmountResultButton(driver).isDisplayed(), "total Tax Amount Result Button is not present in the current page, Please check manually");
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
