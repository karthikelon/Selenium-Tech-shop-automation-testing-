package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.Driverutils;

public class LoginPage extends BasePage {
	//Declaration

			@FindBy(id="Email")

			public WebElement textEmail;


			@FindBy(name="Password")

			public WebElement textPassword;


			@FindBy(xpath="//input[@class='button-1 login-button']")

			public WebElement buttonLogin;
		 
			
		 
			 
			//Utilization
			 
			public void enterEmail(String str)
		
			{
		
			textEmail.sendKeys(str);
		
			}
			 
			 
			public void enterPassword(String str)
		
			{
		
			textPassword.sendKeys(str);
		
			}
			 
			public void clickLogin()
		
			{
		
				buttonLogin.click();
		
			}
	

	
}

