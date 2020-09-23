import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DefaultButtonTest1_RealDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\User\\Downloads\\APK files\\PIA App_v2.1.6.1.1_apkpure.com.apk");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		Thread.sleep(20000);
		
		//driver.findElementById("com.piac.thepiaapp.android:id/rlt_book_a_flight").click();// using both findElementById and findElementByXpath, acquiring the former by uiautomatorviewr.bat and the latter by using appium inspector session.
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]").click();//finding element using xpath through appium inspector session.
		
		
		Thread.sleep(10000);
		
		driver.findElementById("com.piac.thepiaapp.android:id/tw_roundtrip").isDisplayed();
		boolean val = driver.findElementById("com.piac.thepiaapp.android:id/tw_roundtrip").isDisplayed();
		System.out.println(val);
		//String val=driver.findElementById("com.piac.thepiaapp.android:id/tw_roundtrip").isDisplayed();//Doesn't work
		
		driver.findElementById("com.piac.thepiaapp.android:id/tw_roundtrip").isEnabled();
		boolean val2 = driver.findElementById("com.piac.thepiaapp.android:id/tw_roundtrip").isEnabled();
		System.out.println(val2);
		
		driver.findElementById("com.piac.thepiaapp.android:id/tw_roundtrip").isSelected();
		boolean val3 = driver.findElementById("com.piac.thepiaapp.android:id/tw_roundtrip").isSelected();
		System.out.println(val3);
		
		driver.quit();

	}

}