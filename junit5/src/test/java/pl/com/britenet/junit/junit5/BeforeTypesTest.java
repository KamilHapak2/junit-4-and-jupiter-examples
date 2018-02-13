package pl.com.britenet.junit.junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class BeforeTypesTest {

    private static Logger LOG = Logger.getLogger("BeforeTypesTest");

    @BeforeAll
    static void beforeClass() {
        LOG.info("BEFORE ALL");
    }

    @BeforeEach
    void setUp() {
        LOG.info("BEFORE EACH");
    }

    @Test
    void test1() {

    }

    @Test
    void test2() {

    }

    @Test
    void test3() {

    }
}
