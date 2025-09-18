package Assisment;

import java.util.Scanner;

//Write a program to find the value of one number raised to the power of another
public class FindValueOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number how many times multiple above number : ");
        int num2 = sc.nextInt();

        long res = 1;
        for (int i=1; i<=num2; i++){
            res *=num1;
        }
        System.out.println(num1 + " raised to the power of " + num2 + " is: " + res);

    }
}
