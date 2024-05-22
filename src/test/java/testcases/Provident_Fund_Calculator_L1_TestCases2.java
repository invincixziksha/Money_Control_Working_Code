

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
import pages.Provident_Fund_Calculator_L1_Pages2;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class Provident_Fund_Calculator_L1_TestCases2 extends AppTestBase {
	
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	Provident_Fund_Calculator_L1_Pages2 providentFundCalculatorPageInstance;
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
	public void navigateToProvidentFundCalculatorPage() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "MoneyControlPageTitle");
		Assert.assertEquals(providentFundCalculatorPageInstance.validateTitleOfCurrentPage(), expectedData.get("HomepageTitle"));
		Assert.assertEquals(providentFundCalculatorPageInstance.navigateToProvidentFundCalculatorPage(),expectedData.get("ProvidentFundCalculatorPageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.providentFundCalculatorHeader(driver).isDisplayed(), "provident fund Calculator Header is not present in the current page, Please check manually");
	}	
	
	@Test(priority = 2, groups = {"sanity"}, description="Enter basic monthly salary.")
	public void enterBasicMonthlySalaryInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "providentFundCalculatorForm");
		Assert.assertEquals(providentFundCalculatorPageInstance.enterBasicMonthlySalaryInProvidentFundCalculatorForm(expectedData), expectedData.get("yourBasicSalaryMonthly"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredBasicMonthlySalaryIsPresent(), expectedData.get("yourBasicSalaryMonthly"));
		Assert.assertTrue(LocatorsFactoryInstance.providentFundCalculatorHeader(driver).isDisplayed(), "provident Fund Calculator Header element is not present in the current page, Please check manually");
	}
	
	@Test(priority = 3, groups = {"sanity"}, description="Enter your contribution to EPF.")
	public void enterValueInYourContributionToEPFInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "providentFundCalculatorForm");
		Assert.assertEquals(providentFundCalculatorPageInstance.enterValueInYourContributionToEPFInProvidentFundCalculatorForm(expectedData), expectedData.get("contributioToEPF"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredValueInYourContributionToEPFIsPresent(), expectedData.get("contributioToEPF"));
	}
	
	@Test(priority = 4, groups = {"sanity"}, description="Enter your employers contribution to EPF.")
	public void enterYourEmployersContributionToEPFInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "providentFundCalculatorForm");
		Assert.assertEquals(providentFundCalculatorPageInstance.enterYourEmployersContributionToEPFInProvidentFundCalculatorForm(expectedData), expectedData.get("employersContributionToEPF"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredYourEmployersContributionToEPFIsPresent(), expectedData.get("employersContributionToEPF"));
		Assert.assertTrue(LocatorsFactoryInstance.providentFundCalculatorHeader(driver).isDisplayed(), "provident Fund Calculator Header element is not present in the current page, Please check manually");
	}
	
	@Test(priority = 5, groups = {"sanity"}, description="Enter average increase in salary you expect.")
	public void enterAvgIncreaseInSalaryYouExpectcInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "providentFundCalculatorForm");
		Assert.assertEquals(providentFundCalculatorPageInstance.enterAvgIncreaseInSalaryYouExpectInProvidentFundCalculatorForm(expectedData), expectedData.get("avgIncreaseInSalaryYouExpect"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredAvgIncreaseInSalaryYouExpectIsPresent(), expectedData.get("avgIncreaseInSalaryYouExpect"));
	}
	
	@Test(priority = 6, groups = {"sanity"}, description="Enter age when you intend to retire.")
	public void enterAgeWhenYouIntendToRetireInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "providentFundCalculatorForm");
		Assert.assertEquals(providentFundCalculatorPageInstance.enterAgeWhenYouIntendToRetireInProvidentFundCalculatorForm(expectedData), expectedData.get("ageWhenYouIntendToRetire"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnterAgeWhenYouIntendToRetireIsPresent(), expectedData.get("ageWhenYouIntendToRetire"));
	}
	
	@Test(priority = 7, groups = {"sanity"}, description="Enter current EPF balance.")
	public void enterCurrentEpfBalanceIfAnyInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "providentFundCalculatorForm");
		Assert.assertEquals(providentFundCalculatorPageInstance.enterCurrentEpfBalanceIfAnyInProvidentFundCalculatorForm(expectedData), expectedData.get("currentEpfBalanceIfAny"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredCurrentEpfBalanceIfAnyIsPresent(), expectedData.get("currentEpfBalanceIfAny"));
	}
	
	@Test(priority = 8, groups = {"sanity"}, description="Enter current interest rate.")
	public void enterCurrentInterestRateInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		LocatorsFactory LocatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "providentFundCalculatorForm");
		Assert.assertEquals(providentFundCalculatorPageInstance.enterCurrentInterestRateInProvidentFundCalculatorForm(expectedData), expectedData.get("currentInterestRate"));
		Assert.assertEquals(LocatorsFactoryInstance.verifyEnteredCurrentInterestRateIsPresent(), expectedData.get("currentInterestRate"));
	}
	
	@Test(priority = 9, groups = {"sanity"}, description="click on calulator")
	public void clickOnCalculateButtonInProvidentFundCalculatorForm() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		Assert.assertTrue(providentFundCalculatorPageInstance.clickOnCalculateButtonInProvidentFundCalculatorForm(), "calculate button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.totalAmountByTheTimeYouRetireElementIsPresent(driver).isDisplayed(), "provident Fund Calculator Header element is not present in the current page, Please check manually");
	}
	
	@Test(priority = 10, groups = {"sanity"}, description="Fetch the result.")
	public void fetchTotalAmountByTheTimeYouRetire() throws Exception {
		providentFundCalculatorPageInstance = new Provident_Fund_Calculator_L1_Pages2(driver);
		Assert.assertTrue(providentFundCalculatorPageInstance.fetchTotalAmountByTheTimeYouRetire(), "total payment result button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.youWillHaveAccumulatedTextIsPresent(driver).isDisplayed(), "provident Fund Calculator Header element is not present in the current page, Please check manually");
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
