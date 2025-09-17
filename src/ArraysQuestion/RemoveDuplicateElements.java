package ArraysQuestion;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {12, 34, 34, 56, 65, 76, 12};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
