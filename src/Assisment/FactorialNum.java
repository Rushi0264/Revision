package Assisment;

import java.util.Scanner;

// Write a program to find the factorial value of any number
public class FactorialNum {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial : ");
        int num = sc.nextInt();
        for (int i=num; i>=1;i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
