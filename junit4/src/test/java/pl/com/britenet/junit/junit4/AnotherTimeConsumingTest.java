package pl.com.britenet.junit.junit4;

import org.junit.Before;
import org.junit.Test;
import pl.com.britenet.junit.testbase.ConfigurationService;

import static org.junit.Assume.assumeTrue;

public class AnotherTimeConsumingTest {

    @Before
    public void init(){
        assumeTrue(ConfigurationService.isisTimeConsumingTestsEnabled());
    }

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
