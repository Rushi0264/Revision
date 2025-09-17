package Revise;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
            }
        }
        else {
            System.out.println("Invalid Input..!");
        }
    }
}
