package Assisment;
//Write a program to print all odd number between 1 to 100
public class PrintOddNum {
    public static void main(String[] args) {
        System.out.println("All odd numbers between 1 to 100..!");
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.print(" "+i);
            }
        }
    }
}
