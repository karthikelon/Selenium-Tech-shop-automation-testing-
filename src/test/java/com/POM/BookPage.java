package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends BasePage {
	@FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button'][1]")
	public WebElement book1Tocart;
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
	public WebElement book2Tocart;
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[3]")
	public WebElement book3Tocart;
	
	@FindBy(xpath="//a[@class='ico-logout']")

	public WebElement logoutbutton;
	
	
	public void AddToCartbook1() {
		book1Tocart.click();
		
	}
	public void AddToCartbook2() {
		book2Tocart.click();
		
	}
	public void logout() {
		logoutbutton.click();
	}

}
