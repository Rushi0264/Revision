package Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,9,8,6};

        System.out.print("Original array : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.print("Reverse array : ");
        for (int i= arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
