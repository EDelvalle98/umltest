package test;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Checking checkingAccount1 = new Checking();
        Customer customer1 = new Customer("Efrain","Delvalle",checkingAccount1);

        bank.addCustomer(customer1);

        checkingAccount1.deposit(2000.00);
        checkingAccount1.withdraw(100.00);
        checkingAccount1.withdraw(50.00);
        checkingAccount1.deposit(60.00);
        checkingAccount1.deposit(-1.00);

        System.out.println();

        Savings savings = new Savings();
        Customer customer2 = new Customer("John","Doe",savings);

        bank.addCustomer(customer2);

        savings.deposit(500);
        savings.withdraw(1000000);
        savings.withdraw(100);

        System.out.println();

        Checking checking2 = new Checking();
        Customer customer3 = new Customer("Steph","Curry",checking2);

        bank.addCustomer(customer3);

        checking2.deposit(1000);
        checking2.withdraw(100);

        System.out.println();

        bank.printAllCustomersAccountInfo();

        System.out.println();

        Account.printTotalNumberOfAccounts();


    }
}
