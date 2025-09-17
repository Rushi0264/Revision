package Arrays;

public class FindDuplicateNum {
    public static void main(String[] args) {
        int[] arr={12,22,22,34,55,34};
        int duplicate[]=new int[arr.length];

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    duplicate[i] = arr[i];
                    System.out.println(duplicate[i]);
                }
            }
        }
    }
}
