package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class assignment1 {
	 AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;

	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel4Emulators");
	        caps.setCapability("platformName", "Android");
	       // caps.setCapability("appPackage", "com.android.chrome");
	      //  caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	       caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 5);

	      //  driver.get("https://www.training-support.net/selenium/lazy-loading");
	    }

	    @Test  
	    public void googleTask() throws InterruptedException {
	    	MobileElement el1 = driver.findElementByAccessibilityId("Tasks");
	    	el1.click();
	    	Thread.sleep(30000);
	    	Thread.sleep(30000);
	    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("com.google.android.apps.tasks:id/tasks_fab")));
	    	MobileElement el2 = driver.findElementById("com.google.android.apps.tasks:id/tasks_fab");
	    	el2.click();
	    	
	    	MobileElement el3 = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
	    	el3.sendKeys("Complete Activity with Google Tasks");
	    	
	    	
	    	MobileElement el4 = driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
	    	el4.click();
	    	MobileElement el5 = driver.findElementById("com.google.android.apps.tasks:id/tasks_fab");
	    	el5.click();
	    	MobileElement el6 = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
	    	el6.sendKeys("Complete Activity with Google Keep");
	    	MobileElement el7 = driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
	    	el7.click();
	    	MobileElement el8 = driver.findElementById("com.google.android.apps.tasks:id/tasks_fab");
	    	el8.click();
	    	MobileElement el9 = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
	    	el9.sendKeys("Complete the second Activity Google Keep");
	    	MobileElement el10 = driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
	    	el10.click();
	 
	    	 List<MobileElement> numberOftask = driver.findElementsByXPath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout");
	         System.out.println("Number of image shown currently: " + numberOftask.size());
	         
	         // Assertion after scrolling
	         Assert.assertEquals(numberOftask.size(), 3);
	    }
	 
	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
}
