package Arrays;

public class FindLargeAndSmall {
    public static void main(String[] args) {
        int[] arr= {12,3,4,5,67,7};
        int large = arr[0];
        int small = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i]>large){
                large = arr[i];
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]<small){
                small = arr[i];
            }
        }

        System.out.println(large);
        System.out.println(small);
    }
}
