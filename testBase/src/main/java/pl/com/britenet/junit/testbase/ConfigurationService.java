package pl.com.britenet.junit.testbase;

public class ConfigurationService {

    public static boolean isSpecificTestsEnabled() {
        return Boolean.valueOf(System.getProperty("specificTestsEnabled"));
    }

}
