package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class afterloginmainPage extends BasePage {

	@FindBy(xpath="//div[@class='header-menu']//a[contains(text(),'Books')]")

	public WebElement bookoption;
	
	@FindBy(xpath="//a[@class='ico-logout']")

	public WebElement logoutbutton;
	
	@FindBy(xpath="//div[@class='header-menu']//a[contains(text(),'Computers')]")

	public WebElement computeroption;
	
	public void clickbookmodule(){
		bookoption.click();
	}
	public void logout(){
		logoutbutton.click();

	}
	public void clickcomputermodule() {
		computeroption.click();
		
	}
}
