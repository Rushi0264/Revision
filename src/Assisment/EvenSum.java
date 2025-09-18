package Assisment;

import java.util.Scanner;

// Write a program to find sum of all even numbers between 1 to n
public class EvenSum {
    public static void main(String[] args) {
        int evenSum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Sum of Even number from 1 to "+num+"..!");

        for (int i=1;i<=num;i++){
            if (i%2==0){
                evenSum+=i;
            }
        }
        System.out.println("Sum of even number between them : "+evenSum);
    }
}
