import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Vertical_Scroll_NativeTest {

	private static final CharSequence ESCAPE = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		//dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\User\\Downloads\\APK files\\API Demos for Android_v1.9.0_apkpure.com.apk");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.samsung.android.dialer.DialtactsActivity");
		
		dc.setCapability("appPackage","com.samsung.android.dialer");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		driver.findElementById("com.samsung.android.dialer:id/contactlist_tab_button").click();
		
		Thread.sleep(5000);
				
		//vertical scrolling
		//driver.findElementsById("android:id/text1").get(12).click();// identify the "Home Irl" button and click on it
		
		//capturing all the list items
		//AndroidElement list=(AndroidElement) driver.findElementById("android:id/text1");
		
		//scrolling down till we get the element
		MobileElement listitem = (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
							+ "new UiSelector().description(\"Home Irl\"));"));
		
		//driver.findElementById("android:id/sem_tip_popup_balloon_panel").sendKeys(ESCAPE);//tried to get rid of a popup balloon that was terminating the code//DIDN'T WORK//Test Blocker
		System.out.println(listitem.getLocation());
		listitem.click();
		
		driver.quit();

	}

}
