package pl.com.britenet.junit.testbase;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Customer {

  private String name;
  private String email;

  public Customer(String name) {
    throw new UnsupportedOperationException();
  }
}
