package StringClass;

import java.util.Scanner;

public class CheckEqual {
    public static void main(String[] args) {
        String id="Rushi";
        String password="rushi@123";
        int attempt=0, maxAttempt=3;
        Scanner sc = new Scanner(System.in);

        while (attempt < maxAttempt){
            System.out.print("Enter user id : ");
            String checkId = sc.next();
            System.out.print("Enter user password : ");
            String checkPass = sc.next();
            if (id.equals(checkId) && password.equals(checkPass)){
                System.out.println("Welcome\nLogin Successfully");
                break;
            }
            else {
                attempt++;
                System.out.println("Incorrect User id and Password.!\nTry again..!");
            }
        }

        if (attempt == maxAttempt){
            System.out.println("You have to reached maximum time attempt,\nTry after 24 hours..!\nSorry...!");
        }
    }
}
