package Assisment;
//7. Write a program to print all even numbers between 1 to 100

public class PrintEvenNum {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100..!");
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.print(" "+i);
            }
        }
    }
}
