package ArraysQuestion;

public class SortArrayAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {23,4,2,1,6,7,9};

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
