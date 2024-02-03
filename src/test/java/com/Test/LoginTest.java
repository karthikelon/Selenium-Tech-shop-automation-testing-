package com.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Generic.Driverutils;
import com.POM.BookPage;
import com.POM.ComputerOptionsPage;
import com.POM.DesktopPage;
import com.POM.LoginPage;
import com.POM.afterloginmainPage;

public class LoginTest {
	@Test(enabled = true,priority = 1,groups = "smoke")
	@Parameters({"Email","Password"})
	public void verifylogin(String email,String password) throws InterruptedException {
		LoginPage lp =new LoginPage();
		Driverutils.getDriver().get("https://demowebshop.tricentis.com/login");
		
		lp.enterEmail(email);
		lp.enterPassword(password);
		lp.clickLogin();
		afterloginmainPage mp= new afterloginmainPage();
		mp.logout();
		Thread.sleep(3000);
		
	}
	@Test(groups = "BookModule",priority = 2,enabled = true)
	@Parameters({"Email","Password"})
	public void bookmodule(String email,String password) throws InterruptedException {
		LoginPage lp =new LoginPage();
		Driverutils.getDriver().get("https://demowebshop.tricentis.com/login");
		Thread.sleep(5000);
		lp.enterEmail(email);
		lp.enterPassword(password);
		lp.clickLogin();
		
		afterloginmainPage mp= new afterloginmainPage();
		mp.clickbookmodule();
		Thread.sleep(3000);
		System.out.println("testing of book module ");
		BookPage bp= new BookPage();
		bp.AddToCartbook1();
		Thread.sleep(4000);
		bp.AddToCartbook2();
		System.out.println("testing of book module done");
		mp.logout();
		
	}
	@Test(groups = "ComputerModule",priority = 3,enabled = true)
	@Parameters({"Email","Password"})
	public void desktopmodule(String email,String password) throws InterruptedException {
		LoginPage lp =new LoginPage();
		Driverutils.getDriver().get("https://demowebshop.tricentis.com/login");
		Thread.sleep(5000);
		lp.enterEmail(email);
		lp.enterPassword(password);
		lp.clickLogin();
		
		afterloginmainPage mp= new afterloginmainPage();
		mp.clickcomputermodule();
		Thread.sleep(3000);
		ComputerOptionsPage cp=new ComputerOptionsPage();
		cp.clickdesktopmodulue();
		
		System.out.println("testing of  desktop modlue ");
		DesktopPage dp= new DesktopPage();
		dp.AddToCartdesktop1();
		Thread.sleep(4000);
		
		System.out.println("testing of  desktop  module done");
		mp.logout();
		
	}

	
 
}
