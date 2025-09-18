package Assisment;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("All natural numbers from 1 to "+num+"..!");
        for (int i=1;i<=num;i++){
            System.out.print(" "+i);
            sum+=i;
        }
        System.out.println();
        System.out.println("Sum of all natural numbers : "+sum);
    }
}
