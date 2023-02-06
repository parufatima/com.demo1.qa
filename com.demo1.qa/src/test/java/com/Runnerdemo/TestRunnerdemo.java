package com.Runnerdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utilitydemo.Base_demo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/demoresources/DemoFeatures"},
                 plugin = {"json:target/cucumber.json"},
                 glue = "StepDepdemo" , tags = {"@Test"})

public class TestRunnerdemo  extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void startURL() {
		
		Base_demo test = new Base_demo(); 
		test.initialBrowser();
		
	}
	
	
	@AfterTest
	public void closeURL() {
		Base_demo test = new Base_demo(); 
		test.driver.quit();
	}

}
