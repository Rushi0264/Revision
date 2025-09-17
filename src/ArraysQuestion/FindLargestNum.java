package ArraysQuestion;

public class FindLargestNum {
    public static void main(String[] args) {
        int[] arr = {12,34,5,6,788,54,33};
        int large = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
