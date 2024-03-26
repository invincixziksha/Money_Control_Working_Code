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
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean entermedicalDentalCost(Map<String, String> expectedData) throws Exception {
		Boolean medicalDentalCostsTextFieldisFilled=false;
		try {
			commonEvents.sendKeys(medicalDentalCostsTextField,expectedData.get("MedicalDentalCostAmount"));
			if(commonEvents.getAttribute(medicalDentalCostsTextField, "value").equals(expectedData.get("MedicalDentalCostAmount"))) {
				medicalDentalCostsTextFieldisFilled = true;
			}		
			}catch(Exception e) {
			throw e;
		}	
		return medicalDentalCostsTextFieldisFilled;
	}
	
	
	/**@Test3
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Vehicle Repair cost
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean enterVehicleRepaircost(Map<String, String> expectedData) throws Exception {
		Boolean vehicleRepaircostTextFieldIsFilled=false;
		try {
			commonEvents.sendKeys(vehicleRepaircostTextField,expectedData.get("VehicleRepairCost"));
			if(commonEvents.getAttribute(vehicleRepaircostTextField, "value").equals(expectedData.get("VehicleRepairCost"))) {
				vehicleRepaircostTextFieldIsFilled = true;
			}		
			}catch(Exception e) {
			throw e;
		}	
		return vehicleRepaircostTextFieldIsFilled;
	}
	
	/**@Test4
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Other Cost
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean enterOtherCost(Map<String, String> expectedData) throws Exception {
		Boolean otherCostTextFieldIsFilled=false;
		try {
			commonEvents.sendKeys(otherCostTextField,expectedData.get("OtherCosts"));
			if(commonEvents.getAttribute(otherCostTextField, "value").equals(expectedData.get("OtherCosts"))) {
				otherCostTextFieldIsFilled = true;
			}		
			}catch(Exception e) {
			throw e;
		}	
		return otherCostTextFieldIsFilled;
	}
	
	
	
	/**@Test5
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Life Health Insurance Premium 
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean enterLifeHealthInsurancePremiumToBePaid(Map<String, String> expectedData) throws Exception {
		Boolean lifeInsurancePremiumTextFieldIsFilled=false;
		try {
			commonEvents.sendKeys(lifeInsurancePremiumTextField,expectedData.get("lifeInsurancePremiumCost"));
			if(commonEvents.getAttribute(lifeInsurancePremiumTextField, "value").equals(expectedData.get("lifeInsurancePremiumCost"))) {
				lifeInsurancePremiumTextFieldIsFilled = true;
			}		
			}catch(Exception e) {
			throw e;
		}	
		return lifeInsurancePremiumTextFieldIsFilled;
	}
	
	
	/**@Test6
	 * about this method enterHomeAndAutoInsurancePremiumTobePaid() 
	 * @param : Map<String, String>
	 * @description : enter Home And Auto Insurance Premium
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean enterHomeAndAutoInsurancePremiumTobePaid(Map<String, String> expectedData) throws Exception {
		Boolean homeAndAutoInsurancePremiumTextFieldIsFilled=false;
		try {
			commonEvents.sendKeys(homeAndAutoInsurancePremiumTextField,expectedData.get("homeAndAutoInsurancePremiumAmount"));
			if(commonEvents.getAttribute(homeAndAutoInsurancePremiumTextField, "value").equals(expectedData.get("homeAndAutoInsurancePremiumAmount"))) {
				homeAndAutoInsurancePremiumTextFieldIsFilled = true;
			}		
			}catch(Exception e) {
			throw e;
		}	
		return homeAndAutoInsurancePremiumTextFieldIsFilled;
	}
	
	/**@Test7
	 * about this method enterHomeLoanAndOtherImportantEMIToBePaid() 
	 * @param : Map<String, String>
	 * @description : enter Home Loan And Other Important EMI
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean enterHomeLoanAndOtherImportantEMIToBePaid(Map<String, String> expectedData) throws Exception {
		Boolean homeLoanAndOtherImportantEMIsTextFieldIsFilled=false;
		try {
			commonEvents.sendKeys(homeLoanAndOtherImportantEMIsTextField,expectedData.get("HomeLoanAndOtherImportantEMIsCost"));
			if(commonEvents.getAttribute(homeLoanAndOtherImportantEMIsTextField, "value").equals(expectedData.get("HomeLoanAndOtherImportantEMIsCost"))) {
				homeLoanAndOtherImportantEMIsTextFieldIsFilled = true;
			 }		
			}catch(Exception e) {
			throw e;
		}	
		return homeLoanAndOtherImportantEMIsTextFieldIsFilled;
	}
	
	
	/**@Test8
	 * about this method enterMonthlylivingExpenses() 
	 * @param : Map<String, String>
	 * @description : enter Monthly living Expenses
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean enterMonthlylivingExpenses(Map<String, String> expectedData) throws Exception {
		Boolean monthlyLivingExpensesTextFieldIsFilled=false;
		try {
			commonEvents.sendKeys(monthlyLivingExpensesTextField,expectedData.get("monthlyLivingExpensesAmount"));
			if(commonEvents.getAttribute(monthlyLivingExpensesTextField, "value").equals(expectedData.get("monthlyLivingExpensesAmount"))) {
				monthlyLivingExpensesTextFieldIsFilled = true;
			 }		
			}catch(Exception e) {
			throw e;
		}	
		return monthlyLivingExpensesTextFieldIsFilled;
	}
	
	/**@Test9
	 * about this method enterNumberofMonthsIfUnemployed() 
	 * @param : Map<String, String>
	 * @description : enter Number of Months If Unemployed
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean enterNumberofMonthsIfUnemployed(Map<String, String> expectedData) throws Exception {
		Boolean monthUnemployedTextFieldIsFilled=false;
		try {
			commonEvents.sendKeys(monthUnemployedTextField,expectedData.get("monthUnemployedData"));
			if(commonEvents.getAttribute(monthUnemployedTextField, "value").equals(expectedData.get("monthUnemployedData"))) {
				monthUnemployedTextFieldIsFilled = true;
			 }		
			}catch(Exception e) {
			throw e;
		}	
		return monthUnemployedTextFieldIsFilled;
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
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkUninsuredEmergencyAmountrequired() throws Exception {
		Boolean uninsuredOrUnexpectedEmergenciesFieldIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(uninsuredOrUnexpectedEmergenciesField))
			{
				uninsuredOrUnexpectedEmergenciesFieldIsDisplayed = true;  }
			}catch(Exception e) {
			throw e;
		}	
		return uninsuredOrUnexpectedEmergenciesFieldIsDisplayed;
	}
	
	/**@Test12
	 * about this method checkAnnualAmountOfFixedPaymentsToBedone() 
	 * @param : null
	 * @description : check annual Amount Of Fixed Payments Field is displayed
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkAnnualAmountOfFixedPaymentsToBedone() throws Exception {
		Boolean annualAmountOfFixedPaymentsFieldIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(annualAmountOfFixedPaymentsField))
			{
				annualAmountOfFixedPaymentsFieldIsDisplayed = true;  }
			}catch(Exception e) {
			throw e;
		}	
		return annualAmountOfFixedPaymentsFieldIsDisplayed;
	}
	
	/**@Test13
	 * about this method checkTotalAmountOfReserveToBeBuild() 
	 * @param : null
	 * @description : check build Reserve To Pay For Job Loss Field is diplayed
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkTotalAmountOfReserveToBeBuild() throws Exception {
		Boolean buildReserveToPayForJobLossFieldIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(buildReserveToPayForJobLossField))
			{
				buildReserveToPayForJobLossFieldIsDisplayed = true;  }
			}catch(Exception e) {
			throw e;
		}	
		return buildReserveToPayForJobLossFieldIsDisplayed;
	}
	
	/**@Test14
	 * about this method checktheResult() 
	 * @param : null
	 * @description : check the result is present or not and print the result
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checktheResult() throws Exception {
		Boolean resultFieldIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(resultField))
			{
				String result=commonEvents.getText(resultField);
				System.out.println("Total Result is :" +result);
				resultFieldIsDisplayed = true;  }
			}catch(Exception e) {
			throw e;
		}	
		return resultFieldIsDisplayed;
	}
}
