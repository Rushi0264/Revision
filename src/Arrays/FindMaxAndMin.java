package Arrays;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {110,20,300,40,50};
        int max=arr[0];
        int min=arr[0];

        for (int i=0;i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

        for (int i=0;i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
