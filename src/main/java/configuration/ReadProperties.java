package configuration;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static final Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String browserName() {
        return properties.getProperty("browser");
    }

    public static String username() {
        return properties.getProperty("usernameRight");
    }

    public static String usernameWrong() {
        return properties.getProperty("usernameWithWrongData");
    }

    public static String password() {
        return properties.getProperty("password");
    }


    public static String twiter() {
        return properties.getProperty("twiterPage");
    }

    public static String facebook() {
        return properties.getProperty("facebookPage");
    }

    public static String firstNameOfUser() {
        return properties.getProperty("firstName");
    }

    public static String lastNameOfUser() {
        return properties.getProperty("lastName");
    }

    public static String zipCode() {
        return properties.getProperty("zip");
    }

    public static String success () {
        return properties.getProperty("successfulCheckedOut");
    }

    public static boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }
}
