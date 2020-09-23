import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Horizontal_ScrollingTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\User\\Downloads\\APK files\\AndroidUI.apk");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		//Thread.sleep(5000);
		
		//progress bar/horizontal scrolling
		
		WebElement obj = driver.findElementById("com.android.androidui:id/seekBar1");
		String val1 = driver.findElementById("com.android.androidui:id/textProgress").getText();
		System.out.println(val1);
		
		TouchAction action = new TouchAction((MobileDriver)driver);
		action.longPress(ElementOption.element(obj)).moveTo(ElementOption.element(obj,130,130)).release().perform();
		String val2 = driver.findElementById("com.android.androidui:id/textProgress").getText();
		System.out.println(val2);
		
		driver.quit();
		
	}

}
