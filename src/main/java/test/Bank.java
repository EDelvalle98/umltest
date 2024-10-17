package test;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank(){
        customers = new ArrayList<>();
    }
 public void addCustomer(Customer customer){
        customers.add(customer);
 }
 public ArrayList<Customer> getCustomers(){
        return customers;
 }

 public void printAllCustomersAccountInfo(){
for (Customer customer: customers){
    System.out.println(customer.getAccount().printAccountInfo());
}
        }
 }


