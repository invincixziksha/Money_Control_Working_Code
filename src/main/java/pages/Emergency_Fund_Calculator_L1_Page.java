package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Emergency_Fund_Calculator_L1_Page extends StartupPage {

	By personalFinancepage=By.xpath("(//a[@title='Personal Finance'])[2]");
	By emergencyFundCalculator=By.xpath("//a[@title='Emergency Fund Calculator']");
	By medicalDentalCostsTextField=By.xpath("//input[@name='medical_dental_costs']");
	By vehicleRepaircostTextField=By.xpath("//input[@name='vehicle_repairs']");
	By otherCostTextField=By.xpath("//input[@name='others']");
	By lifeInsurancePremiumTextField=By.xpath("//input[@name='life_insurance_premium']");
	By homeAndAutoInsurancePremiumTextField=By.xpath("//input[@name='medical_insurance_premium']");
	By homeLoanAndOtherImportantEMIsTextField=By.xpath("//input[@name='home_auto_insurance_premium']");
	By monthlyLivingExpensesTextField=By.xpath("//input[@name='monthly_living_expenses']");
	By monthUnemployedTextField=By.xpath("//input[@name='month_unemployed']");
	By calculateButton=By.xpath("//img[contains(@onclick,'final_calculate')]");
	By uninsuredOrUnexpectedEmergenciesField=By.xpath("//div[@id='uninsured']"); 
	By annualAmountOfFixedPaymentsField=By.xpath("//div[@id='insurance']");
	By buildReserveToPayForJobLossField=By.id("unemploy");
	By resultField=By.xpath("//span[@style='color:#ff6600;']");
	
	
	String pageName = this.getClass().getSimpleName();
	public Emergency_Fund_Calculator_L1_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	/**@Test1
	 * about this method navigateToEmergencyfundCalculator() 
	 * @param : null
	 * @description : go to the personal finance page and click on the emergency Fund Calculator
	 * @return : String
	 * @author : Yaksha
	 */
	public String navigateToEmergencyfundCalculator() throws Exception {
		String emergencyFundCalculatorPageTitle="";
		try {
			commonEvents.mouseHoverOperation(personalFinancepage, "elementName", "pageName");
			commonEvents.click(emergencyFundCalculator);
			emergencyFundCalculatorPageTitle=commonEvents.getTitle();
			System.out.println("Page Title is :" +emergencyFundCalculatorPageTitle);
		}catch(Exception e) {
			throw e;
		}	
		return emergencyFundCalculatorPageTitle;
	}

	/**@Test2
	 * about this method entermedicalDentalCost() 
	 * @param : Map<String, String>
	 * @description : enter medical Dental Cost
	 * @return : String
	 * @author : Yaksha
	 */
	public String entermedicalDentalCost(Map<String, String> expectedData) throws Exception {
		String medicalDentalCostsTextFieldValue="";
		try {
			commonEvents.sendKeys(medicalDentalCostsTextField,expectedData.get("MedicalDentalCostAmount"));
			medicalDentalCostsTextFieldValue=commonEvents.getAttribute(medicalDentalCostsTextField, "value");
			System.out.println("Medical Dental Cost is :" +medicalDentalCostsTextFieldValue);					
			}catch(Exception e) {
			throw e;
		}	
		return medicalDentalCostsTextFieldValue;
	}
	
	
	/**@Test3
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Vehicle Repair cost
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterVehicleRepaircost(Map<String, String> expectedData) throws Exception {
		String vehicleRepaircostTextFieldIsFilled="";
		try {
			commonEvents.sendKeys(vehicleRepaircostTextField,expectedData.get("VehicleRepairCost"));
			vehicleRepaircostTextFieldIsFilled=commonEvents.getAttribute(vehicleRepaircostTextField, "value");
			}catch(Exception e) {
			throw e;
		}	
		return vehicleRepaircostTextFieldIsFilled;
	}
	
	/**@Test4
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Other Cost
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterOtherCost(Map<String, String> expectedData) throws Exception {
		String otherCostTextFieldIsFilled="";
		try {
			commonEvents.sendKeys(otherCostTextField,expectedData.get("OtherCosts"));
			otherCostTextFieldIsFilled=commonEvents.getAttribute(otherCostTextField, "value");				
			}catch(Exception e) {
			throw e;
		}	
		return otherCostTextFieldIsFilled;
	}
	
	
	
	/**@Test5
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Life Health Insurance Premium 
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterLifeHealthInsurancePremiumToBePaid(Map<String, String> expectedData) throws Exception {
		String lifeInsurancePremiumTextFieldIsFilled="";
		try {
			commonEvents.sendKeys(lifeInsurancePremiumTextField,expectedData.get("lifeInsurancePremiumCost"));
			lifeInsurancePremiumTextFieldIsFilled=commonEvents.getAttribute(lifeInsurancePremiumTextField, "value");		
			}catch(Exception e) {
			throw e;
		}	
		return lifeInsurancePremiumTextFieldIsFilled;
	}
	
	
	/**@Test6
	 * about this method enterHomeAndAutoInsurancePremiumTobePaid() 
	 * @param : Map<String, String>
	 * @description : enter Home And Auto Insurance Premium
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterHomeAndAutoInsurancePremiumTobePaid(Map<String, String> expectedData) throws Exception {
		String homeAndAutoInsurancePremiumTextFieldValue="";
		try {
			commonEvents.sendKeys(homeAndAutoInsurancePremiumTextField,expectedData.get("homeAndAutoInsurancePremiumAmount"));
			homeAndAutoInsurancePremiumTextFieldValue=commonEvents.getAttribute(homeAndAutoInsurancePremiumTextField, "value");	
			}catch(Exception e) {
			throw e;
		}	
		return homeAndAutoInsurancePremiumTextFieldValue;
	}
	
	/**@Test7
	 * about this method enterHomeLoanAndOtherImportantEMIToBePaid() 
	 * @param : Map<String, String>
	 * @description : enter Home Loan And Other Important EMI
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterHomeLoanAndOtherImportantEMIToBePaid(Map<String, String> expectedData) throws Exception {
		String homeLoanAndOtherImportantEMIsTextFieldValue="";
		try {
			commonEvents.sendKeys(homeLoanAndOtherImportantEMIsTextField,expectedData.get("HomeLoanAndOtherImportantEMIsCost"));
			homeLoanAndOtherImportantEMIsTextFieldValue=commonEvents.getAttribute(homeLoanAndOtherImportantEMIsTextField, "value");
					
			}catch(Exception e) {
			throw e;
		}	
		return homeLoanAndOtherImportantEMIsTextFieldValue;
	}
	
	
	/**@Test8
	 * about this method enterMonthlylivingExpenses() 
	 * @param : Map<String, String>
	 * @description : enter Monthly living Expenses
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterMonthlylivingExpenses(Map<String, String> expectedData) throws Exception {
		String monthlyLivingExpensesTextFieldValue="";
		try {
			commonEvents.sendKeys(monthlyLivingExpensesTextField,expectedData.get("monthlyLivingExpensesAmount"));
			monthlyLivingExpensesTextFieldValue=commonEvents.getAttribute(monthlyLivingExpensesTextField, "value");	
			}catch(Exception e) {
			throw e;
		}	
		return monthlyLivingExpensesTextFieldValue;
	}
	
	/**@Test9
	 * about this method enterNumberofMonthsIfUnemployed() 
	 * @param : Map<String, String>
	 * @description : enter Number of Months If Unemployed
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterNumberofMonthsIfUnemployed(Map<String, String> expectedData) throws Exception {
		String monthUnemployedTextFieldValue="";
		try {
			commonEvents.sendKeys(monthUnemployedTextField,expectedData.get("monthUnemployedData"));
			monthUnemployedTextFieldValue=commonEvents.getAttribute(monthUnemployedTextField, "value");
				
			}catch(Exception e) {
			throw e;
		}	
		return monthUnemployedTextFieldValue;
	}
	
	/**@Test10
	 * about this method clickonCalculateButton() 
	 * @param : null
	 * @description : click on Calculate Button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickonCalculateButton() throws Exception {
		Boolean calculateButtonIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(calculateButton)) {
				commonEvents.click(calculateButton);
				Thread.sleep(3000);
				calculateButtonIsDisplayed = true;  }		
			}catch(Exception e) {
			throw e;
		}	
		return calculateButtonIsDisplayed;
	}
	
	/**@Test11
	 * about this method checkUninsuredEmergencyAmountrequired() 
	 * @param : null
	 * @description : check Uninsured Emergency Amount required
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkUninsuredEmergencyAmountrequired() throws Exception {
		String uninsuredOrUnexpectedEmergenciesFieldValue="";
		try {
			    commonEvents.isDisplayed(uninsuredOrUnexpectedEmergenciesField);
				uninsuredOrUnexpectedEmergenciesFieldValue=commonEvents.getText(uninsuredOrUnexpectedEmergenciesField);
				System.out.println("Uninsured Or Unexpected Amount: "+uninsuredOrUnexpectedEmergenciesFieldValue);
			}catch(Exception e) {
			throw e;
		}	
		return uninsuredOrUnexpectedEmergenciesFieldValue;
	}
	
	/**@Test12
	 * about this method checkAnnualAmountOfFixedPaymentsToBedone() 
	 * @param : null
	 * @description : check annual Amount Of Fixed Payments Field is displayed
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkAnnualAmountOfFixedPaymentsToBedone() throws Exception {
		String annualAmountOfFixedPaymentsFieldValue="";
		try {
			commonEvents.isDisplayed(annualAmountOfFixedPaymentsField);
			annualAmountOfFixedPaymentsFieldValue=commonEvents.getText(annualAmountOfFixedPaymentsField);
			System.out.println("Annual amount of fixed payments: "+annualAmountOfFixedPaymentsFieldValue);
			}catch(Exception e) {
			throw e;
		}	
		return annualAmountOfFixedPaymentsFieldValue;
	}
	
	/**@Test13
	 * about this method checkTotalAmountOfReserveToBeBuild() 
	 * @param : null
	 * @description : check build Reserve To Pay For Job Loss Field is diplayed
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkTotalAmountOfReserveToBeBuild() throws Exception {
		String buildReserveToPayForJobLossFieldValue="";
		try {
			commonEvents.isDisplayed(buildReserveToPayForJobLossField);
			buildReserveToPayForJobLossFieldValue=commonEvents.getText(buildReserveToPayForJobLossField);
			System.out.println("Build a reserve to pay for job loss Amount: "+buildReserveToPayForJobLossFieldValue);
		   }
			catch(Exception e) {
			throw e;
		}	
		return buildReserveToPayForJobLossFieldValue;
	}
	
	/**@Test14
	 * about this method checktheResult() 
	 * @param : null
	 * @description : check the result is present or not and print the result
	 * @return : String
	 * @author : Yaksha
	 */
	public String checktheResult() throws Exception {
		String resultFieldValue="";
		try {
			    commonEvents.isDisplayed(resultField);
				resultFieldValue=commonEvents.getText(resultField);
				System.out.println("Total Result is :" +resultFieldValue);
			}catch(Exception e) {
			throw e;
		}	
		return resultFieldValue;
	}
}
