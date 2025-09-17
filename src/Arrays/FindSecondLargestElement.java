package Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr={12,3,4,5,67,7};

        for (int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}


class abc{
    public static void main(String[] args) {
        int[] arr={12,3,4,5,67,7};

        int i=0;
        while (i< arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }
}

class a{
    public static void main(String[] args) {
        int[] arr={12,3,4,5,67,7};
        int i=0;
        do {
            System.out.println(arr[i]);
            i++;
        }
        while (i<arr.length);
    }
}

class b{
    public static void main(String[] args) {
        int[] arr={12,3,4,5,67,7};
        for (int i=0;i<arr.length;++i){
            System.out.println(arr[i]);
        }
    }
}

class doWhile{
    public static void main(String[] args) {
        int no=1;
        do {
            System.out.println("Hello");
        }
        while (no<=5);
    }
}

class While{
    int battery=100;

}