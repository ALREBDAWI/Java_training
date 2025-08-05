
//-----------------------------testing different bank account operations separately------------------------------//

public class TestAccount {
    public static void main(String[] args) {

        double testSold = 10000;

        Account currentSold = new Account(testSold); // check balance
        currentSold.balance();

        Account depositTest = new Account(testSold); //add to balance
        depositTest.deposit(1400);
        System.out.println(depositTest);

        Account withdrawTest = new Account(testSold); //withdraw from balance
        withdrawTest.withdraw(9970);
        System.out.println(withdrawTest);

        Account withdrawTest2 = new Account(testSold); //withdraw amount exceeds balance
        withdrawTest2.withdraw(10100);
        System.out.println(withdrawTest);

        Account withdrawTest3 = new Account(testSold); //withdraw does not leave minimum balance of 30 euros
        withdrawTest3.withdraw(9971);
        System.out.println(withdrawTest);

    }
}
