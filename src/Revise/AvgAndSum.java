package Revise;

public class AvgAndSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        //double avg=0;

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        double avg = (double) sum/arr.length;
        System.out.println("Average of "+sum+" : "+avg);
    }
}
