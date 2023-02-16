public class Customer {
    private String name;
    private double creditLimit;
    private String customerEmail;

    public Customer(){
        this("Sin Argumentos","No email");
    }
    public Customer(String name, String customerEmail) {
        this(name,50.00,customerEmail);
    }

    public Customer(String name, double creditLimit, String customerEmail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
