package ArraysQuestion;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int a =3;
        boolean found = false;

        for (int i=0; i<arr.length; i++){
            if (arr[i]==a){
                System.out.println("Element found : "+a);
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Element not found");
        }
    }
}
