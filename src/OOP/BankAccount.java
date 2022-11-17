package OOP;

public class BankAccount {
    // program files = we define the logic behind a bank account

    // OOP = Object Oriented Programming

    // a class is like a blueprint - like Human DNA
    // ex: Class Car

    // an object = the instance of a class, the implementation - like the Human
    // Ex: Object type Car

    // fields = proprieties = attributes
    // Ex: color, name, brand, model, range,  price

    // methods = actions made by objects


    // proprieties == attributes == fields
    String accountOwner;
    String iban;
    double balance = 0;
    boolean active = false;
    private int pin_code = 1234;
    int wrong_tries = 0;
    // constructor


    public BankAccount(String accountOwner, String iban) {
        this.accountOwner = accountOwner;
        this.iban = iban;
    }

    // methods = actions of the class

    public void describeAccount() {
        System.out.println("Owner " + this.accountOwner);
        System.out.println("IBAN " + this.iban);
        System.out.println("Balance " + this.balance);
        System.out.println("Active " + this.active);
        System.out.println("Wrong tries number " + this.wrong_tries);
        System.out.println("________________________________");
    }

    public void accountActivation(int ownerPinCode) {
        // modifies active status in true just if the pin code is correct
        System.out.println("Hello " + this.accountOwner);
        if (ownerPinCode == this.pin_code) {
            System.out.println("Successfully activated");
            this.active = true;
        } else {
            System.out.println("Wrong pin code");
            this.wrong_tries++; // increment
        }
    }
    public void depositMoney(double deposit_money) {
        // this.balance + deposit_money
        this.balance = this.balance + deposit_money;
        System.out.println("Hello " + this.accountOwner);
        System.out.println("You just deposit with success " + deposit_money + " dollars" + " --> Your current balance is " + this.balance);
    }
    public void withdrawMoney(double withdraw_money) {
        System.out.println("Hello " + this.accountOwner);
        if (withdraw_money <= this.balance) {
            this.balance = this.balance - withdraw_money;
            System.out.println("You just withdraw " + withdraw_money);
            System.out.println("Your current balance is " + this.balance);
        } else {
            System.out.println("Card denied. Insufficient money!");
        }
        
    }
}

