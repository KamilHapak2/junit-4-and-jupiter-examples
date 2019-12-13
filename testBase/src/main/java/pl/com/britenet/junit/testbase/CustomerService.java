package pl.com.britenet.junit.testbase;

import java.util.Objects;

public class CustomerService {

  public Customer someMethod(Customer customer) {
    throw new UnsupportedOperationException();
  }

  public Customer saveCustomer(Customer customer) {
    if (Objects.isNull(customer.getEmail())) {
      throw new IllegalArgumentException("e-mail is required");
    }
    if (Objects.isNull(customer.getName())) {
      throw new IllegalArgumentException("name is required");
    }

    return customer;
  }
}
