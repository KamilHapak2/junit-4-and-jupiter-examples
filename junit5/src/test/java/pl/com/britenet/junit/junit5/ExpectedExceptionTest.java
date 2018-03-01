package pl.com.britenet.junit.junit5;

import org.junit.jupiter.api.Test;
import pl.com.britenet.junit.testbase.Customer;
import pl.com.britenet.junit.testbase.CustomerService;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ExpectedExceptionTest {

    @Test
    void someMethodThrowsExceptionTest() {
        assertThrows(UnsupportedOperationException.class, () -> {
            CustomerService.someMethod(new Customer("name", " asd"));
        });
    }

}
