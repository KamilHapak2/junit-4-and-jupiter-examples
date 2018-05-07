package pl.com.britenet.junit.testbase;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long SERIAL_VERSION_UUID = 12378123L;
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Customer(String name) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return email != null ? email.equals(customer.email) : customer.email == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
