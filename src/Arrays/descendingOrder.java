package Arrays;

public class descendingOrder {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,1,8,9};

        System.out.print("Original order of array : ");
        for (int i=0;i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Array sort in ascending order : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Array sort in descending order : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
