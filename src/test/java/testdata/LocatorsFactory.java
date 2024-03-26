package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.StartupPage;

public class LocatorsFactory extends StartupPage {
	//please write all the locators for Money Control page only 

	By fixedDepositCalculatorHeader = By.xpath("//h2[contains(text(), 'Fixed Deposit Calculator')]");
	By investmentAmountTextfield = By.xpath("//input[@class='valueinput']");
	By investmentPeriodTextfield = By.xpath("//input[@id='edulonvalue_2']");
	By rateOfReturnTextfield = By.xpath("//input[@id='edulonvalue_3']");
	By interestFrequencyYearlyButton = By.xpath("(//span[contains(text(), 'Yearly')])[2]");
	By taxRateTextfield = By.xpath("//input[@id='edulonvalue_4']");
	By submitButton = By.xpath("//a[contains(text(), 'Submit')]");
	By resetButton = By.xpath("//a[@id='reset_btn']");
	By totalInterestResultButton = By.xpath("//div[contains(text(), 'Total Interest')]");
	By totalPaymentResultButton = By.xpath("//div[contains(text(), 'Total Payment')]");
	By totalCorpusResultButton = By.xpath("//div[contains(text(), 'Total Corpus')]");
	By totalTaxAmountResultButton = By.xpath("//div[contains(text(), 'Post Tax Amount')]");
	
	By providentFundCalculatorHeader = By.xpath("//strong[contains(text(), 'PF - Provident Fund Calculator')]"); 
	
	
	By commodities = By.xpath("(//a[@title='Commodities'])[1]"); 
	By medicalDentalCostsTextField=By.xpath("//input[@name='medical_dental_costs']");
	By vehicleRepaircostTextField=By.xpath("//input[@name='vehicle_repairs']");
	By lifeInsurancePremiumTextField=By.xpath("//input[@name='life_insurance_premium']");
	By homeLoanAndOtherImportantEMIsTextField=By.xpath("//input[@name='home_auto_insurance_premium']");
	By monthlyLivingExpensesTextField=By.xpath("//input[@name='monthly_living_expenses']");
	By monthUnemployedTextField=By.xpath("//input[@name='month_unemployed']");
	By toolsTitle=By.xpath("//h2[.='Tools']");
	By loanAmountTextField=By.xpath("//input[@id='carhome_loan']");
	By loanPeriodTextField=By.xpath("//input[@id='loan_period']");
    By interestRateTextField=By.id("interest_rate"); 
//    By resetButton=By.xpath("//a[.='Reset']");
    By emiReadOnlyField=By.id("emi");
    By OutstandingPrincipalAtEndOfYear=By.xpath("//div[@class='table_container table-responsive']//tr[5]//td[2]");
    By emiPaymentInTheYear=By.xpath("//div[@class='table_container table-responsive']//tr[7]//td[3]");
    By loginButton=By.xpath("//a[@title='Log In']");
    By loginWithOtpButton=By.xpath("(//li[.='Login with OTP'])[2]");
    By emailIdField=By.xpath("(//input[@name='email'])[2]");
    By logInButton=By.xpath("(//button[@type=\"submit\"])[2]");
    By errorMessage=By.xpath("//div[.='Invalid User Id/EmailID or Password. Please try again.']");
    By forgotPassword=By.xpath("//a[.='Forgot Password']");
    By logInButtonAtRightTopCorner=By.xpath("//span[.='Hi  Abhisek  ...']");
    
    By uninsuredOrUnexpectedEmergenciesField=By.xpath("//div[@id='uninsured']");
	By annualAmountOfFixedPaymentsField=By.xpath("//div[@id='insurance']");
	By buildReserveToPayForJobLossField=By.id("unemploy");
	By resultField=By.xpath("//span[.='Rs 13,50,000']");
	

	public LocatorsFactory(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}





	//Expected data will be fetch from config.json file,path of the json file is:FaceBook_Automation_Dummy/src/main/resources/config.json
	
	public WebElement fixedDepositCalculatorHeader(WebDriver driver) {
		WebElement fixedDepositCalculatorHeaderWebElement = driver.findElement(fixedDepositCalculatorHeader);
		return fixedDepositCalculatorHeaderWebElement; 
	}
	
	public WebElement investmentAmountTextfield(WebDriver driver) {
		WebElement investmentAmountTextfieldWebElement = driver.findElement(investmentAmountTextfield);
		return investmentAmountTextfieldWebElement; 
	}
	
