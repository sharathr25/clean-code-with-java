import java.util.ArrayList;
import java.util.Iterator;

class Util {
    static void printBankCustomers(Bank bank) {
        ArrayList<Customer> customers = bank.getCustomers();
        Iterator customersIterator = customers.iterator();
        System.out.println(bank.getName() + " Bank Customers");
        while(customersIterator.hasNext()) {
            Customer customer = (Customer) customersIterator.next();
            System.out.println(customer.getName());
        }
        System.out.println();
    }
}

class BadCode {
    // In below function : 
    // what is bank1? 
    // what is bank2?
    // what is an? 
    // is tranfer is happening from bank1 to bank2 or bank2 to bank1 
    // :(
    static void tranferCustomer(Bank bank1, Bank bank2, Long an) { 
        Customer c = bank1.getCustomerByAccountNumber(an);
        bank2.addCustomer(c);
        bank1.removeCustomer(c);
    }

    public static void run() {
        Bank bank1 = new Bank("Axis"); // bank1 gives no information(noninformative vairable names)
        Bank bank2 = new Bank("HDFC"); // same as above

        bank1.addCustomer(new Customer("dravid", 12345L));
        bank1.addCustomer(new Customer("kumble", 12345L));
        bank2.addCustomer(new Customer("dhoni", 54321L));
        bank2.addCustomer(new Customer("sachin", 54322L));

        System.out.println("Before transfer");
        System.out.println("---------------");
        Util.printBankCustomers(bank1);
        Util.printBankCustomers(bank2);

        tranferCustomer(bank1, bank2, 12345L);

        System.out.println("After transfer");
        System.out.println("---------------");
        Util.printBankCustomers(bank1);
        Util.printBankCustomers(bank2);
    }
}

class GoodCode {
    static void tranferCustomerByAccountNumber(Bank source, Bank desctination, Long accountNumber) {
        Customer customer = source.getCustomerByAccountNumber(accountNumber);
        desctination.addCustomer(customer);
        source.removeCustomer(customer);
    }

    public static void run() {
        Bank axisBank = new Bank("Axis");
        Bank hdfcBank = new Bank("HDFC");

        axisBank.addCustomer(new Customer("dravid", 12345L));
        axisBank.addCustomer(new Customer("kumble", 12345L));
        hdfcBank.addCustomer(new Customer("dhoni", 54321L));
        hdfcBank.addCustomer(new Customer("sachin", 54322L));

        long accountNumberOfCustomer = 12345L;

        System.out.println("Before transfer");
        System.out.println("---------------");
        Util.printBankCustomers(axisBank);
        Util.printBankCustomers(hdfcBank);

        tranferCustomerByAccountNumber(axisBank, hdfcBank, accountNumberOfCustomer);

        System.out.println("After transfer");
        System.out.println("---------------");
        Util.printBankCustomers(axisBank);
        Util.printBankCustomers(hdfcBank);
    }
}

class BankAccountTransfer {
    public static void main(String[] args) {
        System.out.println("******** output with bad code *********");
        BadCode.run();
        System.out.println("******** output with good code ********");
        GoodCode.run();
    }
}