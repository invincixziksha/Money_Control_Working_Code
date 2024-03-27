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
	
	@Test(priority = 1, groups = {"sanity"}, description="Navigate to “Emergency Fund Calculator” sub-menu from “Personal Finance” Menu and velidate the title of this page")
	public void navigateToEmergencyFundCalculator() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "MoneyControlPageTitle");
		Assert.assertEquals(emergencyFundInstance.navigateToEmergencyfundCalculator(),expectedData.get("EmergencyFundCalculatorPageTitle")) ;
		Assert.assertTrue(locatorsFactoryInstance.commoditiesIsPresent(driver).isDisplayed(), "commodities tab is not present in the current page, Please check manually");
	}	
	@Test(priority = 2, groups = {"sanity"}, description="Enter medical dental cost.")
	public void enterMedicalDentalCost() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.entermedicalDentalCost(expectedData),expectedData.get("MedicalDentalCostAmount"),"Medical Dental Costs field Is not Present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.medicalDentalCostsValueIsPresent(),expectedData.get("MedicalDentalCostAmount"),"Medical Dental Costs Value Is not Present, please check manually");
	}	
	@Test(priority = 3, groups = {"sanity"}, description="Enter Vehicle repair cost")
	public void enterVehicleRepairCost() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.enterVehicleRepaircost(expectedData),expectedData.get("VehicleRepairCost"),"Vehicle Repair cost field is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.vehicleRepaircostValueIsPresent(),expectedData.get("VehicleRepairCost"),"Vehicle Repair cost Value Is not Present, please check manually");
	}	
	@Test(priority = 4, groups = {"sanity"}, description="Enter other costs")
	public void enterOtherCosts() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.enterOtherCost(expectedData), expectedData.get("OtherCosts"),"Other Cost field is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.otherCostTextFieldValueIsPresent(),expectedData.get("OtherCosts"), " Other Cost field is not displayed in the current page, Please check manually");

	}
	
	@Test(priority = 5, groups = {"sanity"}, description="Enter Life Health Insurance Premiums to be paid")
	public void enterLifeHealthInsurancePremiumsToBePaid() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.enterLifeHealthInsurancePremiumToBePaid(expectedData),expectedData.get("lifeInsurancePremiumCost"),"LifeInsurance Premium TextField is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.lifeInsurancePremiumTextFieldValueIsPresent(),expectedData.get("lifeInsurancePremiumCost"), "LifeInsurance Premium TextField field value is not matching in the current page, Please check manually");

	}
	
	@Test(priority = 6, groups = {"sanity"}, description="Enter Home and Auto insurance premium to be paid")
	public void enterHomeAndAutoInsurancePremiumToBePaid() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.enterHomeAndAutoInsurancePremiumTobePaid(expectedData),expectedData.get("homeAndAutoInsurancePremiumAmount"),"Home And Auto Insurance Premium field is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.homeAndAutoInsurancePremiumextFieldValueIsPresent(),expectedData.get("homeAndAutoInsurancePremiumAmount"),"Home And Auto Insurance Premium value is not present, please check manually");

	}
	
	@Test(priority = 7, groups = {"sanity"}, description="Enter home loan and other important EMIS to be paid")
	public void enterHomeLoanAndOtherImportantEMISToBePaid() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.enterHomeLoanAndOtherImportantEMIToBePaid(expectedData),expectedData.get("HomeLoanAndOtherImportantEMIsCost"),"Home Loan And Other Important EMI field is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.homeLoanAndOtherImportantEMIsTextFieldValueIsPresent(),expectedData.get("HomeLoanAndOtherImportantEMIsCost"), " Home Loan And Other Important EMI field value is not displayed in the current page, Please check manually");
	}
	
	@Test(priority = 8, groups = {"sanity"}, description="Enter monthly living expenses")
	public void enterMonthlyLivingExpenses() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.enterMonthlylivingExpenses(expectedData), expectedData.get("monthlyLivingExpensesAmount"),"Monthly living Expenses field is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.monthlyLivingExpensesTextFieldValueIsPresent(),expectedData.get("monthlyLivingExpensesAmount"), "Monthly living Expenses value is not displayed in the current page, Please check manually");
	}
	@Test(priority = 9, groups = {"sanity"}, description="Enter number of months if unemployed")
	public void enterNumberOfMonthsIfUnemployed() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.enterNumberofMonthsIfUnemployed(expectedData),expectedData.get("monthUnemployedData") ,"Number of Months If Unemployed field is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.monthUnemployedTextFieldValueIsPresent(),expectedData.get("monthUnemployedData") , "Number of Months If Unemployed field value is not present, please check manually");
	}
	@Test(priority = 10, groups = {"sanity"}, description="Click on calculate button")
	public void clickOnCalculateButton() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		Assert.assertTrue(emergencyFundInstance.clickonCalculateButton(), "Calculate button is not present, please check manually");	
		Assert.assertTrue(locatorsFactoryInstance.monthUnemployedTextFieldIsPresent(driver).isDisplayed(), "Month Unemployed TextField  is not displayed in the current page, Please check manually");
	}
	@Test(priority = 11, groups = {"sanity"}, description="Check the uninsured emergency amount required")
	public void checkUninsuredEmergencyAmountRequired() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.checkUninsuredEmergencyAmountrequired(),expectedData.get("Uninsured or unexpected emergencies Amount") ,"Uninsured Emergency Amount is not present, please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.uninsuredOrUnexpectedEmergenciesFieldValueIsPresent(),expectedData.get("Uninsured or unexpected emergencies Amount") , "Uninsured Or Unexpected Emergencies value is not displayed in the current page, Please check manually");
	}
	@Test(priority = 12, groups = {"sanity"}, description="Check annual amount of fixed payments to be done")
	public void checkAnnualAmountOfFixedPaymentsToBeDone() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.checkAnnualAmountOfFixedPaymentsToBedone(),expectedData.get("Annual amount of fixed payments") ,"Annual Amount Of Fixed Payments Field is not displayed in the current page, Please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.annualAmountOfFixedPaymentsFieldValueIsPresent(),expectedData.get("Annual amount of fixed payments"), "Annual Amount Of Fixed Payments Field value is not displayed in the current page, Please check manually");
	}
	@Test(priority = 13, groups = {"sanity"}, description="Check for total amount of reserve to be build")
	public void checkForTotalAmountOfReserveToBeBuild() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.checkTotalAmountOfReserveToBeBuild(),expectedData.get("Build a reserve to pay for job loss")  ,"Build Reserve To Pay For Job Loss Field is not displayed in the current page, Please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.buildReserveToPayForJobLossFieldValueIsPresent(),expectedData.get("Build a reserve to pay for job loss") , "Build Reserve To Pay For Job Loss Field is not displayed in the current page, Please check manually");
	}
	@Test(priority = 14, groups = {"sanity"}, description="Check the result")
	public void checkTheResult() throws Exception {
		emergencyFundInstance = new Emergency_Fund_Calculator_L1_Page(driver);
		locatorsFactoryInstance=new LocatorsFactory(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "ValuesForEmergencyFieldCalculator");
		Assert.assertEquals(emergencyFundInstance.checktheResult(), expectedData.get("ResultValue") ,"Result Field is not displayed in the current page, Please check manually");	
		Assert.assertEquals(locatorsFactoryInstance.resultValueIsPresent(),expectedData.get("ResultValue") , "Result value is not displayed in the current page, Please check manually");
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
