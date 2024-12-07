package Array;

import java.util.Arrays;

public class AscendingOrderarray {
    public static void main(String[] args) {
        String a[] = {"Aditi", "Anjali", "Dipali", "Dakshta", "Sanjana" };
        //Ascendig Order
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {


            System.out.println(a [i]+ ",");
        }

    }
}