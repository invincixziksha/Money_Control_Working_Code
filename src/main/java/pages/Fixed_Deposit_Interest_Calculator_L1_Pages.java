package pages;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Fixed_Deposit_Interest_Calculator_L1_Pages extends StartupPage 
{
	public SoftAssert softAssert;
	/*
	 * WebElemet Declaration
	 */	
	By personalFinanceNavigationMenu = By.xpath("//nav[@class='navbg']//li[@cid='8']//a[contains(text(), 'Personal Finance')]");
	By fixedDepositInterestCalculatorLink = By.xpath("//a[contains(text(), 'Fixed Deposit Interest Calculator')]"); 
	By investmentAmountTextfield = By.xpath("//input[@class='valueinput']");
	By investmentPeriodTextfield = By.xpath("//input[@id='edulonvalue_2']");
	By rateOfReturnTextfield = By.xpath("//input[@id='edulonvalue_3']");
	By interestFrequencyYearlyButton = By.xpath("(//span[contains(text(), 'Yearly')])[2]");
	By taxRateTextfield = By.xpath("//input[@id='edulonvalue_4']");
	By totalInterestContentBox = By.xpath("(//div[@class='contentBox'])[1]");
	By totalInterestResultButton = By.xpath("//div[contains(text(), 'Total Interest')]");
	By totalInterestValue = By.xpath("//span[@class='ti']");
	By totalPaymentResultButton = By.xpath("//div[contains(text(), 'Total Payment')]");
	By totalPaymentValue = By.xpath("//span[@class='tp']");
	By totalCorpusResultButton = By.xpath("//div[contains(text(), 'Total Corpus')]");
	By totalCorpusValue = By.xpath("//span[@class='tc']");
	By totalTaxAmountResultButton = By.xpath("//div[contains(text(), 'Post Tax Amount')]");
	By totalTaxAmountValue = By.xpath("//span[@class='pta']");
	By totalInterestRupeesValueTextLink = By.xpath("//span[@class='ti']");
	By submitButton = By.xpath("//a[contains(text(), 'Submit')]");


	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();


	/*
	 * constructor Initialization
	 */	
	public Fixed_Deposit_Interest_Calculator_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}	


	/**@Test0
	 * about this method validateTitleOfCurrentPage() 
	 * @param : null
	 * @description : get the title of the home page and validate
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTitleOfCurrentPage() throws Exception {
		String TitleOfCurrentPage = "";
		try {
			TitleOfCurrentPage = commonEvents.getTitle();
			System.out.println("Title of the HomePage : "+TitleOfCurrentPage);
		}catch(Exception e) {
			throw e;
		}	
		return TitleOfCurrentPage;
	}
	
	/**@Test1
	 * about this method navigateToFixedDepositInterestCalculatorPage() 
	 * @param : null
	 * @description : mousehover to Personal Finance Navigation bar and will click on fixed deposit interest calculator
	 * @return : return the title of fixed deposit interest calculator
	 * @author : Yaksha
	 */
	public String navigateToFixedDepositInterestCalculatorPage() throws Exception {
		String titleOfFixedDepositInterestCalculatorPage = "";
		try {
			if(commonEvents.isDisplayed(personalFinanceNavigationMenu)) {
			commonEvents.mouseHoverOperation(personalFinanceNavigationMenu, "elementName", "pageName");
			commonEvents.click(fixedDepositInterestCalculatorLink);
			}
			titleOfFixedDepositInterestCalculatorPage = commonEvents.getTitle();
			System.out.println(" title of the Fixed deposit Interest Calculator Page : " + titleOfFixedDepositInterestCalculatorPage);
		}catch(Exception e) {
			throw e;
		}	
		return titleOfFixedDepositInterestCalculatorPage;
	}
	
	/**@Test2
	 * about this method enterInvestmentAmountInFixedDepositInterestCalculatorForm() 
	 * @param : Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Investment Amount text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Investment Amount text field as string type
	 * @author : Yaksha
	 */
	public String enterInvestmentAmountInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		String investmentAmountTextfieldValue = "";
		try {
			if(commonEvents.isDisplayed(investmentAmountTextfield))
			{
			commonEvents.clear(investmentAmountTextfield);
			commonEvents.sendKeys(investmentAmountTextfield,expectedData.get("InvestmentAmountValue"));
			investmentAmountTextfieldValue = commonEvents.getAttribute(investmentAmountTextfield, "value");
			System.out.println("investment value in pages class : " + investmentAmountTextfieldValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return investmentAmountTextfieldValue;
	}
	
	/**@Test3
	 * about this method enterInvestmentPeriodInFixedDepositInterestCalculatorForm() 
	 * @param : Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Investment Period text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Investment Period text field as string type
	 * @author : Yaksha
	 */
	public String enterInvestmentPeriodInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		String investmentPeriodTextfieldValue = "";
		try {
			if(commonEvents.isDisplayed(investmentPeriodTextfield))
			{
			commonEvents.clear(investmentPeriodTextfield);
			commonEvents.sendKeys(investmentPeriodTextfield,expectedData.get("InvestmentPeriodValue"));
			investmentPeriodTextfieldValue = commonEvents.getAttribute(investmentPeriodTextfield, "value");
			System.out.println("investment period value : " + investmentPeriodTextfieldValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return investmentPeriodTextfieldValue;
	}
	
	/**@Test4
	 * about this method enterRateOfReturnInFixedDepositInterestCalculatorForm() 
	 * @param : Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Rate Of Return text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Investment Period text field as string type
	 * @author : Yaksha
	 */
	public String enterRateOfReturnInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		String rateOfReturnTextfieldValue = "";
		try {
			if(commonEvents.isDisplayed(rateOfReturnTextfield))
			{
			commonEvents.clear(rateOfReturnTextfield);
			commonEvents.sendKeys(rateOfReturnTextfield,expectedData.get("RateOfReturnValue"));
			rateOfReturnTextfieldValue = commonEvents.getAttribute(rateOfReturnTextfield, "value");
			System.out.println("rate of return value : " + rateOfReturnTextfieldValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return rateOfReturnTextfieldValue;
	}
	
	/**@test5
	 * about this method selectInterestFrequencyButtonInFixedDepositInterestCalculatorForm() 
	 * @param : null
	 * @description : click on Interest Frequency Button, if Interest Frequency Button is present in that page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean selectInterestFrequencyButtonInFixedDepositInterestCalculatorForm() throws Exception {
		Boolean interestFrequencyYearlyButtonIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(interestFrequencyYearlyButton)) {
				commonEvents.click(interestFrequencyYearlyButton);
				interestFrequencyYearlyButtonIsDisplayed= true;
			}	
		}catch(Exception e) {
			throw e;	
		}
		return interestFrequencyYearlyButtonIsDisplayed;
	}
	
	/**@Test6
	 * about this method enterTaxRateInFixedDepositInterestCalculatorForm() 
	 * @param :Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Tax Rate text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the Tax Rate  text field as string type
	 * @author : Yaksha
	 */
	public String enterTaxRateInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		String taxRateTextfieldValue = "";
		try {
			if(commonEvents.isDisplayed(taxRateTextfield))
			{
			commonEvents.clear(taxRateTextfield);
			commonEvents.sendKeys(taxRateTextfield,expectedData.get("TaxRateValue"));
			taxRateTextfieldValue = commonEvents.getAttribute(taxRateTextfield, "value");
			System.out.println("tax rate value : " + taxRateTextfieldValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return taxRateTextfieldValue;
	}
	
	/**@test7
	 * about this method fetchTotalInterest() 
	 * @param : null
	 * @description : get the total interest value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalInterest() throws Exception {
		Boolean  totalInterestButtonIsDisplayed = false;
		
		if(commonEvents.isDisplayed(submitButton)) {
			commonEvents.click(submitButton);
		}
		
		try {
			if(commonEvents.isDisplayed(totalInterestResultButton)) {
				commonEvents.jsScrollPageTillElementVisible(totalInterestResultButton, "element", "pageName");
				String totalInterestTextValue = commonEvents.getText(totalInterestValue);
				System.out.println("total Interest Value : " + totalInterestTextValue);
				
				totalInterestButtonIsDisplayed = true;
			}	
		}catch(Exception e) {
			throw e;	
		}
		return totalInterestButtonIsDisplayed;
	}
	
	/**@test8
	 * about this method fetchTotalPayment() 
	 * @param : null
	 * @description : get the total Payment value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalPayment() throws Exception {
		Boolean  totalPayemtButtonIsDisplayed = false;
		
		if(commonEvents.isDisplayed(submitButton)) {
			commonEvents.click(submitButton);
		}
		
		try {
			if(commonEvents.isDisplayed(totalPaymentResultButton)) {
				commonEvents.jsScrollPageTillElementVisible(totalPaymentResultButton, "element", "pageName");
				String totalPaymentResultValue = commonEvents.getText(totalPaymentValue);
				System.out.println("total payment value : " + totalPaymentResultValue);
				
				totalPayemtButtonIsDisplayed = true;
			}	
		}catch(Exception e) {
			throw e;	
		}
		return totalPayemtButtonIsDisplayed;
	}
	
	/**@test9
	 * about this method fetchTotalCorpus() 
	 * @param : null
	 * @description : get the total Corpus value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalCorpus() throws Exception {
		Boolean  totalCorpusResultButtonIsDisplayed = false;
		
		if(commonEvents.isDisplayed(submitButton)) {
			commonEvents.click(submitButton);
		}
		
		try {
			if(commonEvents.isDisplayed(totalCorpusResultButton)) {
				commonEvents.jsScrollPageTillElementVisible(totalCorpusResultButton, "element", "pageName");
				String totalCorpusResultValue = commonEvents.getText(totalCorpusValue);
				System.out.println("total corpus value : " + totalCorpusResultValue);
				
				totalCorpusResultButtonIsDisplayed = true;
			}	
		}catch(Exception e) {
			throw e;	
		}
		return totalCorpusResultButtonIsDisplayed;
	}
	
	/**@test10
	 * about this method fetchTaxAmount() 
	 * @param : null
	 * @description : get the total TaxAmount value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTaxAmount() throws Exception {
		Boolean  totalTaxAmountResultButtonIsDisplayed = false;
		
		if(commonEvents.isDisplayed(submitButton)) {
			commonEvents.click(submitButton);
		}
		
		try {
			if(commonEvents.isDisplayed(totalTaxAmountResultButton)) {
				commonEvents.jsScrollPageTillElementVisible(totalTaxAmountResultButton, "element", "pageName");
				String totalTaxAmountResultValue = commonEvents.getText(totalTaxAmountValue);
				System.out.println("total Tax Amount value : " + totalTaxAmountResultValue);
				
				totalTaxAmountResultButtonIsDisplayed = true;
			}	
		}catch(Exception e) {
			throw e;	
		}
		return totalTaxAmountResultButtonIsDisplayed;
	}
}