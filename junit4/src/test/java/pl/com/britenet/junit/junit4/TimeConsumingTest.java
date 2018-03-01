package pl.com.britenet.junit.junit4;

import org.junit.Test;

public class TimeConsumingTest {

    @Test
    public void test1() throws Exception {
        Thread.sleep(10000);
    }

    @Test
    public void test2() throws Exception {
        Thread.sleep(10000);
    }

    @Test
    public void test3() throws Exception {
        Thread.sleep(10000);
    }
}
