package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerOptionsPage extends BasePage{
	@FindBy(xpath="//div[@class='sub-category-item']//a[contains(text(),'Desktops')]")

	public WebElement desktopoption;
	
	public void clickdesktopmodulue() {
		desktopoption.click();
		
	}
}
