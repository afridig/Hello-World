import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Drag_Drop_Testing {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\User\\Downloads\\APK files\\com.mobeta.android.demodslv-0.5.0-3_apkdot.com.apk");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		//Navigation
		
		driver.findElementByXPath("/heirarchy/android.widget.FrameLayout/android.View/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.View[1]/android.widget.LinearLayout/android.widget.ImageView").click();//clicking the main button
		
		//selecting elements by their resource id especially when the resource id is the same for multiple elements and then using the index number of one particular one by using the get method.
		
		WebElement source = driver.findElementsById("com.mobeta.android.demodslv.id/drag_handle").get(2);
		//dragging the element from position 2 to position index 5
		WebElement target = driver.findElementsById("com.mobeta.android.demodslv.id/drag_handle").get(5);
		
		//using appium's touch action class
		TouchAction action = new TouchAction((MobileDriver)driver);
		
		//drag and drop
		
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		
		System.out.println("element has been dragged from position index 2 and dropped at position index 5 successfully");
		
		driver.quit();

	}

}
