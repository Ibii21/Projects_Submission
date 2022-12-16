package ProjectPages;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProjectPages {
	WebDriver driver;
	WebDriverWait wait;
	Select select;
	Actions actions;
	Logger logger = Logger.getLogger("ProjectPages");
	@FindBy(name="vchLogin_Name")
	WebElement username;
	@FindBy(name="vchPassword")
	WebElement password;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement loginButton;
	@FindBy(id="fra_Menu_CureMD")
	WebElement frame1;
	@FindBy(id="fraCureMD_Patient_Menu")
	WebElement frame2;
	@FindBy(id="fraCureMD_Body")
	WebElement frame3;
	@FindBy(id="patientBtn")
	WebElement patientButton;
	@FindBy(xpath="//td[@onclick='javascript:AddPatient()']")
	WebElement addButton;
	@FindBy(id="txtVFNAME")
	WebElement firstName;
	@FindBy(id="txtVLNAME")
	WebElement lastName;
	@FindBy(id="cmbVSEX")
	WebElement genderDropdown;
	@FindBy(id="txtDDOB")
	WebElement DOB;
	@FindBy(id="select2-cmbILOCID-container")
	WebElement location;
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement locationField;
	@FindBy(id="txtVZIP")
	WebElement ZIP;
	@FindBy(id="txtvcity")
	WebElement city;
	@FindBy(id="txtVSTATE")
	WebElement state;
	@FindBy(id="txtVEMAIL")
	WebElement email;
	@FindBy(id="imgpInsurance")
	WebElement primaryInsurance;
	@FindBy(id="imgSInsurance")
	WebElement secondaryInsurance;
	@FindBy(id="cmbIPLANID")
	WebElement planDropdown1;
	@FindBy(id="cmbPlanAdd")
	WebElement addressDropdown1;
	@FindBy(id="txtDSIGNONFILE")
	WebElement signoutFile1;
	@FindBy(id="cmbSECPLANID")
	WebElement planDropdown2;
	@FindBy(id="cmbSecPlanAdd")
	WebElement addressDropdown2;
	@FindBy(id="txtSecDSIGNONFILE")
	WebElement signoutFile2;
	@FindBy(id="tdsave")
	WebElement saveButton;
	@FindBy(id="DynamicBHdialogbox")
	WebElement frame4;
	@FindBy(id="saveAsNewButton")
	WebElement saveAsNewButton;
	@FindBy(id="Provider_Notes_anchor")
	WebElement providerNotesButton;
	@FindBy(id="Provider_Notes_New_Case_anchor")
	WebElement newCaseButton;
	@FindBy(id="txtVCNAME")
	WebElement caseName;
	@FindBy(id="cmdSubmit")
	WebElement submitButton;
	@FindBy(id="Provider_Notes_Provider_Notes_anchor")
	WebElement providerNotes;
	@FindBy(id="SpAdd1")
	WebElement addProviderNoteButton;
	@FindBy(id="select2-cmbProvider-container")
	WebElement provider;
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement providerField;
	@FindBy(id="cmbRTemplate")
	WebElement noteTemplateDropdown;
	@FindBy(id="txtVREASON")
	WebElement visitReasonDropdown;
	@FindBy(id="select2-cmbLocation-container")
	WebElement locationSpan;
	@FindBy(id="//input[@class='select2-search__field']")
	WebElement locationSpanField;
	@FindBy(id="cmbReportType")
	WebElement noteTypeDropdown;
	@FindBy(id="btnSave")
	WebElement createButton;
	@FindBy(id="label_Clinical_Diagnoses_6")
	WebElement diagnosisButton;
	@FindBy(id="tdAddDiagnosis")
	WebElement addDiagnosisButton;
	@FindBy(id="txtKeyword")
	WebElement searchField;
	@FindBy(id="imgMaster")
	WebElement searchIcon;
	@FindBy(xpath="//a[@id='0']")
	WebElement searchResult;
	@FindBy(id="tdSaveDiagnosis")
	WebElement saveButtonAgain;
	@FindBy(id="tdSoapAccept")
	WebElement acceptButton;
	@FindBy(id="Clinical_Lab_Order_7_anchor")
	WebElement ordersButton;
	@FindBy(xpath="//a[@id='OrderResult_8_2_anchor']//child::a")
	WebElement proceduresButton;
	@FindBy(id="txtSearch")
	WebElement search;
	@FindBy(id="SearchImg")
	WebElement searchIcon2;
	@FindBy(xpath="//ul[@id='ulSearchResultFav']//child::a")
	WebElement searchResult2;
	@FindBy(id="tdSaveDiagnosis")
	WebElement saveAndAcceptButton;
	@FindBy(id="sp_eSuperbill")
	WebElement createSuperBillButton;
	@FindBy(id="cmdPatType")
	WebElement patientTypeDropdown;
	@FindBy(xpath="//td[@onclick='javascript:SubmitForm()']")
	WebElement create;
	@FindBy(id="ddleandm")
	WebElement EnMDropdown;
	@FindBy(id="chk99211")
	WebElement checkbox1;
	@FindBy(id="gvSuperBill_ctl03_txtDxPointer")
	WebElement dxPtr;
	@FindBy(xpath="//div[@id='cntrDxPointerMapping_11']//child::input[@id='chkDxPointer_1']")
	WebElement checkbox2;
	@FindBy(xpath="//input[@id='gvSuperBill_ctl02_txtAmount']")
	WebElement amountField;
	@FindBy(id="tdSave")
	WebElement save;
	@FindBy(id="spLog")
	WebElement assertion1;
	@FindBy(id="cmdDelete")
	WebElement assertion2;
	@FindBy(xpath="//span[text()='Deleted Notes']")
	WebElement assertion3;
	@FindBy(xpath="//font[@id='Comp_Heading_Detail']//child::u[text()='Cholera due to Vibrio cholerae 01, biovar cholerae']")
	WebElement assertion4;
	@FindBy(xpath="//font[text()='Office or other outpatient visit for the evaluation and management of an established patient, that may not require the presence of a physician or other qualified health care professional. Usually, the (CPT-99211), Units: 1.']")
	WebElement assertion5;
	@FindBy(xpath="//form[@id='frmCureMDError']")
	WebElement assertion6;
	@FindBy(id="fPatHeader")
	WebElement frame5;
	
	public ProjectPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	static void switchtowindowhandler(WebDriver driver)
	{
		for(String handle: driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
	}
	public void Login() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		logger.info("Login Page opened");
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys("ChargeComments");
		logger.info("Username is entered");
		Thread.sleep(1000);
		password.sendKeys("SuPPort.2014");
		Thread.sleep(1000);
		logger.info("Password is entered");
		loginButton.click();
		logger.info("Login Button is clicked!");
	}
	public void ClickPatientButton() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		switchtowindowhandler(driver);
		logger.info("Driver is switched to newly opened window");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame(frame1);
		logger.info("Driver is switched to the first frame");
		wait.until(ExpectedConditions.elementToBeClickable(patientButton));
		patientButton.click();
		logger.info("Patient Button is clicked");
	}
	public void AddPatient() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		logger.info("Driver is switched to third frame");
		wait.until(ExpectedConditions.elementToBeClickable(addButton));
		addButton.click();
		logger.info("Add Patient Button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(firstName));
		firstName.sendKeys("Madgsdagf");
		lastName.sendKeys("Alisdfsdg");
		select = new Select(genderDropdown);
		select.selectByVisibleText("Male");
		DOB.sendKeys("10/15/2002");
		location.click();
		locationField.sendKeys("Clinic One1");
		locationField.sendKeys(Keys.ENTER);
		ZIP.sendKeys("10004");
		city.sendKeys("NEW YORK");
		state.sendKeys("NY");
		email.sendKeys("ibtisamumer2@gmail.com");
		primaryInsurance.click();
		logger.info("Primary Insurance is expanded");
		select = new Select(planDropdown1);
		select.selectByVisibleText("AARP");
		Thread.sleep(1000);
		select = new Select(addressDropdown1);
		select.selectByVisibleText("P O BOX 1017");
		signoutFile1.sendKeys("12/14/2022");
		secondaryInsurance.click();
		logger.info("Secondary Insurance is expanded");
		select = new Select(planDropdown2);
		select.selectByVisibleText("AETNA");
		Thread.sleep(1000);
		select = new Select(addressDropdown2);
		select.selectByVisibleText("P.O. BOX 981106");
		signoutFile2.sendKeys("12/13/2022");
		logger.info("All mandatory fields are filled in Add Patient Menu");
		actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		logger.info("Page is moved up a bit");
		saveButton.click();
		logger.info("Save Button is clicked");
		Thread.sleep(1000);
		driver.switchTo().frame(frame4);
		logger.info("Driver is switched to fourth frame");
		saveAsNewButton.click();
		logger.info("Save as New Button is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		Assert.assertTrue(assertion1.isDisplayed(),"Patient is not added");
		Thread.sleep(1000);
	}
	public void CreateCase() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame2);
		logger.info("Driver is switched to second frame");
		wait.until(ExpectedConditions.elementToBeClickable(providerNotesButton));
		providerNotesButton.click();
		logger.info("Provider Notes is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(newCaseButton));
		newCaseButton.click();
		logger.info("New Case Button is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		logger.info("Driver is switched to third frame");
		Thread.sleep(1000);
		caseName.sendKeys("Accident");
		logger.info("Case Name is entered");
		submitButton.click();
		logger.info("Save Button is clicked");
		Thread.sleep(1000);
		Assert.assertTrue(assertion2.isDisplayed(),"New Case is not created");
		Thread.sleep(1000);
	}
	public void CreateProviderNote() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame2);
		logger.info("Driver is switched to second frame");
		wait.until(ExpectedConditions.elementToBeClickable(providerNotes));
		providerNotes.click();
		logger.info("Provider Notes is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		logger.info("Driver is switched to third frame");
		wait.until(ExpectedConditions.elementToBeClickable(addProviderNoteButton));
		addProviderNoteButton.click();
		logger.info("Add Button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(provider));
		provider.click();
		Thread.sleep(1000);
		providerField.sendKeys("Bates, Test");
		providerField.sendKeys(Keys.ENTER);
		select = new Select(noteTemplateDropdown);
		select.selectByVisibleText("COVID Administration Note");
		select = new Select(visitReasonDropdown);
		select.selectByVisibleText("AAMVZOEJHC");
		select = new Select(noteTypeDropdown);
		select.selectByVisibleText("Admit Note");
		logger.info("All mandatory fields are filled in Provider Note");
		createButton.click();
		logger.info("Create Button is clicked");
		Thread.sleep(1000);
		Assert.assertTrue(assertion3.isDisplayed(),"Provider Note is not created");
		Thread.sleep(1000);
	}
	public void AddDiagnosis() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame2);
		logger.info("Driver is switched to second frame");
		wait.until(ExpectedConditions.elementToBeClickable(diagnosisButton));
		diagnosisButton.click();
		logger.info("Diagnosis Button is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		logger.info("Driver is switched to third frame");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame4);
		logger.info("Driver is switched to fourth frame");
		wait.until(ExpectedConditions.elementToBeClickable(addDiagnosisButton));
		addDiagnosisButton.click();
		logger.info("Add Button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		searchField.sendKeys("A00.0");
		logger.info("ICD Number is entered to the search field");
		Thread.sleep(1000);
		searchIcon.click();
		logger.info("Search Button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(searchResult));
		searchResult.click();
		logger.info("Search result is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonAgain));
		saveButtonAgain.click();
		logger.info("Save Button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(acceptButton));
		acceptButton.click();
		logger.info("Accept Button is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		Thread.sleep(1000);
		Assert.assertTrue(assertion4.isDisplayed(),"Diagnosis is not added");
		Thread.sleep(1000);
	}
	public void AddProcedure() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame2);
		logger.info("Driver is switched to second frame");
		wait.until(ExpectedConditions.elementToBeClickable(ordersButton));
		ordersButton.click();
		logger.info("Orders button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(ordersButton));
		proceduresButton.click();
		logger.info("Procedures button is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		logger.info("Driver is switched to third frame");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame4);
		logger.info("Driver is switched to fourth frame");
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.sendKeys("99211");
		logger.info("Procedure code is entered in search field");
		Thread.sleep(1000);
		searchIcon2.click();
		logger.info("Search Button is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(searchResult2));
		searchResult2.click();
		logger.info("Search result is clicked");
		wait.until(ExpectedConditions.elementToBeClickable(saveAndAcceptButton));
		saveAndAcceptButton.click();
		logger.info("Save and Accept is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		Thread.sleep(1000);
		Assert.assertTrue(assertion5.isDisplayed(),"Procedure is not added");
		Thread.sleep(1000);
	}
	public void CreateSuperBill() throws InterruptedException
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(createSuperBillButton));
		actions = new Actions(driver);
		createSuperBillButton.click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame4);
		logger.info("Driver is switched to fourth frame");
		wait.until(ExpectedConditions.elementToBeClickable(patientTypeDropdown));
		select = new Select(patientTypeDropdown);
		select.selectByVisibleText("New Patient");
		logger.info("New Patient is selected from Patient Dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
		logger.info("Create Button is clicked");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame(frame3);
		logger.info("Driver is switched to third frame");
		wait.until(ExpectedConditions.elementToBeClickable(EnMDropdown));
		select = new Select(EnMDropdown);
		select.selectByVisibleText("99202-99205: New Patient Office Visit");
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		dxPtr.click();
		wait.until(ExpectedConditions.elementToBeClickable(checkbox2));
		checkbox2.click();
		Thread.sleep(1000);
		actions.doubleClick(amountField).perform();
		Thread.sleep(1000);
		amountField.sendKeys("10");
		logger.info("All mandatory field are filled in Create e-Super Bill");
		actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		save.click();
		logger.info("Save Button is clicked");
		driver.switchTo().defaultContent();
	}

}
