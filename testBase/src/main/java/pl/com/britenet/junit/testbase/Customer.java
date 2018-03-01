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

}
