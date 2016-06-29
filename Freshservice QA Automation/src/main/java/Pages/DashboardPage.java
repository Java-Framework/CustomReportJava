package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.BaseTest;



public class DashboardPage extends BaseTest{
	private By readyLocator = By.id("TicketSummary");
	private By Chaticon =By.id("chat_available_icon");
	private By Agentsidebar =By.id("sidebar");
	private By ChatDashboard =By.id("chat-dashboard");

	
	public DashboardPage(){
		PageFactory.initElements(driver, this);	
		isElementPresent(driver,readyLocator);
	}
	
 public boolean chaticonsverification()
 {
	try {
		 Assert.assertTrue(isElementPresent(driver,Chaticon), "Chat icon is not present in dashboard");
		 Assert.assertTrue(isElementPresent(driver,Agentsidebar), "Agent side bar icon is not present in dashboard");
		 Assert.assertTrue(isElementPresent(driver,ChatDashboard), "Chat dashboard is not present in dashboard");	
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return true;
	
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
