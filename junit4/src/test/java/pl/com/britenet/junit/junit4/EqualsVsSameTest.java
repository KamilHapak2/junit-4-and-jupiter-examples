package pl.com.britenet.junit.junit4;

import org.junit.Before;
import org.junit.Test;
import pl.com.britenet.junit.testbase.Customer;

import static org.junit.Assert.*;

public class EqualsVsSameTest {

    private Customer customer1;
    private Customer customer2;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("qwe", "qwe@qwe.pl");
        customer2 = new Customer("qwe", "qwe@qwe.pl");
    }

    @Test
    public void assertEqualsVsAssertSameOnObject() throws Exception {
        assertNotSame(customer1, customer2);
        assertEquals(customer1, customer2);
    }

    @Test
    public void assertEqualsVsAssertSameOnString() throws Exception {
        assertSame("qwe", "qwe");
        assertEquals("qwe", "qwe");
    }

}