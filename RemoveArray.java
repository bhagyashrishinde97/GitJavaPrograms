package Array;

import java.util.Arrays;

public class RemoveArray {
    public static void main(String[] args) {
        int a[]={100,200,300,400,500};
        System.out.println(Arrays.toString(a));
         int removeIndex=3;
         for(int i=removeIndex;i<a.length-1;i++)
         {
              a[i]=a[i+1];

         }
        System.out.println(Arrays.toString(a));

    }
}
