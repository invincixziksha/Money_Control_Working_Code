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
import pages.Emergency_Fund_Calculator_L1_Page;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class Emergency_Fund_Calculator_L1_Testcase extends AppTestBase
{
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	Emergency_Fund_Calculator_L1_Page emergencyFundInstance;
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
	
	@Test(priority = 1, groups = {"sanity"}, description="Navigate to “Emergency Fund Calculator” sub-menu from “Personal Finance” Menu and velidate the title of this page")
	public void navigateToEmergencyFundCalculator() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "MoneyControlPageTitle");
		Assert.assertEquals(emergencyFundInstance.navigateToEmergencyfundCalculator(),expectedData.get("EmergencyFundCalculatorPageTitle")) ;
		Assert.assertTrue(LocatorsFactoryInstance.commoditiesIsPresent(driver).isDisplayed(), "commodities tab is not present in the current page, Please check manually");
	}	
	@Test(priority = 2, groups = {"sanity"}, description="Enter medical dental cost.")
	public void enterMedicalDentalCost() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.entermedicalDentalCost(expectedData), "Medical Dental Cost is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.medicalDentalCostsTextFieldIsPresent(driver).isDisplayed(), "Medical Dental Cost is not displayed in the current page, Please check manually");
	}	
	@Test(priority = 3, groups = {"sanity"}, description="Enter Vehicle repair cost")
	public void enterVehicleRepairCost() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.enterVehicleRepaircost(expectedData), "Vehicle Repair cost field is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.vehicleRepaircostTextFieldIsPresent(driver).isDisplayed(), "Vehicle Repair cost field is not displayed in the current page, Please check manually");
	}	
	@Test(priority = 4, groups = {"sanity"}, description="Enter other costs")
	public void enterOtherCosts() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.enterOtherCost(expectedData), "Other Cost field is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.vehicleRepaircostTextFieldIsPresent(driver).isDisplayed(), " Other Cost field is not displayed in the current page, Please check manually");
	}
	
	@Test(priority = 5, groups = {"sanity"}, description="Enter Life Health Insurance Premiums to be paid")
	public void enterLifeHealthInsurancePremiumsToBePaid() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.enterLifeHealthInsurancePremiumToBePaid(expectedData), "LifeInsurance Premium TextField is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.lifeInsurancePremiumTextFieldIsPresent(driver).isDisplayed(), "LifeInsurance Premium TextField field is not displayed in the current page, Please check manually");
	}
	
	@Test(priority = 6, groups = {"sanity"}, description="Enter Home and Auto insurance premium to be paid")
	public void enterHomeAndAutoInsurancePremiumToBePaid() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.enterHomeAndAutoInsurancePremiumTobePaid(expectedData), "Home And Auto Insurance Premium field is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.lifeInsurancePremiumTextFieldIsPresent(driver).isDisplayed(), "Life Insurance Premium TextField is not displayed in the current page, Please check manually");
	}
	
	@Test(priority = 7, groups = {"sanity"}, description="Enter home loan and other important EMIS to be paid")
	public void enterHomeLoanAndOtherImportantEMISToBePaid() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.enterHomeLoanAndOtherImportantEMIToBePaid(expectedData), "Home Loan And Other Important EMI field is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.homeLoanAndOtherImportantEMIsTextFieldIsPresent(driver).isDisplayed(), " Home Loan And Other Important EMI field is not displayed in the current page, Please check manually");
	}
	
	@Test(priority = 8, groups = {"sanity"}, description="Enter monthly living expenses")
	public void enterMonthlyLivingExpenses() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.enterMonthlylivingExpenses(expectedData), "Monthly living Expenses field is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.monthlyLivingExpensesTextFieldIsPresent(driver).isDisplayed(), "Monthly living Expenses field is not displayed in the current page, Please check manually");
	}
	@Test(priority = 9, groups = {"sanity"}, description="Enter number of months if unemployed")
	public void enterNumberOfMonthsIfUnemployed() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertTrue(emergencyFundInstance.enterNumberofMonthsIfUnemployed(expectedData), "Number of Months If Unemployed field is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.monthUnemployedTextFieldIsPresent(driver).isDisplayed(), "Month Unemployed TextField  is not displayed in the current page, Please check manually");
	}
	@Test(priority = 10, groups = {"sanity"}, description="Click on calculate button")
	public void clickOnCalculateButton() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		Assert.assertTrue(emergencyFundInstance.clickonCalculateButton(), "Calculate button is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.monthUnemployedTextFieldIsPresent(driver).isDisplayed(), "Month Unemployed TextField  is not displayed in the current page, Please check manually");
	}
	@Test(priority = 11, groups = {"sanity"}, description="Check the uninsured emergency amount required")
	public void checkUninsuredEmergencyAmountRequired() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		Assert.assertTrue(emergencyFundInstance.checkUninsuredEmergencyAmountrequired(), "Uninsured Emergency Amount is not present, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.uninsuredOrUnexpectedEmergenciesFieldIsPresent(driver).isDisplayed(), "Uninsured Or Unexpected Emergencies Field is not displayed in the current page, Please check manually");
	}
	@Test(priority = 12, groups = {"sanity"}, description="Check annual amount of fixed payments to be done")
	public void checkAnnualAmountOfFixedPaymentsToBeDone() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		Assert.assertTrue(emergencyFundInstance.checkAnnualAmountOfFixedPaymentsToBedone(), "Annual Amount Of Fixed Payments Field is not displayed in the current page, Please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.annualAmountOfFixedPaymentsFieldIsPresent(driver).isDisplayed(), "Annual Amount Of Fixed Payments Field is not displayed in the current page, Please check manually");
	}
	@Test(priority = 13, groups = {"sanity"}, description="Check for total amount of reserve to be build")
	public void checkForTotalAmountOfReserveToBeBuild() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		Assert.assertTrue(emergencyFundInstance.checkTotalAmountOfReserveToBeBuild(), "Build Reserve To Pay For Job Loss Field is not displayed in the current page, Please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.buildReserveToPayForJobLossFieldIsPresent(driver).isDisplayed(), "Build Reserve To Pay For Job Loss Field is not displayed in the current page, Please check manually");
	}
	@Test(priority = 14, groups = {"sanity"}, description="Check the result")
	public void checkTheResult() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		Assert.assertTrue(emergencyFundInstance.checktheResult(), "Result Field is not displayed in the current page, Please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.resultFieldIsPresent(driver).isDisplayed(), "Result Field is not displayed in the current page, Please check manually");
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
