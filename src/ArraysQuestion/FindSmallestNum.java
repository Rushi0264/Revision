package ArraysQuestion;

public class FindSmallestNum {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6,2,1};
        int small = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
