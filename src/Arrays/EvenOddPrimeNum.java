package Arrays;

public class EvenOddPrimeNum {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        int even=0;
        int odd=0;

        for (int i=0;i<arr.length; i++){
            if (arr[i]%2==0){
                even=arr[i];
                //System.out.println("This number is even : "+even);
            }
            else {
                odd=arr[i];
            }
        }
        System.out.println("This number is even : "+even);
        System.out.println("This number is odd : "+odd);
    }
}
