package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends BasePage{
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
	public WebElement desktop1Tocart;
	
	//@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
	//public WebElement desktop2Tocart;
	
	
	

	public void AddToCartdesktop1() {
		desktop1Tocart.click();
		
	}
	/*
	public void AddToCartdesktop2() {
		desktop2Tocart.click();
		
	}
	*/

}
