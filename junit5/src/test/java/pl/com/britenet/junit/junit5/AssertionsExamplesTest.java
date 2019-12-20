package pl.com.britenet.junit.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.com.britenet.junit.testbase.Customer;

import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;

class AssertionsExamplesTest {

  /**
   * assertAll will make junit check all assertions. By default it checks until first failed
   * assertion. Notice assertions have to be a separate executables. Try by modifying both given
   * values.
   */
  @Test
  @DisplayName("Assert all test")
  void assertAllTest() {

    // given
    String firstName = "Joe";
    String lastName = "Doe";

    assertAll(
        () -> assertEquals("Joe", firstName, "First name is not as expected"),
        () -> assertEquals("Doe", lastName, "last name is not as expected"));
  }

  /** When comparing double values we can specify delta. */
  @Test
  @DisplayName("Compare double value example")
  void compareDoubleValueExample() {

    // given
    double b = 1.92;
    double a = 1.9;

    // then
    assertEquals(a, b, 0.1);
  }

  /** Assertion fails when execution of given executable takes more than timeout parameter. */
  @Test
  @DisplayName("Assert timeout example")
  void assertTimeoutExample() {

    assertTimeout(ofMinutes(2), () -> Thread.sleep(100));
  }

  /**
   * By passing Supplier<String> instead of regular String we can make message be lazily evaluated
   * only if the assertion failed.
   */
  @Test
  void lazilyEvaluatedAssertionMessage() {

    final Customer givenCustomer = new Customer("Jack", "Jack@mail.com");
    final Customer actualCustomer = new Customer("Jack", "Jack@mail.com");

    assertEquals(
        givenCustomer,
        actualCustomer,
        () ->
            String.format(
                "Customers are not equal. Given customer: name = %s, email = %s."
                    + System.getProperty("line.separator")
                    + " Expected customer: name = %s, email = %s",
                actualCustomer.getName(),
                actualCustomer.getEmail(),
                givenCustomer.getName(),
                givenCustomer.getEmail()));
  }
}
