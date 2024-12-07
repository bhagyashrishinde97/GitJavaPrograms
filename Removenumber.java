package Array;

import java.util.Arrays;

public class Removenumber {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(a));

        int removeIndex=1;
        int  newa[]= new int[a.length-1];
        /*for(int i=0; j=0; i <a.length;i++)
        {

                if (i == removeIndex) {
                    continue;
                }
                newa[j++] = a[i];
            }
        System.out.println(Arrays.toString(newa));
            }
        }*/

        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == removeIndex) {
                continue; // Skip the element to be removed
            }
            newa[j++] = a[i];
        }

        System.out.println("Array after removal: " + Arrays.toString(newa));
    }
}



