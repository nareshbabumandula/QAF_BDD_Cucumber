package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.*;
import static com.qmetry.qaf.example.steps.StepsLibrary.searchFor;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.util.Reporter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SampleTest extends WebDriverTestCase {
	
	@Test(groups= {"smoke"})
	public void testGoogleSearch() {
		get("/");
		getTestBase().getDriver().manage().window().maximize();
		searchFor("makemytrip");
		verifyLinkWithPartialTextPresent("MakeMyTrip");
	}


}
