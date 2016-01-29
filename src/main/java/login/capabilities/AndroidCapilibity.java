package login.capabilities;

public class AndroidCapilibity {
    public static class KEY {
        public static final String PLATFORM_NAME = "platformName";
        public static final String PLATFORM_VERSION = "platformVersion";

        public static final String DEVICE_NAME = "deviceName";

        public static final String APP = "app";
        public static final String FULL_RESET = "fullReset";
        public static final String NO_RESET = "noReset";

        //Android only
        public static final String APP_PACKAGE = "appPackage";
        public static final String APP_ACTIVITY = "appActivity";
        public static final String APP_WAIT_PACKAGE = "appWaitActivity";
        public static final String APP_WAIT_ACTIVITY = "appWaitActivity";
        public static final String DEVICE_READY_TIMEOUT = "deviceReadyTimeout";
        public static final String AVD = "avd";

        public static final String BROWSER_NAME = "browserName";

        public static final String ORIENTATION = "orientation";

        public static final String APPIUM_VERSION = "appiumVersion";
    }

    public static class VALUE {
        public static final String PLATFORM_VERSION = "5.1";
        public static final String PLATFORM_NAME = "Android";
        public static final String DEVICE_NAME = "AndroidTestDevice";
        public static final String APP_PACKAGE = "com.app.dealfish";

        public static final String FULL_RESET = "true";
        public static final String NO_RESET = "false";
    }
}
