class Account{
    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
        System.out.println("Account holder name is : "+getAccountHolder());
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Account balance is : "+getBalance());
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount>0) {
            balance = balance + amount;
            System.out.println("Deposit amount is " + amount + " balance after deposit " + getBalance());
        }
        else {
            System.out.println("Enter valid amount..");
        }
    }

    public void withdraw(double amount){
        if(amount > 0) {
            balance = balance - amount;
            System.out.println("Withdrawable amount is " + amount + " balance after withdraw" + getBalance());
        }
        else {
            System.out.println("This is not withdrawable amount..");
        }
    }
}

public class bankApp {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountHolder("Rushikesh");
        account.setBalance(3000);
        account.deposit(10000);
        account.withdraw(2000);
        account.deposit(7000);
    }
}
