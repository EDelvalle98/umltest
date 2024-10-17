package test;

public abstract class Account {
    private final int accountNumber;
    private static int counter;
    private double balance;

    public Account (){
        this.accountNumber = counter++;
        this.balance = 0;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getCounter() {
        return counter;
    }

    public abstract AccountType getAccountType();

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            double interest = getInterestRate(balance,amount);
            balance += (amount + interest);
            System.out.println("Deposited: $" + amount + ", Interest Added: $" + interest);
        } else {
            System.out.println("Invalid deposit. Cannot be negative.");
        }
    }

    public double getInterestRate(double balance, double amount){
        if (balance > 1000){
            return amount * 0.10;
        }else{
            return amount * 0.05;
        }
    }
    public double getTransactionFee(AccountType accountType){
        return 0;
    }
    public String printAccountInfo() {
        return "Account Type: " + getAccountType() + " Account\n" + "Account Number: " + accountNumber + "\n" + "Balance: $" + balance + " \n" ;
    }
    public static void printTotalNumberOfAccounts(){
        System.out.println("Total Number of Accounts: " + counter);
    }
}
