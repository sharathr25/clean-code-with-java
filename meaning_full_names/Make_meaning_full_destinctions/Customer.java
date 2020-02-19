class Customer {
    private String name;
    private Long accountNumber;

    Customer(String name,Long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    } 

    String getName() {
        return this.name;
    }

    Long getAccountNumber() {
        return this.accountNumber;
    }
}