package pl.com.britenet.junit.testbase;

public class CustomerService {

    private static final String BANNED_NAME = "name";

    public static Customer someMethod(Customer customer) throws UnsupportedOperationException {
        if (customer.getName().equals(BANNED_NAME)) {
            throw new UnsupportedOperationException();
        }
        else return customer;
    }
}
