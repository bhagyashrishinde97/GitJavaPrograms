package Array;

public class AverageValue {
    public static void main(String[] args) {
        int arr[]={100,700,400,600,800};
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            avg=sum/arr.length;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
