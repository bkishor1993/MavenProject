package ToolsQA.DemoMavenEclipseProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class PracticeForm {
	
	WebDriver driver = null;
	
	@Test
	public void LaunchBrowser() {
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void SetBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\StudyMaterial\\EclipseWorkspace\\library\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
		driver.quit();
	}
	
	

}
