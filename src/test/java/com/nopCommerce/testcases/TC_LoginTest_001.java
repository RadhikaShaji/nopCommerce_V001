package com.nopCommerce.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerce.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws IOException
	{
		logger.info("*************** Started TC_LoginTest_001 ********* ");
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		
		logger.info("*************** Providing login info ********* ");
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			logger.info("***************Login is successfull********* ");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("***************Login is Failed********* ");
			captureScreen(driver,"loginTest"); //capturing screent on failure
			Assert.assertTrue(false);
		}
		logger.info("*************** Completed TC_LoginTest_001 ********* ");
	
	}
	
	
	
}