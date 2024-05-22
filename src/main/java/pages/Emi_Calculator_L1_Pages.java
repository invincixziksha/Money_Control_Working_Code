package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Emi_Calculator_L1_Pages extends StartupPage{

	By personalFinancepage=By.xpath("(//a[@title='Personal Finance'])[2]");
	By toolsButton=By.xpath("(//a[@title='Tools'])[2]");
	By homeLoanEmiCalculator=By.xpath("(//span[.='Calculator '])[2]");
	By loanAmountTextField=By.xpath("//input[@id='carhome_loan']");
	By loanPeriodTextField=By.xpath("//input[@id='loan_period']");
    By interestRateTextField=By.id("interest_rate");
    By upfrontChargesTextField=By.id("upfront_charges");
    By submitButton=By.xpath("//a[.='Submit']");
    By totalPaymentReadOnlyField=By.id("total_payment");
    By emiReadOnlyField=By.id("emi");
    By emiPaymentInTheYear=By.xpath("//div[@class='table_container table-responsive']//tr[7]//td[3]");
    By interestPaymentInTheYear=By.xpath("//div[@class='table_container table-responsive']//tr[7]//td[4]");
    By principlePaymentInTheYear=By.xpath("//div[@class='table_container table-responsive']//tr[7]//td[5]");
    By OutstandingPrincipalAtEndOfYear=By.xpath("//div[@class='table_container table-responsive']//tr[5]//td[2]");


	String pageName = this.getClass().getSimpleName();

	public Emi_Calculator_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}
	
	/**@Test1
	 * about this method mouseHoverOnPersonalFinanceAndClickOnTools() 
	 * @param : null
	 * @description : mouse Hover On Personal Finance And Click On Tools
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean mouseHoverOnPersonalFinanceAndClickOnTools() throws Exception {
		Boolean toolsButtonIsDisplayed=false;
		try {
			commonEvents.mouseHoverOperation(personalFinancepage, "elementName", "pageName");
			commonEvents.click(toolsButton);
			toolsButtonIsDisplayed=true;
		}catch(Exception e) {
			throw e;
		}	
		return toolsButtonIsDisplayed;
	}
	
	/**@Test2
	 * about this method clickonHomeLoanEMICalculator() 
	 * @param : null
	 * @description : click on home loan EMI calculator
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickonHomeLoanEMICalculator() throws Exception {
		Boolean homeLoanEmiCalculatorIsDisplayed=false;
		try {
			commonEvents.click(homeLoanEmiCalculator);
			homeLoanEmiCalculatorIsDisplayed=true;
		}catch(Exception e) {
			throw e;
		}	
		return homeLoanEmiCalculatorIsDisplayed;
	}
	
	/**@Test3
	 * about this method entertheLoadAmountAs3000000() 
	 * @param : Map<String, String>
	 * @description : clear the data in the loan Amount TextField and put the data in loanAmountTextField
	 * @return : boolean
	 * @author : Yaksha
	 */
	public String entertheLoadAmountAs3000000(Map<String, String> expectedData) throws Exception {
		String loanAmountTextFieldValue="";
		try {
			commonEvents.clear(loanAmountTextField);
			commonEvents.sendKeys(loanAmountTextField,expectedData.get("LoanAmount"));
			loanAmountTextFieldValue=commonEvents.getAttribute(loanAmountTextField, "value");
					
		}catch(Exception e) {
			throw e;
		}	
		return loanAmountTextFieldValue;
	}
	
	/**@Test4
	 * about this method enterTheLoadPeriodAs20() 
	 * @param : Map<String, String>
	 * @description : clear the data in the Load Period TextField enter The Load Period As 20
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterTheLoanPeriodAs20(Map<String, String> expectedData) throws Exception {
		String loanPeriodTextFieldValue="";
		try {
			commonEvents.clear(loanPeriodTextField);
			commonEvents.sendKeys(loanPeriodTextField,expectedData.get("LoanPeriod"));
			loanPeriodTextFieldValue=commonEvents.getAttribute(loanPeriodTextField, "value");
				
		}catch(Exception e) {
			throw e;
		}	
		return loanPeriodTextFieldValue;
	}
	
	/**@Test5
	 * about this method enterInterestRateAs10_5() 
	 * @param : Map<String, String>
	 * @description : clear the data in the interestRateTextField enter The Interest Rate As 10.5
	 * @return : boolean
	 * @author : Yaksha
	 */
	public String enterInterestRateAs10_5(Map<String, String> expectedData) throws Exception {
		String interestRateTextFieldValue="";
		try {
			commonEvents.clear(interestRateTextField);
			commonEvents.sendKeys(interestRateTextField,expectedData.get("interestRate"));
			interestRateTextFieldValue=commonEvents.getAttribute(interestRateTextField, "value");		
		}catch(Exception e) {
			throw e;
		}	
		return interestRateTextFieldValue;
	}
	
	/**@Test6
	 * about this method enterUpfrontChargesAs10000() 
	 * @param : null
	 * @description : clear the data in the upfront Charges TextField and enter Up front Charges As 10000
	 * @return : boolean
	 * @author : Yaksha
	 */
	public String enterUpfrontChargesAs10000(Map<String, String> expectedData) throws Exception {
		String upfrontChargesTextFieldIsFilled="";
		try {
			commonEvents.clear(upfrontChargesTextField);
			commonEvents.sendKeys(upfrontChargesTextField,expectedData.get("upfrontCharges"));
			upfrontChargesTextFieldIsFilled=commonEvents.getAttribute(upfrontChargesTextField, "value");
					
		}catch(Exception e) {
			throw e;
		}	
		return upfrontChargesTextFieldIsFilled;
	}
	
	/**@Test7
	 * about this method clickOnSubmitButton() 
	 * @param : null
	 * @description : click On Submit Button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnSubmitButton() throws Exception {
		Boolean submitButtonIsDisplayed=false;
		try {
			commonEvents.click(submitButton);		
			submitButtonIsDisplayed=true;
		}catch(Exception e) {
			throw e;
		}	
		return submitButtonIsDisplayed;
	}
	
	/**@Test8
	 * about this method printTotalPaymentandEMIInConsole() 
	 * @param : null
	 * @description : print Total Payment and EMI In Console
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean printTotalPaymentandEMIInConsole() throws Exception {
		Boolean emiReadOnlyFieldIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(totalPaymentReadOnlyField))
			{
			String totalPayment=commonEvents.getText(totalPaymentReadOnlyField);
			System.out.println("Total payemnt is :"+totalPayment);
			String Emi=commonEvents.getText(emiReadOnlyField);	
			System.out.println("Total Emi is :"+Emi);
			emiReadOnlyFieldIsDisplayed=true;
			}

		}catch(Exception e) {
			throw e;
		}	
		return emiReadOnlyFieldIsDisplayed;
	}
	
	/**@Test9
	 * about this method printEmiPaymentInterestPaymentPrincipalPaymentOf7thYear() 
	 * @param : null
	 * @description : print Emi Payment Interest Payment Principal Payment Of 7thYear
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean printEmiPaymentInterestPaymentPrincipalPaymentOf7thYear() throws Exception {
		Boolean principlePaymentInTheYearIsDisplayed=false;
		try {
			String emiPaymentinTheYear=commonEvents.getText(emiPaymentInTheYear);
			System.out.println("Emi payment of the 7th year is :"+emiPaymentinTheYear);
			
			String interestPaymentinTheYear=commonEvents.getText(interestPaymentInTheYear);
			System.out.println("Interest payment of the 7th year is :"+interestPaymentinTheYear);
			
			String principlePaymentinTheYear=commonEvents.getText(principlePaymentInTheYear);
			System.out.println("principle payment of the 7th year is :"+principlePaymentinTheYear);

			principlePaymentInTheYearIsDisplayed=true;

		}catch(Exception e) {
			throw e;
		}	
		return principlePaymentInTheYearIsDisplayed;
	}
	
	/**@Test10
	 * about this method printOutstandingPrincipalAtEndOfYearValueFor5thYearIntheTable() 
	 * @param : null
	 * @description : print Outstanding Principal At End Of Year Value For 5th Year In the Table
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean printOutstandingPrincipalAtEndOfYearValueFor5thYearIntheTable() throws Exception {
		Boolean OutstandingPrincipalAtEndOfYearIsDisplayed=false;
		try {
			String OutstandingPrincipalAtEndOfyear=commonEvents.getText(OutstandingPrincipalAtEndOfYear);
			System.out.println("Outstanding Principal At End Of 5th year is :"+OutstandingPrincipalAtEndOfyear);
			
			OutstandingPrincipalAtEndOfYearIsDisplayed=true;

		}catch(Exception e) {
			throw e;
		}	
		return OutstandingPrincipalAtEndOfYearIsDisplayed;
	}
}
