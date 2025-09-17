package ArraysQuestion;

public class SumOfAllElements {
    public static void main(String[] args) {
        int[] arr = {12,34,5,6,7,8};
        int sum=0;

        for (int i=0 ;i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
