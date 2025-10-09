package Encapsulation;

abstract class Bank{
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    //abstract double getBalance();
}

class Account extends Bank{
    private double balance;

    public Account(double balance){
        this.balance=balance;
        System.out.println("Available balance : "+balance);
    }

    //@Override
    public double getBalance(){
        return balance;
    }

    @Override
    public void deposit(double amount){
        if (amount > 0) {
            balance+=amount;
            System.out.println("Deposited amount : "+amount);
        }
        else {
            System.out.println("Invalid deposited amount.!");
        }
    }

    @Override
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance-=amount;
            System.out.println("Withdrawable amount : "+amount);
        }else {
            System.out.println("Insufficient balance or Invalid amount..!");
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Account obj = new Account(5000);
        obj.deposit(2000);
        obj.withdraw(100);
        System.out.println("Current balance : "+obj.getBalance());
    }
}
