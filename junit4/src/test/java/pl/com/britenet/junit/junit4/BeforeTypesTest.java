package pl.com.britenet.junit.junit4;

import lombok.extern.java.Log;
import org.junit.*;

@Log
public class BeforeTypesTest {


    @AfterClass
    public static void afterClass() {
        log.info("AFTER CLASS");
    }

    @BeforeClass
    public static void beforeClass() {
        log.info("BEFORE CLASS");
    }

    @After
    @Before
    public void before() {
        log.info("BEFORE AND AFTER");
    }

    @Test
    @Before
    public void test1() {
        log.info("BEFORE ON TEST");

    }

    @Test
    public void test2() {

    }

    @Before
    public void test3() {
        log.info("SECOND BEFORE ");
    }
}





