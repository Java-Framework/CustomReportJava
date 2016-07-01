package utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseTest extends TestListenerAdapter
{
    protected  WebDriver driver;
    public static Boolean result;
    
    @Parameters({ "os", "os_version", "browser", "browser_version", "account" })
    @BeforeClass(alwaysRun = true)
    public void setUp(String os, String os_version, String browser, String browser_version, String account)
    {
        System.setProperty("os", os);
        System.setProperty("os_version", os_version);
        System.setProperty("browser", browser);
        System.setProperty("browser_version", browser_version);

        driver = new FirefoxDriver();
        try {
        driver.get(account);
        Thread.sleep(10000);
        }
        catch (InterruptedException e) {	
			e.printStackTrace();
		}
    }

    @AfterClass(alwaysRun = true)
    public void tearDown()
    {
    	if(driver!=null) {
    		driver.quit();
    	}
    }

    public WebDriver getDriverInstance()
    {
        return driver;
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        onTestFailure(result);
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriverInstance();

        if (driver != null)
        {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            try
            {
                String fileNameToCopy = "target/custom-test-reports/" + result.getTestClass().getName()
                        + "_screenshot.png";
                FileUtils.copyFile(scrFile, new File(fileNameToCopy));
                Reporter.log("[Console Log] Screenshot saved in " + result.getTestClass().getName() + "_screenshot.png");
            } catch (IOException ex)
            {
                // Log error message
            }
        }
    }
    /**
	 * Verify the presence of a element in the page. 
	 * @param By
	 * @param text
	 * @return true/false
	 * @throws IOException 
	 */
	public static boolean isElementPresent(WebDriver driver,By element){
		boolean exists = true;
		try {
			exists = (driver.findElements(element).size()!=0);
			
		} catch (Exception e) {
		e.printStackTrace();	
		}
		return exists;
	}
    

	public boolean type(WebDriver driver,By elementLocator, String value) {
		try {
//		try {
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.findElement(elementLocator).clear();
			driver.findElement(elementLocator).sendKeys(value);
	
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}

	
    
    
    
    
    
    
}
