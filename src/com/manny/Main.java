package com.manny;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields fo the account number, balance customer name, email and phone number
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow for the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdraw to complete if there are insufficient funds
        // You will want to create various code in the Main class (the class created by IntelliJ)
        // to confirm the code is working.
        // Add some System.out.println's in the two methods above as well

        Account mannysAccount = new Account("12345", 0.00, "Manny Aguilar", "manny@manny.com", "(714) 392-2122");

        mannysAccount.withdrawal(100.0);

        mannysAccount.deposit(50.0);
        mannysAccount.withdrawal(100.0);

        mannysAccount.deposit(51.0);
        mannysAccount.withdrawal(100.0);

        Account estellasAccount = new Account("Estella Aguilar", "estella@estella.com", "(714) 334-7999");
        System.out.println(estellasAccount.getNumber() + " name " + estellasAccount.getCustomerName());

        //Challenge!
        // Create a new class VipCustomer
        // It should have 3 fields: name, credit limit and email address
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation of intelliJ as setters won't be needed
        // test and confirm it works

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Manny", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Estella", 50000.00, "estella@estella.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
