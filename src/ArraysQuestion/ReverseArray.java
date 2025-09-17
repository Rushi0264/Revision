package ArraysQuestion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,90,100};

        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