	public WebElement investmentPeriodTextfield(WebDriver driver) {
		WebElement investmentPeriodTextfieldWebElement = driver.findElement(investmentPeriodTextfield);
		return investmentPeriodTextfieldWebElement; 
	}
	
	public WebElement rateOfReturnTextfield(WebDriver driver) {
		WebElement rateOfReturnTextfieldWebElement = driver.findElement(rateOfReturnTextfield);
		return rateOfReturnTextfieldWebElement; 
	}
	
	public WebElement interestFrequencyYearlyButton(WebDriver driver) {
		WebElement interestFrequencyYearlyButtonWebElement = driver.findElement(interestFrequencyYearlyButton);
		return interestFrequencyYearlyButtonWebElement; 
	}
	
	public WebElement taxRateTextfield(WebDriver driver) {
		WebElement taxRateTextfieldWebElement = driver.findElement(taxRateTextfield);
		return taxRateTextfieldWebElement; 
	}
	
	public WebElement submitButton(WebDriver driver) {
		WebElement submitButtonWebElement = driver.findElement(submitButton);
		return submitButtonWebElement; 
	}
	
	public WebElement resetButton(WebDriver driver) {
		WebElement resetButtonWebElement = driver.findElement(resetButton);
		return resetButtonWebElement; 
	}
	
	public WebElement totalInterestResultButton(WebDriver driver) {
		WebElement totalInterestResultButtonWebElement = driver.findElement(totalInterestResultButton);
		return totalInterestResultButtonWebElement; 
	}
	
	public WebElement totalPaymentResultButton(WebDriver driver) {
		WebElement totalPaymentResultButtonWebElement = driver.findElement(totalPaymentResultButton);
		return totalPaymentResultButtonWebElement; 
	}
	
	public WebElement totalCorpusResultButton(WebDriver driver) {
		WebElement totalCorpusResultButtonWebElement = driver.findElement(totalCorpusResultButton);
		return totalCorpusResultButtonWebElement;
	}
	
	public WebElement totalTaxAmountResultButton(WebDriver driver) {
		WebElement totalTaxAmountResultButtonWebElement = driver.findElement(totalTaxAmountResultButton);
		return totalTaxAmountResultButtonWebElement;
	}
	
	public WebElement providentFundCalculatorHeader(WebDriver driver) {
		WebElement providentFundCalculatorHeaderWebElement = driver.findElement(providentFundCalculatorHeader);
		return providentFundCalculatorHeaderWebElement; 
	}
	
	public WebElement commoditiesIsPresent(WebDriver driver) {
		WebElement commoditiesWebElement = driver.findElement(commodities);
		return commoditiesWebElement; 
	}
	
	public WebElement medicalDentalCostsTextFieldIsPresent(WebDriver driver) {
		WebElement medicalDentalCostsTextFieldWebElement = driver.findElement(medicalDentalCostsTextField);
		return medicalDentalCostsTextFieldWebElement; 
	}
	
	public WebElement vehicleRepaircostTextFieldIsPresent(WebDriver driver) {
		WebElement vehicleRepaircostTextFieldWebElement = driver.findElement(vehicleRepaircostTextField);
		return vehicleRepaircostTextFieldWebElement; 
	}
	public WebElement lifeInsurancePremiumTextFieldIsPresent(WebDriver driver) {
		WebElement lifeInsurancePremiumTextFieldWebElement = driver.findElement(lifeInsurancePremiumTextField);
		return lifeInsurancePremiumTextFieldWebElement; 
	}
	public WebElement homeLoanAndOtherImportantEMIsTextFieldIsPresent(WebDriver driver) {
		WebElement homeLoanAndOtherImportantEMIsTextFieldWebElement = driver.findElement(homeLoanAndOtherImportantEMIsTextField);
		return homeLoanAndOtherImportantEMIsTextFieldWebElement; 
	}
	public WebElement monthlyLivingExpensesTextFieldIsPresent(WebDriver driver) {
		WebElement monthlyLivingExpensesTextFieldWebElement = driver.findElement(monthlyLivingExpensesTextField);
		return monthlyLivingExpensesTextFieldWebElement; 
	}
	public WebElement monthUnemployedTextFieldIsPresent(WebDriver driver) {
		WebElement monthUnemployedTextFielddWebElement = driver.findElement(monthUnemployedTextField);
		return monthUnemployedTextFielddWebElement; 
	}
	public WebElement toolsTitleIsPresent(WebDriver driver) {
		WebElement toolsTitleWebElement = driver.findElement(toolsTitle);
		return toolsTitleWebElement; 
	}
	public WebElement loanAmountTextFieldIsPresent(WebDriver driver) {
		WebElement loanAmountTextFieldWebelement = driver.findElement(loanAmountTextField);
		return loanAmountTextFieldWebelement; 
	}
	public WebElement loanPeriodTextFieldIsPresent(WebDriver driver) {
		WebElement loanPeriodTextFieldWebElement = driver.findElement(loanPeriodTextField);
		return loanPeriodTextFieldWebElement; 
	}
	public WebElement interestRateTextFieldIsPresent(WebDriver driver) {
		WebElement interestRateTextFieldWebElement = driver.findElement(interestRateTextField);
		return interestRateTextFieldWebElement; 
	}
	public WebElement resetButtonIsPresent(WebDriver driver) {
		WebElement resetButtonWebElement = driver.findElement(resetButton);
		return resetButtonWebElement; 
	}
	
