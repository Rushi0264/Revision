package Assisment;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digits : ");
        int num = sc.nextInt();
        int sum=0;
        while (num>0){
            int digits = num%10;
            sum=sum+digits;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
