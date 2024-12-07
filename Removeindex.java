package Array;

import java.util.Arrays;

public class Removeindex {
//    public static void main(String[] args) {
//        int arr[] = {10, 20, 30, 40, 50, 60};
//        System.out.println(Arrays.toString(arr));
//        int removeIndex = 2;
//        for (int i = removeIndex; i < arr.length - 1; i++) {
//            //
//            // arr[i] = arr[i + 1];
//            if (i == removeIndex) {
//                continue;
//
//
//        }
public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50, 60};
    System.out.println("Original Array: " + Arrays.toString(arr));
    int removeIndex = 2; // Index of the element to be removed

    // Create a new array with one less element
    int[] newArr = new int[arr.length - 1];

    // Copy elements from the original array, skipping the element at removeIndex
    for (int i = 0, j = 0; i < arr.length; i++) {
        if (i == removeIndex) {
            continue; // Skip the element to be removed
        }
        newArr[j++] = arr[i];
    }

    System.out.println("Array after removal: " + Arrays.toString(newArr));
}
}

