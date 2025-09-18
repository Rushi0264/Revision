package Assisment;
//Write a program to print tables

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number of table you want : ");
        int num = sc.nextInt();
        System.out.println("Table of : "+num);
        for (int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