	public WebElement emiReadOnlyFieldIsPresent(WebDriver driver) {
		WebElement emiReadOnlyFieldWebElement = driver.findElement(emiReadOnlyField);
		return emiReadOnlyFieldWebElement; 
	}
	public WebElement OutstandingPrincipalAtEndOfYearIsPresent(WebDriver driver) {
		WebElement OutstandingPrincipalAtEndOfYearWebElement = driver.findElement(OutstandingPrincipalAtEndOfYear);
		return OutstandingPrincipalAtEndOfYearWebElement; 
	}
	public WebElement emiPaymentInTheYearIsPresent(WebDriver driver) {
		WebElement emiPaymentInTheYearWebElement = driver.findElement(emiPaymentInTheYear);
		return emiPaymentInTheYearWebElement; 
	}
	public WebElement loginButtonIsPresent(WebDriver driver) {
		WebElement loginButtonWebElement = driver.findElement(loginButton);
		return loginButtonWebElement; 
	}
	public WebElement loginWithOtpButtonIsPresent(WebDriver driver) {
		WebElement loginWithOtpButtonWebElement = driver.findElement(loginWithOtpButton);
		return loginWithOtpButtonWebElement; 
	}
	public WebElement emailIdFieldIsPresent(WebDriver driver) {
		WebElement emailIdFieldWebElement = driver.findElement(emailIdField);
		return emailIdFieldWebElement; 
	}
	public WebElement logInButtonIsPresent(WebDriver driver) {
		WebElement logInButtonWebElement = driver.findElement(logInButton);
		return logInButtonWebElement; 
	}
	
	public WebElement errorMessageIsPresent(WebDriver driver) {
		WebElement errorMessageWebElement = driver.findElement(errorMessage);
		return errorMessageWebElement; 
	}
	
	public WebElement forgotPasswordIsPresent(WebDriver driver) {
		WebElement forgotPasswordWebElement = driver.findElement(forgotPassword);
		return forgotPasswordWebElement; 
	}
	
	public WebElement logInButtonAtRightTopCornerIsPresent(WebDriver driver) {
		WebElement logInButtonAtRightTopCornerWebElement = driver.findElement(logInButtonAtRightTopCorner);
		return logInButtonAtRightTopCornerWebElement; 
	}
	
	public WebElement uninsuredOrUnexpectedEmergenciesFieldIsPresent(WebDriver driver) {
		WebElement uninsuredOrUnexpectedEmergenciesFieldWebElement = driver.findElement(uninsuredOrUnexpectedEmergenciesField);
		return uninsuredOrUnexpectedEmergenciesFieldWebElement; 
	}
	
	public WebElement annualAmountOfFixedPaymentsFieldIsPresent(WebDriver driver) {
		WebElement annualAmountOfFixedPaymentsFieldWebElement = driver.findElement(annualAmountOfFixedPaymentsField);
		return annualAmountOfFixedPaymentsFieldWebElement; 
	}
	
	public WebElement buildReserveToPayForJobLossFieldIsPresent(WebDriver driver) {
		WebElement buildReserveToPayForJobLossFieldWebElement = driver.findElement(buildReserveToPayForJobLossField);
		return buildReserveToPayForJobLossFieldWebElement; 
	}
	
	public WebElement resultFieldIsPresent(WebDriver driver) {
		WebElement resultFieldWebElement = driver.findElement(resultField);
		return resultFieldWebElement; 
	}
}
