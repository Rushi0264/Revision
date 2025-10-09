package CovariantReturnType;

class Bank{
    Bank getBank(){
        System.out.println("Welcome to Bank..!");
        return this;
    }
}
class SBI extends Bank{
    SBI getBank(){
        System.out.println("Welcome to SBI..!");
        return this;
    }

    void rateOfInterest(){
        System.out.println("Rate of interest 6.5%");
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.getBank();

        SBI obj1 = new SBI();
        obj1.getBank().rateOfInterest();

        Bank obj2 = new SBI();
        obj2.getBank();
    }
}
