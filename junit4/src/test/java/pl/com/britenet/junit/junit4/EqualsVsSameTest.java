package pl.com.britenet.junit.junit4;

import org.junit.Before;
import org.junit.Test;
import pl.com.britenet.junit.testbase.Customer;
import pl.com.britenet.junit.testbase.Student;

import static org.junit.Assert.*;
import static pl.com.britenet.junit.junit4.CustomAssertions.assertDifferent;

public class EqualsVsSameTest {

    private Customer customer1;
    private Customer customer2;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("qwe", "e@mail.com");
        customer2 = new Customer("qwe", "e@mail.com");
    }

    /**
     * Remove hashCode and equals methos from Customer to see the difference.
     */
    @Test
    public void assertEqualsVsAssertSameOnObject() {
        assertNotSame(customer1, customer2);
        assertEquals(customer1, customer2);
    }

    @Test
    public void assertEqualsVsAssertSameOnString() throws Exception {
        assertSame("qwe", "qwe");
        assertEquals("qwe", "qwe");
    }

    @Test
    public void customAssertion() {
        Student student1 = new Student(1, "test");
        Student student2 = new Student(1, "test2");
        assertDifferent(student1, student2);
    }
}