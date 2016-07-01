package uitests.smoke;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SampleTestClass extends BaseTest
{
    private WebElement element;

    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke","Advancesmoke1", "ProblemModule" })
    public void testMethod(String expected_text)
    {
    	System.out.println("testMethod:- "
    			+ Thread.currentThread().getId());
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke","Advancesmoke1", "ProblemModule" })
    public void testMethod11(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke","Advancesmoke1", "ProblemModule" })
    public void testMethod12(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke","Advancesmoke1", "ProblemModule" })
    public void testMethod13(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
    @Parameters({ "expected_text" })
    @Test(groups = { "Smoke","Advancesmoke","Advancesmoke1", "ProblemModule" })
    public void testMethod15(String expected_text)
    {
        Assert.assertTrue(driver.getPageSource().contains("freshdesk inc"), "Expected text not found on page!");
    }
}
