package SolveQuestions;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Numbers before swap : "+num1+" "+num2);

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Numbers after swap : "+num1+" "+num2);
    }
}
