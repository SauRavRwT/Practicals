// to implement linear search and analyse its time complexity.
// LinearSearch
// Time Complexity:
// Best Case: O(1) (when the target is at the first position)
// Average Case: O(n)
// Worst Case: O(n) (when the target is at the last position or not present)

public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 42};
        int target = 16;

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Linear Search: Target found at index: " + index);
        } else {
            System.out.println("Linear Search: Target not found");
        }
    }
}


// BinarySearch
// Time Complexity:
// Best Case: O(1) (when the target is at the middle position)
// Average Case: O(log n)
// Worst Case: O(log n) (when the target is at an extreme end or not present)

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Target found, return index
            } else if (array[mid] < target) {
                left = mid + 1; // Discard the left half
            } else {
                right = mid - 1; // Discard the right half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 42};
        int target = 16;

        Arrays.sort(array); // Binary search requires a sorted array
        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Binary Search: Target found at index " + index);
        } else {
            System.out.println("Binary Search: Target not found");
        }
    }
}
