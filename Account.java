public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //default contructor with any parameters
    public Account(){
        //check you dont write anything before call the constructor this();
        //System.out.println("Constructor sin parametros");
        this("5415",100.00,"No name value","No email value","No customer phone value");
        System.out.println("Constructor sin parametros");
    }

    //constructor with anly three parameters
    public Account(String customerName, String customerEmail, String customerPhone) {
        this("0001",300.00,customerName,customerEmail,customerPhone);
       // this.number = number;
       // this.balance = balance;
       // this.customerName = customerName;
       // this.customerEmail = customerEmail;
       // this.customerPhone = customerPhone;

        System.out.println("Constructor con 3 parametros");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;

        System.out.println("Constructor completo");
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount) {
        double newDeposit = getBalance() + amount;
        setBalance(newDeposit);

        System.out.println("Deposit was for "+amount+" the new balance its for "+balance);
    }

    public void withdrawing(double amount) {
        double newDrawing = getBalance();
        if (newDrawing - amount< 0) {
            System.out.println("Your account Balance its insufficient "+balance);
        } else {
            newDrawing = newDrawing - amount;
            setBalance(newDrawing);
        }
    }
}