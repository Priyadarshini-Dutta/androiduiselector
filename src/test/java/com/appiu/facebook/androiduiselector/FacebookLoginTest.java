package com.appiu.facebook.androiduiselector;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class FacebookLoginTest {
	
	
	@Test
	public void testLoginFB() throws MalformedURLException
	{DesiredCapabilities capabilities=new DesiredCapabilities();
	//capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
	//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	//capabilities.setCapability("browserName", "Android");
	
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "5.0");
	capabilities.setCapability("deviceName", "Android Emulator");
	//capabilities.setCapability("app","/Users/AviPriya/Downloads/Medical.apk");
	//capabilities.setCapability("appPackage", "com.medicalgroupsoft.medical.directorymedtermsmultilang.free");
	//capabilities.setCapability("appActivity", "com.medicalgroupsoft.medical.app.FirstPrepare");
	capabilities.setCapability("appPackage", "com.android.contacts");
	capabilities.setCapability("appActivity","DialtactsActivity");
      AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
     
      driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	

}
