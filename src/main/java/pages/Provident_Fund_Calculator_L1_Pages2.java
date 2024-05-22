package pages;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Provident_Fund_Calculator_L1_Pages2 extends StartupPage 
{
	public SoftAssert softAssert;
	/*
	 * WebElemet Declaration
	 */	
	By personalFinanceNavigationMenu = By.xpath("//nav[@class='navbg']//li[@cid='8']//a[contains(text(), 'Personal Finance')]");
	By providentFundCalculatorLink = By.xpath("//a[contains(text(), 'Provident Fund Calculator')]");
	By basicMonthlySalaryTextfield = By.xpath("//input[@name='basic_salary_monthly']");
	By contributionToEPFTextfield = By.xpath("//input[@name='your_contribution']");
	By employersContributionToEPFTextfield = By.xpath("//input[@name='employers_contribuion']");
	By avgIncreaseInSalaryYouExpectTextfield = By.xpath("//input[@name='annual_increase_in_salary']");
	By ageWhenYouIntendToRetireTextfield = By.xpath("//input[@name='intend_to_retire']");
	By currentEpfBalanceIfAnyTextfield = By.xpath("//input[@name='current_epf_balance']");
	By currentInterestRateTextfield = By.xpath("//input[@name='current_interest_rate']");
	By calculateButton = By.xpath("//img[contains(@src, 'calculate')]");
	By totalAmountByTheTimeYouRetireElement = By.xpath("//div[@id='result_epf']//span[@style='color:#ff6600;']");

	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();


	/*
	 * constructor Initialization
	 */	
	public Provident_Fund_Calculator_L1_Pages2(WebDriver driver) 
	{
		super(driver);
	}	


	/**@Test0
	 * about this method validateTitleOfCurrentPage() 
	 * @param : null
	 * @description : get the title of the current page and validate
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
	 * about this method navigateToProvidentFundCalculatorPage() 
	 * @param : null
	 * @description : mousehover to Personal Finance Navigation bar and will click on Provident Fund calculator link
	 * @return : return the title of that page as String type
	 * @author : Yaksha
	 */
	public String navigateToProvidentFundCalculatorPage() throws Exception {
		String titleOfProvidentFundCalculatorPage = "";
		try {
			if(commonEvents.isDisplayed(personalFinanceNavigationMenu)) {
			commonEvents.mouseHoverOperation(personalFinanceNavigationMenu, "elementName", "pageName");
			commonEvents.click(providentFundCalculatorLink);
			}
			titleOfProvidentFundCalculatorPage = commonEvents.getTitle();
			System.out.println(" title of the Provident Fund Calculator Page : " + titleOfProvidentFundCalculatorPage);
		}catch(Exception e) {
			throw e;
		}	
		return titleOfProvidentFundCalculatorPage;
	}
	
	/**@Test2
	 * about this method enterBasicMonthlySalaryInProvidentFundCalculatorForm() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in basic monthly salary text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the basic monthly salary text field as string type
	 * @author : Yaksha
	 */
	public String enterBasicMonthlySalaryInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		String basicMonthlySalaryTextfieldValue = "";
		try {
			if(commonEvents.isDisplayed(basicMonthlySalaryTextfield))
			{
			commonEvents.sendKeys(basicMonthlySalaryTextfield,expectedData.get("yourBasicSalaryMonthly"));
			basicMonthlySalaryTextfieldValue = commonEvents.getAttribute(basicMonthlySalaryTextfield, "value");
			System.out.println("basic monthly salary : " + basicMonthlySalaryTextfieldValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return basicMonthlySalaryTextfieldValue;
	}
	
	/**@Test3
	 * about this method enterValueInYourContributionToEPFInProvidentFundCalculatorForm() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Contribution To EPF text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Contribution To EPF text field as string type
	 * @author : Yaksha
	 */
	public String enterValueInYourContributionToEPFInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		String contributionToEPFValue = "";
		try {
			if(commonEvents.isDisplayed(contributionToEPFTextfield))
			{
			commonEvents.sendKeys(contributionToEPFTextfield,expectedData.get("contributioToEPF"));
			contributionToEPFValue = commonEvents.getAttribute(contributionToEPFTextfield, "value");
			System.out.println("contribution to EPF : " + contributionToEPFValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return contributionToEPFValue;
	}
	
	/**@Test4
	 * about this method enterYourEmployersContributionToEPFInProvidentFundCalculatorForm() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Employers Contribution To EPF text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Employers Contribution To EPF text field as string type
	 * @author : Yaksha
	 */
	public String enterYourEmployersContributionToEPFInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		String employersContributionToEPFValue = "";
		try {
			if(commonEvents.isDisplayed(employersContributionToEPFTextfield))
			{
			commonEvents.sendKeys(employersContributionToEPFTextfield,expectedData.get("employersContributionToEPF"));
			employersContributionToEPFValue = commonEvents.getAttribute(employersContributionToEPFTextfield, "value");
			System.out.println(" Employers contribution to EPF : " + employersContributionToEPFValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return employersContributionToEPFValue;
	}
	
	/**@Test5
	 * about this method enterAvgIncreaseInSalaryYouExpectInProvidentFundCalculatorForm() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Avg Increase In Salary You Expect text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Avg Increase In Salary You Expect text field as string type
	 * @author : Yaksha
	 */
	public String enterAvgIncreaseInSalaryYouExpectInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		String avgIncreaseInSalaryYouExpectValue = "";
		try {
			if(commonEvents.isDisplayed(avgIncreaseInSalaryYouExpectTextfield))
			{
			commonEvents.sendKeys(avgIncreaseInSalaryYouExpectTextfield,expectedData.get("avgIncreaseInSalaryYouExpect"));
			avgIncreaseInSalaryYouExpectValue = commonEvents.getAttribute(avgIncreaseInSalaryYouExpectTextfield, "value");
			System.out.println("Average Increase in salary you expect : " + avgIncreaseInSalaryYouExpectValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return avgIncreaseInSalaryYouExpectValue;
	}
	
	/**@Test6
	 * about this method enterAgeWhenYouIntendToRetireInProvidentFundCalculatorForm() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Age When You Intend To Retire text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Age When You Intend To Retire text field as string type
	 * @author : Yaksha
	 */
	public String enterAgeWhenYouIntendToRetireInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		String ageWhenYouIntendToRetireValue = "";
		try {
			if(commonEvents.isDisplayed(ageWhenYouIntendToRetireTextfield))
			{
			commonEvents.sendKeys(ageWhenYouIntendToRetireTextfield,expectedData.get("ageWhenYouIntendToRetire"));
			ageWhenYouIntendToRetireValue = commonEvents.getAttribute(ageWhenYouIntendToRetireTextfield, "value");
			System.out.println("age When You Intend To Retire Value : " + ageWhenYouIntendToRetireValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return ageWhenYouIntendToRetireValue;
	}
	
	/**@Test7
	 * about this method enterCurrentEpfBalanceIfAnyInProvidentFundCalculatorForm() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Current Epf Balance If Any text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Current Epf Balance If Any text field as string type
	 * @author : Yaksha
	 */
	public String enterCurrentEpfBalanceIfAnyInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		String currentEpfBalanceIfAnyValue = "";
		try {
			if(commonEvents.isDisplayed(currentEpfBalanceIfAnyTextfield))
			{
			commonEvents.sendKeys(currentEpfBalanceIfAnyTextfield,expectedData.get("currentEpfBalanceIfAny"));
			currentEpfBalanceIfAnyValue = commonEvents.getAttribute(currentEpfBalanceIfAnyTextfield, "value");
			System.out.println("current Epf Balance If Any Value : " + currentEpfBalanceIfAnyValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return currentEpfBalanceIfAnyValue;
	}
	
	/**@Test8
	 * about this method enterCurrentInterestRateInProvidentFundCalculatorForm() 
	 * @param :  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Current Interest Rate text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Current Interest Rate text field as string type
	 * @author : Yaksha
	 */
	public String enterCurrentInterestRateInProvidentFundCalculatorForm(Map<String, String> expectedData) throws Exception {
		String currentInterestRateValue = "";
		try {
			if(commonEvents.isDisplayed(currentInterestRateTextfield))
			{
			commonEvents.sendKeys(currentInterestRateTextfield,expectedData.get("currentInterestRate"));
			currentInterestRateValue = commonEvents.getAttribute(currentInterestRateTextfield, "value");
			System.out.println("current Interest Rate Value : " + currentInterestRateValue);
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			throw e;
		}
		return currentInterestRateValue;
	}
	
	/**@test9
	 * about this method clickOnCalculateButtonInProvidentFundCalculatorForm() 
	 * @param : null
	 * @description : it will click on the calculate button if calculate button is displayed in the page 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean clickOnCalculateButtonInProvidentFundCalculatorForm() throws Exception {
		Boolean  calculateButtonIsDisplayed = false;
		
		try {
			if(commonEvents.isDisplayed(calculateButton)) {
				commonEvents.click(calculateButton);
				
				calculateButtonIsDisplayed = true;
			}	
		}catch(Exception e) {
			throw e;	
		}
		return calculateButtonIsDisplayed;
	}
	
	/**@test10
	 * about this method fetchTotalAmountByTheTimeYouRetire() 
	 * @param : null
	 * @description : fetch the total Amount By The Time You Retire 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalAmountByTheTimeYouRetire() throws Exception {
		Boolean  totalAmountByTheTimeYouRetireValueIsDisplayed = false;
		
		try {
			if(commonEvents.isDisplayed(totalAmountByTheTimeYouRetireElement)) {
				String totalAmountByTheTimeYouRetireValueAttributeValue = commonEvents.getAttribute(totalAmountByTheTimeYouRetireElement, "value");
				System.out.println("total Amount By The Time You Retire attribute value : " + totalAmountByTheTimeYouRetireValueAttributeValue);
				
				String totalAmountByTheTimeYouRetireValue = commonEvents.getText(totalAmountByTheTimeYouRetireElement);
				System.out.println("total Amount By The Time You Retire : " + totalAmountByTheTimeYouRetireValue);
				
				totalAmountByTheTimeYouRetireValueIsDisplayed = true;
			}	
		}catch(Exception e) {
			throw e;	
		}
		return totalAmountByTheTimeYouRetireValueIsDisplayed;
	}
}