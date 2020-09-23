import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTesting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		
		dc.setCapability("appPackage","com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		//URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		Thread.sleep(5000);
		
		//driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09").click(); //click 9
		//or by the following method
		WebElement nine=driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09");//9
		nine.click();// click on 9
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add").click();//click the + button, + can be replaced with all the other functionalities depending on the tests
		
		WebElement six=driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06");//WebElement 6
		six.click();
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal").click();// perform click action on the "=" button
        
		Thread.sleep(3000);
		
		String results=driver.findElementById("com.sec.android.app.popupcalculator:id/calc_edt_formula").getText();//capturing the resulting output
		
		if (results.contentEquals("15"))
		
		{
			System.out.println("Test Passed...");					
		}
		
		else
		
		{
			System.out.println("Test Failed...");			
		}
			Thread.sleep(5000);
			
			driver.quit();		
		
		
	}
}
