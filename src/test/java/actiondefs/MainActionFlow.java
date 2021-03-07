package actiondefs;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainActionFlow {

	public WebDriver driver;
	String title;
	String expectedWebsiteName = "VotersSurvey";
	String BaseUrl = "http://bit.ly/votersurveybooth";
	String groupedStringCountBefore;
	int groupedintCountBefore;

	String voterSurveyIDOnClick;
	String voterDataForValidation;

	List<String> getlistTextValueinGraphPage = new ArrayList<String>();
	List<String> getlistTextValueinMainLabel = new ArrayList<String>();

	List<WebElement> selectedSingleSizeList = new ArrayList<WebElement>();
	List<WebElement> selectedSizeList = new ArrayList<WebElement>();

	boolean isEqual;

	By MultipleSelectingVerifyElement = By
			.xpath("//div[@class='ls-wrap']//ul[@class='indicators']//..//ul[@class='selected']");
	By graphMultipleValueGetter = By.xpath("//div[@class=\"graph-wrap\"]//ul//li");
	By enterMobileNumber = By.xpath("//input[@id='phoneNumber']");
	By mobileNumberContinue = By.xpath("//button[@id='next']");
	By continue2ndPageAnd3rdPage = By.xpath("//button[@id='continue']");
	By cancel = By.xpath("//button[@id='cancel']");
	By enterverificationCode = By.xpath("//input[@id='verificationCode']");
	By syncButton = By.xpath("/html/body/app-root/app-layout/app-street-list/div/div[1]/p[1]/b");
	By selectFirstStreet = By.xpath("//body//app-root//li[1]");
	By selectFirstVoterInList = By.xpath("//app-voter[1]//div[1]//div[2]//label[1]//span[1]");

	By groupedcountforFirstStreet = By.xpath("//li[1]//div[2]//b[1]");

	By selectFirstVoterUsingVoterID = By.xpath("//app-voter[5]//div[1]//div[2]//p[1]");
	By groupingButton = By.xpath("//button[@class='group-btn']");
	By partyListSelectionDMK = By.xpath("//div[@class='party-list']//div[1]//label[1]//span[1]");
	By countinueInCardBody = By.xpath("//div[@class='card-body']//button[@class='group-btn']");
	By religionListSelectFirst = By.xpath(
			"//body/app-root/app-layout/app-voters-list/app-party-modal/div[@class='card']/div[@class='card-body']/div[@class='others']/div[@class='section']/label[1]/span[1]");
	By saveButtonAfterGrouping = By.xpath("//div[@class='card-body']//button[@class='group-btn']");
	By reportButton = By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base']");

	CommonActionFlow CommonPage = new CommonActionFlow();

	public void Launch_Browser() throws InterruptedException {

		System.out.println("Launching Started .......... ");
		// SS.sendMail();

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(BaseUrl);
		title = driver.getTitle();
		TimeUnit.SECONDS.sleep(3);
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(5);

		System.out.println("Title Of the Website " + title);

		TimeUnit.SECONDS.sleep(5);
		// driver.close();
		// System.out.println("Driver Closed");

	}

	public void enterMobileNumber() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterMobileNumber));
			driver.findElement(enterMobileNumber).sendKeys("8610980828");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void mobilenumberCountinue() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(mobileNumberContinue));
			driver.findElement(mobileNumberContinue).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void Countine2nd() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(continue2ndPageAnd3rdPage));
			driver.findElement(continue2ndPageAnd3rdPage).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void enterVerificationCode() {
		String verificationNumber = CommonPage.OptionPanel();
		System.out.println(verificationNumber);

		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);

			driver.findElement(enterverificationCode).sendKeys(verificationNumber);
			wait.until(ExpectedConditions.visibilityOfElementLocated(continue2ndPageAnd3rdPage));
			// driver.findElement(continue2ndPageAnd3rdPage).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void countinueForVerificationCode() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(continue2ndPageAnd3rdPage));
			driver.findElement(continue2ndPageAnd3rdPage).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try { // try for 2 mins
			System.out.println("Enter into report button wait");
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(reportButton));
			System.out.println("Finished  report button wait");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void getgroupedCount() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(groupedcountforFirstStreet));
			groupedStringCountBefore = driver.findElement(groupedcountforFirstStreet).getText();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		groupedintCountBefore = Integer.parseInt(groupedStringCountBefore);
		System.out.println(groupedintCountBefore);

		groupedintCountBefore = groupedintCountBefore + 1;
		System.out.println(groupedintCountBefore);

	}

	public void selectStreet() {
		System.out.println("Selecting street");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectFirstStreet));
			voterSurveyIDOnClick = driver.findElement(selectFirstStreet).getText();
			driver.findElement(selectFirstStreet).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void selectingVoterData() {
		System.out.println("Selecting VoterID");

		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);

			// WebElement voterselectionUsinglastCount =
			// driver.findElement(By.xpath("//app-voter["+groupedintCountBefore+"]//div[1]//div[2]//p[1]"));

			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//app-voter[" + groupedintCountBefore + "]//div[1]//div[2]//p[1]")));
			voterSurveyIDOnClick = driver
					.findElement(By.xpath("//app-voter[" + groupedintCountBefore + "]//div[1]//div[2]//p[1]"))
					.getText();
			System.out.println(voterSurveyIDOnClick);
			driver.findElement(By.xpath("//app-voter[" + groupedintCountBefore + "]//div[1]//div[2]//p[1]")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clickGroupingButton() {
		System.out.println("Selecting GroupingButton");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(groupingButton));
			driver.findElement(groupingButton).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectingParty() {
		System.out.println("selectingParty");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(partyListSelectionDMK));
			driver.findElement(partyListSelectionDMK).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickcountineAfterSelectingParty() {
		System.out.println("clickcountineAfterSelectingParty");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(countinueInCardBody));
			driver.findElement(countinueInCardBody).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectingReligion() {
		System.out.println("selectingReligion");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(religionListSelectFirst));
			driver.findElement(religionListSelectFirst).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void save() throws InterruptedException {
		System.out.println("Save");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(saveButtonAfterGrouping));
			driver.findElement(saveButtonAfterGrouping).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(2000);
	}

	public void assertSelectedVoter() {

		Boolean value = isSelectedVoter(voterSurveyIDOnClick);

		assertTrue(value);

	}

	public boolean isSelectedVoter(String voterValue) {

		// voterSurveyIDOnClick = "False";
		try {
			WebElement validateVoterSelection = driver
					.findElement(By.xpath("//p[normalize-space()='" + voterSurveyIDOnClick + "']"));
			validateVoterSelection.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;

		}

	}

	public void QuitBrowser() {
		driver.close();
	}

}
