package ga.guru.owner.config;

public class WebDriverConfig {
    public String getBaseUrl() {
//        String baseUrl =System.getProperty("baseUrl");
//        return baseUrl;
        return "https://www.amazon.com/";
    }

    public Browser getBrowser() {
//        String browser = System.getProperty("browser");
//        return Browser.valueOf(browser);
        return Browser.FIREFOX;
    }
}
