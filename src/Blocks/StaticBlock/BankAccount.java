package Blocks.StaticBlock;

class SBI {
    static String bankName;
    int accountBalance;

    static {
        bankName="SBI";
        System.out.println("Bank initialize : "+bankName);
    }

    {
        accountBalance=1000;
        System.out.println("Account balance set : "+accountBalance);
    }

    void deposit(int depo){
        accountBalance+=depo;
        System.out.println("Deposit amount : "+depo);
        System.out.println("Balance after deposit : "+accountBalance);
    }

    void transaction() {
        {
            //normal block inside the method
            System.out.println("Transaction Started");
        }
        System.out.println("Transaction Completed");
    }
}

public class BankAccount {

    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.deposit(5000);
        obj.transaction();
    }

}
