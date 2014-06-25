package com.valmont.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		String[][] mUserCredentials = null;
		
		
		com.valmont.functionality.Login mLoginObject = new com.valmont.functionality.Login();
		com.data.driven.LoginDataDriven mLoginLoginDataDrivenObject = new com.data.driven.LoginDataDriven();
		
		
//		WebDriver driver= new FirefoxDriver();
//		driver.navigate().to("http://basestation.valleyirrigation.com/BaseStation3/Pages/Default.aspx#login");
//		Thread.sleep(2000);
//		
//		
////		driver = mLoginObject.LoginValid(driver);
////		driver.quit();
		
//		mUserCredentials = mLoginLoginDataDrivenObject.fReadingData();
		
		/*for(int index=1;index<mLoginLoginDataDrivenObject.getColumnsSize()-1;index++){
			for(int jindex=1;jindex<mLoginLoginDataDrivenObject.getRowsSize();jindex++){
				System.out.println(mUserCredentials[index][jindex]);
				
			}
		}
*/
		

		
			for(int jindex=1;jindex<mLoginLoginDataDrivenObject.getRowsSize();jindex++){
				for(int index=1;index<mLoginLoginDataDrivenObject.getColumnsSize()-1;index++){
				System.out.println(mUserCredentials[index][jindex]);
				
			}
		}

		
	}
}



