package Arrays;

public class FindMinMaxNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,64,6,8,9};
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number is : "+max);

        for (int i=0;i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number is : "+min);
    }
}
