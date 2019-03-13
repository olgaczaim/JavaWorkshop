public class Main {
    public static void main(String[] args) {

        Account acc = new Account("1234",100, "olgac", "olgac@olgac", "532121");
        System.out.println("Account const with params called");
        acc.withdraw(11);

        acc.deposit(60);
        acc.withdraw(100);
        acc.deposit(45);
        acc.withdraw(100);

        System.out.println(acc.getNumber());

    }
}
