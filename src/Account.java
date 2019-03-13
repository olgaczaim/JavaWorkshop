public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        //if you dont get any parameters, use them
        this("56789", 100, "olgac", "asd@asd", "5320");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit(double depAmount){
        balance += depAmount;
        System.out.println("Deposit of " + depAmount + " made. New balance is " + balance);
    }

    public void withdraw(double witAmount){
        if((balance - witAmount) < 0){
            System.out.println("Only " + balance + " available");
        }else{
            balance -= witAmount;
            System.out.println("Wihdrawal of " + witAmount + " processed. Remaining balance = " + balance);
        }
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
}

