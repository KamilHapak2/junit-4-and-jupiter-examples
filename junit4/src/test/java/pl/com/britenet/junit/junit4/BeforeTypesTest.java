package pl.com.britenet.junit.junit4;

import org.junit.*;

import java.util.logging.Logger;

public class BeforeTypesTest {

    private static Logger LOG = Logger.getLogger("BeforeTypes");

    @AfterClass
    public static void afterClass() {
        LOG.info("AFTER CLASS");
    }

    @BeforeClass
    public static void beforeClass() {
        LOG.info("BEFORE CLASS");
    }

    @After
    @Before
    public void before() {
        LOG.info("BEFORE AND AFTER");
    }

    @Test
    @Before
    public void test1() {
        LOG.info("BEFORE ON TEST");

    }

    @Test
    public void test2() {

    }

    @Before
    public void test3() {
        LOG.info("SECOND BEFORE ");
    }
}





