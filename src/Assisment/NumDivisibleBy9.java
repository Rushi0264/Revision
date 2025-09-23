package Assisment;

public class NumDivisibleBy9 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        System.out.println("Numbers divisible by 9 between 100 to 200..!\n");

        for (int i=100;i<=200;i++){
            if (i %9 == 0){
                System.out.println("Print the number : "+i);
                sum+=i;
                count++;
            }
        }
        System.out.println("\nSum of numbers divisible by 9 : "+sum);
        System.out.println("Total numbers divisible by 9 : "+count);
    }
}
