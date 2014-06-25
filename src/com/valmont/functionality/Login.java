package com.valmont.functionality;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.data.driven.LoginDataDriven;
import com.data.driven.SetUpDriver;

public class Login extends com.valmont.utilities.ClickAndClear {

	/**
	 * @param args
	 */
	
	SetUpDriver mSetUpDriverObject = new SetUpDriver();
	LoginDataDriven mLoginDataDriven = new LoginDataDriven();
	
	Properties prop;
	
	public WebDriver LoginValid(WebDriver driver) throws Exception {
		
//		WebElement mUserName = driver.findElement(By.id("txtUserName"));
		prop = GettingProperty.fGettingProperty();
		WebElement mUserName = driver.findElement(By.id(prop.getProperty("Id_UserTextbox")));
		driver = fClickAndClear(driver, mUserName);
		mUserName.sendKeys(prop.getProperty("In_UserName"));
		
		WebElement mUserPassword = driver.findElement(By.id(prop.getProperty("Id_UserPassword")));
		driver = fClickAndClear(driver, mUserPassword);
		mUserPassword.sendKeys(prop.getProperty("In_PassWord"));
		
//		mUserPassword.submit();
		
		WebElement mLoginButton = driver.findElement(By.id(prop.getProperty("Id_LoginButton")));
		mLoginButton.click();
		
		return driver;
	}

	
	
	@SuppressWarnings("null")
	@DataProvider(name = "myTest")
	public Object[][] ReadDataFromExcel() throws Exception{
		Object[][] mUserCredentials;
		
		
	mUserCredentials = mLoginDataDriven.fReadingData();
	
	
		
		System.out.println("The Rows are in the getRowsSize is: " +mLoginDataDriven.getRowsSize());
		System.out.println("The Total columns in the getColumnsSize is: " +mLoginDataDriven.getColumnsSize());
		
	/*for(int jindex=1;jindex<mLoginDataDriven.getRowsSize()-1;jindex++){
		 
		for(int index=1;index<mLoginDataDriven.getColumnsSize()-1;index++){
			 
		System.out.println(mUserCredentials[index][jindex]);
		
		
	}
}*/
		System.out.println("Length of the array is:" +mUserCredentials.length);
		System.out.println("Length of the array is:" +mUserCredentials[0].length);
		System.out.println("Length of the array is:" +mUserCredentials[1].length);
		System.out.println("Length of the array is:" +mUserCredentials[2].length);
		System.out.println("Length of the array is:" +mUserCredentials[3].length);
		
	for(int i=1; i<mUserCredentials.length -1;i++){
		for(int j=1; j<(mUserCredentials[i].length);j++){
			System.out.println("=====>>>>The values in 2d is: "+mUserCredentials[i][j]);
		}
		
	}
		
	return mUserCredentials;
	
	}
	
	
	
	@Test(dataProvider = "myTest")
	public void testLogin(String username, String password) throws Exception{
		
		WebDriver driver = mSetUpDriverObject.fConfigureDriver();
		prop = GettingProperty.fGettingProperty();
		WebElement mUserName = driver.findElement(By.id(prop.getProperty("Id_UserTextbox")));
		driver = fClickAndClear(driver, mUserName);
//		mUserName.sendKeys(prop.getProperty("In_UserName"));
		mUserName.sendKeys("username");
		
		
		WebElement mUserPassword = driver.findElement(By.id(prop.getProperty("Id_UserPassword")));
		driver = fClickAndClear(driver, mUserPassword);
//		mUserPassword.sendKeys(prop.getProperty("In_PassWord"));
		mUserName.sendKeys("password");
		
//		mUserPassword.submit();
		
		WebElement mLoginButton = driver.findElement(By.id(prop.getProperty("Id_LoginButton")));
		mLoginButton.click();
		
		
	}
	
	
	
	
}
