public class Main {
    public static void main(String[] args) {

        //Account acc = new Account("1234",100, "olgac", "olgac@olgac", "532121");
        //System.out.println("Account const with params called");
        //acc.withdraw(11);
//
        //acc.deposit(60);
        //acc.withdraw(100);
        //acc.deposit(45);
        //acc.withdraw(100);
//
        //System.out.println(acc.getNumber());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer(2500.00, "olgac");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer(100.00, "Bob", "bob@email.com");
        System.out.println(person3.getName());

    }
}
