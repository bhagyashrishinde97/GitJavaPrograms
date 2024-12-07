package Array;

import java.util.Arrays;

public class Commonanduncommon
{
    public static void main(String[]args)
    {
        int arr1[]={50,90,78,50,66};
        int arr2[]={55,90,75,40,62};
        int arr3[]={58,90,74,60,86,99};

        System.out.println("Sort the string"+Arrays.toString(arr1));
        System.out.println("Sort the string"+Arrays.toString(arr2));
        System.out.println("Sort the string"+Arrays.toString(arr3));
        int arr4[]=new int[6];

        boolean flag=false;
        for(int i=0;i<arr1.length;i++) {
            if (arr1[i] == arr2[i] && arr1[i] == arr3[i] && arr2[i] == arr3[i]) {
                System.out.println(" " + arr1[i]);
                flag = false;
            } else {
                flag = true;
            }
        }
        if(flag) {
            System.out.println("No common element in the three respective array.."+Arrays.toString(arr4));
        }
        System.out.println("Common element in the array: " +Arrays.toString(arr4));

            }
        }





