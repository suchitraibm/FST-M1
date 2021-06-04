package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class assignment2 {
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
	    	MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Keep Notes");
	    	el2.click();
	    	MobileElement el3 = (MobileElement) driver.findElementsByXPath("//android.widget.ImageButton[@content-desc='New text note']");
	    	el3.click();
	    	MobileElement el7 = (MobileElement) driver.findElementById("com.google.android.keep:id/editable_title");
	    	el7.sendKeys("This is Title");
	    	MobileElement el8 = (MobileElement) driver.findElementById("com.google.android.keep:id/edit_note_text");
	    	el8.sendKeys("This is  Description");
	    	MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
	    	el9.click();
	 
	    	 List<MobileElement> numberOftask = driver.findElementsByXPath("//androidx.cardview.widget.CardView[@content-desc='This is Title. This is Description']/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView");
	         System.out.println("Number of image shown currently: " + numberOftask.size());
	         
	         // Assertion after scrolling
	         Assert.assertEquals(numberOftask.size(), 1);
	    }
	 
	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
}
