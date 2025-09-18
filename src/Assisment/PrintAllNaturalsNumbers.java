package Assisment;
//Write a program to print all natural numbers from 1 to n

import java.util.Scanner;

public class PrintAllNaturalsNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        System.out.println("All natural numbers from 1 to "+n);

        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
