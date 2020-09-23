import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DiallerTesting {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
        
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.samsung.android.dialer.DialtactsActivity");
		
		dc.setCapability("appPackage","com.samsung.android.dialer");
		//dc.setCapability("appActivity","com.samsung.dialer.DialtactsActivity");// DIDN'T WORK
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
	
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		//driver.findElementById("com.samsung.android.dialer:id/floating_action_button").click();// DIDN'T WORK
		//driver.findElementById("com.samsung.android.app.launcher:id/iconview_imageView").click();// DIDN'T WORK
		//driver.findElementByClassName("android.widget.FrameLayout").click();// DIDN'T WORK
		
		//driver.findElementById("android:id/sem_tip_popup_message").click();// DIDN'T WORK
		
		//This will dial a number consisting of digits
		
		driver.findElementById("com.samsung.android.dialer:id/dialpad_tab_button").click();//clicks the dialpad button
		
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required		
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/digit").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/").click();//clicks digit that can be replaced as required
		driver.findElementById("com.samsung.android.dialer:id/four").click();//clicks digit that can be replaced as required
				
		Thread.sleep(3000);
		
		driver.findElementById("com.samsung.android.dialer:id/dialButton").click();//clicking the dial button
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
