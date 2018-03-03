package pl.com.britenet.junit.junit4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareDoubleValuesTest {

    @Test
    public void comparisonDelta() throws Exception {
        double b = 1.92;
        double a = 1.9;
        assertEquals(a, b, 0.1);
    }
}
