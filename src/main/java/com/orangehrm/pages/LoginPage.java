package com.orangehrm.pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import com.orangehrm.configs.ConfigReader;
 
public class LoginPage extends Page {
	
	//+++++++++++++
	
	protected String username1;
	protected String password1;

	ConfigReader reader = new ConfigReader();

	
	//+++++++++++++
	
	// locators
	By username=By.id("txtUsername");
	By password=By.xpath("//input[@id='txtPassword']");
	By loginBtn=By.name("Submit");
	By actualMsg=By.xpath(".//*[@id=\'spanMessage\']");
		
	
	public void enterUsername() {		
		//driver.findElement(username).sendKeys("Admin");	
		driver.findElement(username).sendKeys(reader.username1);
		//driver.findElement(username).sendKeys(reader.getUsername1());
	}	
	
	public void enterPassword() {		
		//driver.findElement(password).sendKeys("admin123");	
		driver.findElement(password).sendKeys(reader.password1);
		//driver.findElement(password).sendKeys(reader.getPassword1());
	}	
	
	public void enterBadPassword() {
		driver.findElement(password).sendKeys("ADMIN123");				
	}
	
	public void clickLoginBtn() {	
		driver.findElement(loginBtn).click();		
	}	
	
	public String getActualMsg() {
		return driver.findElement(actualMsg).getText();
	}
	
	public void clearFields() {
		driver.findElement(username).clear();
		driver.findElement(password).clear();
	}
}