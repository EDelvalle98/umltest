package test;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final Account account;

    public Customer (String firstName, String lastname, Account account){
        this.firstName = firstName;
        this.lastName = lastname;
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

}
