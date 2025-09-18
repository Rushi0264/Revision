package Assisment;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        int oddSum=0;
        System.out.println("Sum of odd numbers..!");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Sum of all odd numbers from 1 to "+num+"..!");

        for (int i=1;i<=num;i++){
            if(i%2!=0){
                oddSum+=i;
            }
        }
        System.out.println("Sum of all numbers : "+oddSum);
    }
}
