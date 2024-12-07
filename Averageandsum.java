package Array;

public class Averageandsum {
    public static void main(String[] args) {
        int arr[]={100,200,300,400,500};
        int sum=0;
        int avg=0;
       for(int i=0; i<arr.length;i++)
       {
           sum=sum+arr[i];
           avg=sum/arr.length;
       }
        System.out.println(sum);
        System.out.println(avg);
    }
}
