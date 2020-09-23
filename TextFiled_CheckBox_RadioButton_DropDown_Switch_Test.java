import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TextFiled_CheckBox_RadioButton_DropDown_Switch_Test {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\User\\Downloads\\APK files\\API Demos for Android_v1.9.0_apkpure.com.apk");
        //dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.samsung.android.dialer.DialtactsActivity");//FOR NATIVE APPS
		
		//dc.setCapability("appPackage","com.samsung.android.dialer");//For native apps
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		driver.findElementById("com.touchboarder.android.api.demos:id/buttonDefaultPositive").click();//to click away the initial popup message
		driver.findElementsById("android:id/text1").get(1).click();//clicking on the API demos
		
		//Views
		driver.findElementsById("android:id/text1").get(12).click();// identify the views button and click on it
		
		Thread.sleep(5000);
		
		//Controls
		driver.findElementsById("android:id/text1").get(4).click();//clicking the controls button
		
		driver.findElementsById("android:id/text1").get(2).click();//clicking the Holo Light Theme button
		//Holo light Theme
		//driver.findElementByAccessibilityId("03. Holo Light Theme").click();// Alternative method using findElementByAccessibiliyId to click on the Holo Light Theme
		
		//Text field
		driver.findElementById("com.touchboarder.android.api.demos:id/edit").sendKeys("Gul Afridi");//filling the text field by using the sendKeys method 
		
		//CheckBox
		driver.findElementById("com.touchboarder.android.api.demos:id/check1").click();//ticking the checkbox1
		
		//RadioButton
		driver.findElementById("com.touchboarder.android.api.demos:id/radio1").click(); //ticking the Radio button 1
		
		//Switch/Toggle Button 2
		//driver.findElementById("com.touchboarder.android.api.demos:id/toggle2").click();//Switching the Toggle Button 2
		
		//Drop_down button
		driver.findElementById("com.touchboarder.android.api.demos:id/spinner1").click();//clicking the drop_down menu
        
		Thread.sleep(5000);
		//Earth
		//driver.findElementByAccessibilityId("Earth").click();//selecting earth from the menu
		driver.findElementsById("android:id/text1").get(2).click();
		driver.quit();
		 
	}

}
