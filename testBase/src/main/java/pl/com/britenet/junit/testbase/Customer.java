package pl.com.britenet.junit.testbase;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class Customer {

  private String name;
  private String email;

  public Customer(String name) {
    throw new UnsupportedOperationException();
  }
}
