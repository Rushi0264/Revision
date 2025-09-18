package Assisment;
import java.util.Scanner;

//2. Write a program to print all natural numbers in reverse

public class NaturalNumbersReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Natural numbers in reverse from "+n+" 1");

        for (int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}
