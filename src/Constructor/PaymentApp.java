package Constructor;

import java.util.Scanner;

class DepositWithdraw {

    private double balance = 4500;
    Scanner sc = new Scanner(System.in);

    static {
        System.out.println("Welcome to SBI..!");
    }

    DepositWithdraw() {
        System.out.println("Account balance is : " + balance);
    }

    void deposit() {
        System.out.print("Enter deposit amount : ");
        double deposit = sc.nextDouble();
        balance = balance + deposit;
        System.out.println("Balance after deposit : " + balance);
    }

    void withdraw() {
        System.out.print("Enter withdraw amount : ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Balance after withdraw : " + balance);
        } else {
            System.out.println("Insufficient balance..!");
        }
    }

    void checkBalance() {
        System.out.println("Current balance : " + balance);
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepositWithdraw obj = new DepositWithdraw();

        while (true) {
            System.out.println("\n===== SBI Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with SBI!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
