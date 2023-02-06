package com.Locatordemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilitydemo.Base_demo;

public class HomepageLocatordemo  extends Base_demo {
	
	public HomepageLocatordemo() {
		
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[text()='Home ']")
	public WebElement HomepageLink;
	
	@FindBy(xpath = "//a[@id='nava']")
	public WebElement HomepageVerify;
	
	@FindBy(xpath = "//a[text()='Contact']")
	public WebElement contactLink;
	
	@FindBy(xpath = "//a[text()='About us']")
	public WebElement aboutUsLink;
	
	@FindBy(xpath = "//a[text()='Cart']")
	public WebElement cartLink;
	
	@FindBy(xpath = "//a[text()='Log in']")
	public WebElement logInLink;
	
	@FindBy(xpath = "//a[text()='Sign up']")
	public WebElement signUpLink;
	
	
	

}
