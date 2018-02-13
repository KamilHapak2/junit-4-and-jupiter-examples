package pl.com.britenet.junit.junit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assume.assumeTrue;

public class ConditionallyIgnoredTest {

    @Before
    public void beforeMethod() {
        assumeTrue(false);
    }

    @Test
    public void test1() {
        Assert.assertTrue(false);
    }

    @Test
    public void test2() {
        Assert.assertTrue(false);
    }

    @Test
    public void test3() {
        Assert.assertTrue(false);
    }
}
