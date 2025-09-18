package Assisment;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
import java.util.Scanner;

public class CountOfPosNegZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zeros = 0;
        int num;

        System.out.println("Enter numbers (enter 999 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == 999) {
                break;
            }

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.println("\nResults:");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}
