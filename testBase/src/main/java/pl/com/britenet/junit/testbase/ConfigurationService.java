package pl.com.britenet.junit.testbase;

public class ConfigurationService {

    public static boolean isH2TestsEnabled() {
        return Boolean.valueOf(System.getProperty("h2TestsEnabled"));
    }

    public static boolean isisTimeConsumingTestsEnabled() {
        return Boolean.valueOf(System.getProperty("timeConsumingTestsEnabled"));
    }
}
