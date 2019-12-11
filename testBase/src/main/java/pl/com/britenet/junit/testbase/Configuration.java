package pl.com.britenet.junit.testbase;

public class Configuration {

    public static boolean isH2TestsEnabled() {
        return Boolean.parseBoolean(System.getProperty("h2TestsEnabled"));
    }

    public static boolean isTimeConsumingTestsEnabled() {
        return Boolean.parseBoolean(System.getProperty("timeConsumingTestsEnabled"));
    }
}
