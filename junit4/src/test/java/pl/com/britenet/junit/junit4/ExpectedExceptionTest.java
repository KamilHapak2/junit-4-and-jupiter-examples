package pl.com.britenet.junit.junit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import pl.com.britenet.junit.testbase.Customer;
import pl.com.britenet.junit.testbase.CustomerService;

public class ExpectedExceptionTest {

  @Rule public ExpectedException thrown = ExpectedException.none();
  private CustomerService customerService;

  @Before
  public void setUp() {
    customerService = new CustomerService();
  }

  @Test(expected = UnsupportedOperationException.class)
  public void expectedTest() {

    // given
    Customer customer = new Customer("name");

    // when
    customerService.someMethod(customer);
  }

  @Test
  public void expectedExceptionRuleTest() {

    // given
    Customer customer = new Customer("name", "asd");

    // then
    thrown.expect(UnsupportedOperationException.class);

    // when
    customerService.someMethod(customer);
  }
}
