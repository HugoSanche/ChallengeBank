public class Main {
    public static void main(String[] args) {

        Account cliente1 =new Account("50541",500.00,"Hugo Baltazar","hugo.baltazar@test.com","55234157");
        cliente1.deposit(200.00);
        cliente1.withdrawing(701.00);
        cliente1.withdrawing(100.00);

    }
}