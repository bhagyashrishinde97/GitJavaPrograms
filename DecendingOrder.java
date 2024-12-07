package Array;

import java.util.Arrays;

public class DecendingOrder {
    public static void main(String[] args) {
        int a[]={77,99,49,77,66,98};
        Arrays.sort(a);
        for(int i=a.length-1;i>0;i--)
        {
            System.out.print(a[i]+",");
        }
    }
}
