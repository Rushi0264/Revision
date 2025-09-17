package Revise;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for get factorial of this number : ");
        int a=sc.nextInt();
        long fact=1;
        for (int i=1;i<=a;i++){
            fact *= i;
        }
        System.out.println("Factor of "+a+" : "+fact);
    }
}
