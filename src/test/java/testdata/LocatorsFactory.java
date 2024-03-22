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
	
	
}
