package ga.guru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

//Пример замененной конфигурации

public class WebDriverConfigOld {
    public String getBaseUrl() {
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://www.amazon.com/";
        }
        return baseUrl;

    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }

        return Browser.valueOf(browser);
    }

    public URL getRemoteUrl() {
        String remoteUrl = System.getProperty("remoteUrl");
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "http://localhost:444";
        }
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
