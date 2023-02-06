package com.Utilitydemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_demo {
	
public static WebDriver driver;
public static Properties demoprop;


 public Base_demo(){
	 
	 try {
		FileInputStream demofls = new FileInputStream (System.getProperty("user.dir") + "\\src\\test\\java\\com\\configdemo\\configdemo.properties");
		demoprop = new Properties();
		 demoprop.load(demofls);
	} catch (FileNotFoundException d) {
		System.out.println("Please check the code d");
		d.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public void initialBrowser() {
	 String BrowserSet = demoprop.getProperty("Browser1");
	 
	 if(BrowserSet.equals("Chrome") ) {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\DemoDriver\\chromedriver.exe" );
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData_demo.ImplicitlyWait));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData_demo.pageLoad));
		 
	 }
	 else if (BrowserSet.equals("FireFox")) {
		 
	 }
	 	 
	 }
 public static void lunchURL(String URL) {
	 driver.get(demoprop.getProperty("URL"));
	 
	 
 }
 
 
}
