package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.springframework.util.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KhanAcademy_test extends dcc {

	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void setup() throws Exception {
		
		Thread.sleep(7000);
		service = startServer();
		
		driver = capsi(deviceName, platformName, appPackage, appActivity);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Test
	public void KhanAcademy() throws InterruptedException {

		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Computing\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Computer science\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Cryptography\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/button2")).click();
		Thread.sleep(3000);

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Information theory\")").click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[2]")).click();
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"Bookmarks\"]")).click();

		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"Select bookmark\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Delete\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"Select bookmark\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Delete\")").click();

		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Life skills\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Financial Literacy\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Welcome to Financial Literacy\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Welcome to Financial Literacy\")").click();
		Thread.sleep(15000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"Home\"]")).click();

		String lastseen = driver.findElement(MobileBy.xpath("(//*[@class='android.widget.TextView'])[6]")).getText();
		System.out.println(lastseen);
		org.testng.Assert.assertEquals(lastseen, "Intro to Financial Literacy");
		System.out.println("The last seen topic name is displayed under Recent Lessons");
		driver.close();
		
		service.stop();

	}
	
}
