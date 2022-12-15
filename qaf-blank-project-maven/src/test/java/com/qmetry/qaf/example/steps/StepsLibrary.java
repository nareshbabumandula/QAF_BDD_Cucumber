package com.qmetry.qaf.example.steps;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.example.test.SampleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.QAFTestStep;

import static com.qmetry.qaf.automation.step.CommonStep.*;

public class StepsLibrary  extends WebDriverTestCase {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
	@QAFTestStep(description = "search for {0}")
	public static void searchFor(String searchTerm) {
		sendKeys(searchTerm+Keys.ENTER, "input.search");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description="i click on the link displayed in the results")
	public void clickSearchResults(){
		click("//h3[contains(@class,'LC20lb MBeuO')]");
	}

	@QAFTestStep(description="i verify the makemytrip logo is displayed in makemytrip homepage")
	public void testMakeMyTripLogo() throws InterruptedException {
		CommonStep.verifyPresent("//img[@alt=\"MMT's LOGO\"]");
	}

	@QAFTestStep(description="i click the flight search button")
	public void testFlightSearch() throws InterruptedException {
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor)getTestBase().getDriver();
		js.executeScript("arguments[0].click();", getTestBase().getDriver().findElement(By.xpath("//a[contains(@class,'primaryBtn')]")));

		//CommonStep.waitForPresent("//a[contains(@class,'primaryBtn')]",40000);
		//CommonStep.click("//a[contains(@class,'primaryBtn')]");
		Reporter.logWithScreenShot("Successfully searched the flight", MessageTypes.Pass);
	}

	@QAFTestStep(description="i verify the flight search results")
	public void testFlightSearchResults() throws InterruptedException {
		Reporter.logWithScreenShot("Successfully verified the flight search results", MessageTypes.Pass);
	}
	
	/**
	* Auto-generated code snippet by QMetry Automation Framework.
	*/
	@QAFTestStep(description="As a customer/patient")
	public void asACustomerPatient(){
		System.out.println("Logged in as a customer");
		Reporter.logWithScreenShot("Logged in as a customer", MessageTypes.Pass);
	}
	
	/**
	* Auto-generated code snippet by QMetry Automation Framework.
	*/
	@QAFTestStep(description="I want to search a Store by State, City, and Zipcode")
	public void searchStore(){
		System.out.println("Searched the store based on City");
		Reporter.logWithScreenShot("Searched the store based on City", MessageTypes.Pass);
	}
	
	/**
	* Auto-generated code snippet by QMetry Automation Framework.
	*/
	@QAFTestStep(description="So that I can see the store details")
	public void verifySearchResults(){
		System.out.println("Successfully searched the store and verfied the search results");
		Reporter.logWithScreenShot("Successfully searched the store and verfied the search results", MessageTypes.Pass);
	}
	
}
