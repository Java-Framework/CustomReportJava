package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import utils.BaseTest;



public class LivechatAdminPage extends BaseTest {
	private By readyLocator = By.id("admin_search");
	private By Livechaticon= By.xpath("//div[text()='Live Chat']");
	private By Livetoggle = By.xpath("//div[@id='chat_header']//span[@class='toggle-container']//span[@class='toggle-handle']");
	
	
	
	public LivechatAdminPage(){
		PageFactory.initElements(driver, this);	
		isElementPresent(driver,readyLocator);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
