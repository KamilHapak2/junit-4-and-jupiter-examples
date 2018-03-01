package pl.com.britenet.junit.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import pl.com.britenet.junit.testbase.Customer;
import pl.com.britenet.junit.testbase.CustomerService;
import pl.com.britenet.junit.testbase.MyBusinessException;

import static org.junit.Assert.assertTrue;

public class ExpectedExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = UnsupportedOperationException.class)
    public void expectedTest() throws Exception {
        Customer customer = new Customer("name");

        CustomerService.someMethod(customer);

        assertTrue(true);
    }

    @Test
    public void expectedExceptionRuleTest() throws Exception {
        Customer customer = new Customer("name", "asd");

        thrown.expect(UnsupportedOperationException.class);

        CustomerService.someMethod(customer);
    }
}
