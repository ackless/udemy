package src.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {

    public static void main(String[] args) throws MalformedURLException {

        File appiumFolder = new File("src/appium");
        File appFile = new File(appiumFolder, "ApiDemos-debug.apk");

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo Emulator Nexus");
        dc.setCapability(MobileCapabilityType.APP, appFile.getAbsolutePath());

        AndroidDriver<AndroidElement> ad = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);



    }

}
