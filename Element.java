package Array;

import java.util.HashSet;
import java.util.Set;

public class Element {

        public static void main(String[] args) {
            int arr1[] = {50, 90, 78, 50, 66};
            int arr2[] = {55, 90, 75, 40, 62};
            int arr3[] = {58, 90, 74, 60, 86, 99};

            // Convert arrays to sets for easy comparison
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Set<Integer> set3 = new HashSet<>();

            // Add array elements to sets
            for (int num : arr1) set1.add(num);
            for (int num : arr2) set2.add(num);
            for (int num : arr3) set3.add(num);

            // Find common elements using retainAll method
            Set<Integer> common = new HashSet<>(set1);
            common.retainAll(set2);
            common.retainAll(set3);

            // Find all unique elements
            Set<Integer> allElements = new HashSet<>();
            allElements.addAll(set1);
            allElements.addAll(set2);
            allElements.addAll(set3);

            // Find uncommon elements by subtracting common elements from all elements
            Set<Integer> uncommon = new HashSet<>(allElements);
            uncommon.removeAll(common);

            System.out.println("Common elements in the arrays: " + common);
            System.out.println("Uncommon elements in the arrays: " + uncommon);
        }
    }

