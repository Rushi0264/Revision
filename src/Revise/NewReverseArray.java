package Revise;

import java.lang.reflect.Array;

public class NewReverseArray {
    public static void main(String[] args) {
        int[] arr={123,456,789,987,654,321};
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+", ");
        }
    }
}
