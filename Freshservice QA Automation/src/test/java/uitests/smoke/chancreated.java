


package uitests.smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class chancreated extends BaseTest
{	
    private WebElement element;

    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke", "TicketModule" })
    public void testMethod1(String expected_text)
    {
    	System.out.println("testMethod1:- "
    			+ Thread.currentThread().getId());
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke", "TicketModule" })
    public void testMethod2(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke", "TicketModule" })
    public void testMethod3(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke", "TicketModule" })
    public void testMethod4(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke", "TicketModule" })
    public void testMethod6(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke", "TicketModule" })
    public void testMethod5(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    
}
