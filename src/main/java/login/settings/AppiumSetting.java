package login.settings;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import login.capabilities.AndroidCapilibity;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumSetting {

    AppiumDriverLocalService service;

    protected AndroidDriver driver;

    public AndroidDriver getDriver() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(AndroidCapilibity.KEY.DEVICE_NAME, AndroidCapilibity.VALUE.DEVICE_NAME);

        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

        return driver;
    }

}
