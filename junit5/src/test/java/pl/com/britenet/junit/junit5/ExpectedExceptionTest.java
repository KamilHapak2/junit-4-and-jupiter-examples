package pl.com.britenet.junit.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.com.britenet.junit.testbase.Customer;
import pl.com.britenet.junit.testbase.CustomerService;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Examples of assertions used for exceptions. */
class ExpectedExceptionTest {

  private CustomerService customerService;

  @BeforeEach
  void setUp() {
    customerService = new CustomerService();
  }

  @Test
  void shouldThrowException() {
    // given
    final Customer customer = new Customer("name", " asd");

    // then
    assertThrows(
        UnsupportedOperationException.class,
        () -> {
          // when
          customerService.someMethod(customer);
        },
        "Should throw UnsupportedOperationException");
  }

  @Test
  void shouldNotThrowException() {

    // then
    assertDoesNotThrow(
        () -> {
          // when
          new Customer("name", "email");
        },
        "Should not throw exception when called with all parameters");
  }

  @Test
  void shouldThrowExceptionIfEmailIsNull() {
    // given
    final Customer customer = new Customer("name", null);

    // then
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          // when
          customerService.saveCustomer(customer);
        },
        "Should throw exception when e-mail is null");
  }

  @Test
  void shouldThrowExceptionIfNameIsNull() {
    // given
    final Customer customer = new Customer(null, "e-mail");

    // then
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          // when
          customerService.saveCustomer(customer);
        },
        "Should throw exception when name is null");
  }
}
