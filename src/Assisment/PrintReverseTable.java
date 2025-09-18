package Assisment;

//4. Write a program to print reverse tables

import java.util.Scanner;

public class PrintReverseTable {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter number for table in reverse form : ");
        int num = sc.nextInt();
        System.out.println(num+" Table in reverse form..!");

        for (int i=10;i>=1;i--){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
