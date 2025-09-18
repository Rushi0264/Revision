package Assisment;
//6. Write a program to print reverse alphabets from Z to A
public class ReverseAlphabets{
    public static void main(String[] args) {
        System.out.println("Reverse alphabets from Z to A..!");
        for (char ch='Z'; ch>='A'; ch--){
            System.out.print(" "+ch);
        }
    }
}
