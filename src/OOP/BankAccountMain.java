package OOP;

public class BankAccountMain {
    public static void main(String[] args) {
        // desktop

        // initialize objects as BankAccount types
        // instances of BankAccount Class

        BankAccount account1 = new BankAccount("Banciu Darius", "RO00102342");
        BankAccount account2 = new BankAccount("Popescu Andrei", "RO3424242423");
//        System.out.println("Owner " + account1.accountOwner);
//        System.out.println(account1.iban);
//        System.out.println(account1.balance);
//        System.out.println(account1.active);
        //account1.describeAccount(); // upper but shorter
//        System.out.println("Owner " + account2.accountOwner);
//        System.out.println(account2.iban);
//        System.out.println(account2.balance);
//        System.out.println(account2.active);
        //account2.describeAccount(); // upper but shorter

        //activate the accounts

        account1.accountActivation(1234);
        account2.accountActivation(1235);

        // deposit
        account1.depositMoney(300.50);
        account2.depositMoney(700);
        account2.depositMoney(300);

        // negative testing, withdraw more than you have
        account1.withdrawMoney(500); // Hello Banciu Darius.  Card denied. Insufficient money!
       // positive testing with exact sum of money
        account1.withdrawMoney(300.5);// Hello Banciu Darius.  You just withdraw 300.5. Your current balance is 0.0
        // positive x2
        account2.withdrawMoney(200);
        account2.withdrawMoney(200);

        // accounts details
        account1.describeAccount();
        account2.describeAccount();








        }
    }

