package pl.com.britenet.junit.junit4;

import org.junit.ComparisonFailure;

class CustomAssertions {

    static void assertDifferent(Object expected, Object actual) {
        if (expected.equals(actual)) {
            throw new ComparisonFailure("Objects are equal", expected.toString(),
                    actual.toString());
        }
    }
}
