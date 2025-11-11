package SolveQuestions;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Prime or not : ");
        int num = sc.nextInt();
        boolean isPrime=true;

        if (num<=1){
            isPrime=false;
        }else {
            for (int i=2; i <= num/2; i++){
                if (num % i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("Number is prime :"+num);
        }else {
            System.out.println("Number is not a prime :"+num);
        }
    }
}
