package Array;

import java.util.Arrays;

public class Commonelement {
    public static void main(String[] args) {

        int arr1[] = {10, 20, 86, 36};
        int arr2[] = {11, 20, 66, 55, 65};
        int arr3[] = {12, 20, 80, 60};
        int arr4[] = new int[5];
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                for (int k = 0; k < arr3.length; k++)
                {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
                    {


                        System.out.println(arr1[i]);
                        arr4[i]=arr1[i];
                        arr4[i]=arr1[i];
                    }


                }
            }
        }
        System.out.println();
    }
}








