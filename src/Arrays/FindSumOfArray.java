package Arrays;

public class FindSumOfArray {
    public static void main(String[] args) {
        int[] arr= {12,3,4,5,67,7};
        int sum=0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            //sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
