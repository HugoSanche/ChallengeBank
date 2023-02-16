public class Main {
    public static void main(String[] args) {

        Customer sinArgumentos=new Customer();

        System.out.println(sinArgumentos.getName());
        System.out.println(sinArgumentos.getCreditLimit());
        System.out.println(sinArgumentos.getCustomerEmail());

        Customer dosArgumentos=new Customer("Veronica", "Verito.com");
        System.out.println(dosArgumentos.getName());
        System.out.println(dosArgumentos.getCreditLimit());
        System.out.println(dosArgumentos.getCustomerEmail());

        Customer tresArgumentos=new Customer("titina",100.00, "titina.com");
        System.out.println(tresArgumentos.getName());
        System.out.println(tresArgumentos.getCreditLimit());
        System.out.println(tresArgumentos.getCustomerEmail());

        System.out.println("*****************************************************************************");
        //Constructor with out parameters
        Account hugo =new Account();
        System.out.println(hugo.getNumber());
        System.out.println(hugo.getBalance());
        System.out.println(hugo.getCustomerName());
        System.out.println(hugo.getCustomerEmail());

        //Constructor wiht only three parameters
        Account karina =new Account("Karina Lopez","karina.l@test.com","55234157");
        karina.deposit(200.00);
        karina.withdrawing(701.00);
        karina.withdrawing(100.00);

        //contructor  with all parameters
        Account cliente1 =new Account("50541",500.00,"Hugo Baltazar","hugo.baltazar@test.com","55234157");
        cliente1.deposit(200.00);
        cliente1.withdrawing(701.00);
        cliente1.withdrawing(100.00);

    }
}