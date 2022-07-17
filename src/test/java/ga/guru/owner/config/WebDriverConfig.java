package ga.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://www.amazon.com/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("FIREFOX")
    String getBrowser();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    URL getRemoteUrl();


    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();


    @Key("remoteWebDriver")
    String getRemoteWebDriver();

}
