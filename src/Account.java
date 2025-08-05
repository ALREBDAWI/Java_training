public class Account {

    public Double balance;

    public Account(double balance) {  //constructor
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount : " + amount + ", and your balance now is : " + balance);
    }

    public void withdraw(double amount) {
        if(balance < 30 || amount > balance -30 ) {  //a minimum of 30 euros must be left in balance
            System.out.println("you cant withdraw");
        }else {
            balance = balance - amount;
            System.out.println("withdraw amount is : " + amount + ", your balance now is: " + balance);
        }
    }

    public void balance(){
        System.out.println("your balance is : " + balance);
    }
}
