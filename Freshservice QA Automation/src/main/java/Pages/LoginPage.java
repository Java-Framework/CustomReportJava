package Pages;


import java.io.IOException;

import junit.framework.Assert;
import utils.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;





public class LoginPage extends BaseTest{
	
	private static By readyLocator = By.id("user_session_email");
	
	private By txtUserName = By.id("user_session_email");
	private By txtPassword = By.id("user_session_password");
	private By btnLogin =By.xpath("//button[@class='btn btn-primary btn-login']");
	private static int WAIT_TIME = 10;
	
	/***
	 * Call to super constructor
	 */
	
	public  LoginPage(){
		PageFactory.initElements(driver, this);	
		isElementPresent(driver,readyLocator);
	}
	
	/**
	 * loginForNexiaFromProviderSite
	 * This function will login For Nexia From Provider Site
	 * @param 		driver (an instance of current driver browser )
	 * @param 		userAccount
	 * @param 		userName
	 * @param 		userPassword
	 * @throws       IOException 
	 * @since  	     Mar 29, 2010
	 */


	public DashboardPage loginFS(WebDriver driver, String userName, String userPassword) {   
		try{
		type(driver, txtUserName, userName);
		type(driver, txtPassword, userPassword);
//		click(driver, btnLogin);
     }catch(RuntimeException e){
         e.printStackTrace();
     } 
	return new DashboardPage();
	}


}
