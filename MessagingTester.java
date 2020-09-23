import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MessagingTester {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.samsung.android.messaging.ui.view.main.WithActivity");//take the first activity attribute
		
		dc.setCapability("appPackage","com.samsung.android.messaging");
		//dc.setCapability("appActivity","com.samsung.android.messaging.ui.view.main.WithActivity");// This one also works
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
	
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		Thread.sleep(5000);
		
		//driver.findElementById("com.sec.android.app.launcher:id/iconview_imageView").click();//tapping the message icon
		driver.findElementById("com.samsung.android.messaging:id/title").click();
		driver.findElementById("com.samsung.android.messaging:id/fab").click();//tapping the new compose message button
		
		driver.findElementById("com.samsung.android.messaging:id/recipients_editor_to").sendKeys("0834568144");
		driver.findElementById("com.samsung.android.messaging:id/message_edit_text").sendKeys("Hello Gul");
		
		driver.findElementById("com.samsung.android.messaging:id/send_button1").click();//clicks the send button
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
