package Revise;
import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9,0};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        /*System.out.println();
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }*/
    }
}