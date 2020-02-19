import java.util.ArrayList;
import java.util.Iterator;

class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<CustomerInfo> CustomerInfos;  // Customer and CustomerInfo are indistinguishable(I am not using this, just for explanation)

    Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    boolean addCustomer(Customer customer) {
        return this.customers.add(customer);
    }

    boolean removeCustomer(Customer customer) {
        return this.customers.remove(customer);
    }

    ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    String getName() {
        return this.name;
    }

    Customer getCustomerByAccountNumber(long accountNumber) {
        Iterator customersIterator = customers.iterator();
        while(customersIterator.hasNext()) {
            Customer customer = (Customer) customersIterator.next();
            if(customer.getAccountNumber() == accountNumber){
                return customer;
            }
        }
        return null;
    }
}