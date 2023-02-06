package com.Actiondemo;

import org.testng.Assert;

import com.Locatordemo.HomepageLocatordemo;
import com.Utilitydemo.Base_demo;

public class HomepageActiondemo   extends Base_demo{
	
	HomepageLocatordemo  homepageLocatordemo = new HomepageLocatordemo();
	
 public void 	Clickonhomepagelink() {
	 
	 homepageLocatordemo.HomepageLink.click();
 }
 public void Verifyhomepage() {
	boolean verify = homepageLocatordemo.HomepageVerify.isDisplayed();
	Assert.assertTrue(verify);
 }
 
 public void ClickonContactlinkinHomepage() {
	 homepageLocatordemo.contactLink.click();
 }
 
 public void ClickonAboutUslinkinHomepage() {
	 homepageLocatordemo.aboutUsLink.click();
 }
 
 public void ClickonCartlinkinHomepage() {
	 homepageLocatordemo.cartLink.click();
 }
 
 public void ClickonLoginlinkinHomepage() {
	 homepageLocatordemo.logInLink.click();
 }
 
 public void ClickonSignUplinkinHomepage() {
	 homepageLocatordemo.signUpLink.click();
 }

}
