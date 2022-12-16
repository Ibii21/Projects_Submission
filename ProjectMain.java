package ProjectMain;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProjectPages.ProjectPages;

public class ProjectMain {
	WebDriver driver;
	ProjectPages obj;
	
	@BeforeTest
	public void GetUrl() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4400\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		PropertyConfigurator.configure("log4j.properties");
		driver=new ChromeDriver();
		obj=new ProjectPages(driver);
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
		driver.manage().window().maximize();
	}
	@Test
	public void TC0() throws InterruptedException 
	{
		obj.Login();
	}
	@Test(dependsOnMethods = { "TC0" })
	public void TC1() throws InterruptedException 
	{
		obj.ClickPatientButton();
		obj.AddPatient();
	}
	@Test(dependsOnMethods = { "TC0","TC1"})
	public void TC2() throws InterruptedException 
	{
		obj.CreateCase();
	}
	@Test(dependsOnMethods = { "TC0","TC1","TC2"})
	public void TC3() throws InterruptedException 
	{
		obj.CreateProviderNote();
	}
	@Test(dependsOnMethods = { "TC0","TC1","TC2","TC3"})
	public void TC4() throws InterruptedException 
	{
		obj.AddDiagnosis();
	}
	@Test(dependsOnMethods = { "TC0","TC1","TC2","TC3","TC4"})
	public void TC5() throws InterruptedException 
	{
		obj.AddProcedure();
	}
	@Test(dependsOnMethods = { "TC0","TC1","TC2","TC3","TC4","TC5"})
	public void TC6() throws InterruptedException 
	{
		obj.CreateSuperBill();
	}

}
