// To implement Sorting Network.
// time complexity: O(n log^2 n)

public class SortingNetwork {
    public static void bitonicSort(int[] arr, int low, int count, boolean direction) {
        if (count > 1) {
            int k = count / 2;

            // Bitonic sort in ascending order
            bitonicSort(arr, low, k, true);

            // Bitonic sort in descending order
            bitonicSort(arr, low + k, k, false);

            // Merge the two sorted halves
            bitonicMerge(arr, low, count, direction);
        }
    }

    public static void bitonicMerge(int[] arr, int low, int count, boolean direction) {
        if (count > 1) {
            int k = count / 2;

            for (int i = low; i < low + k; i++) {
                compareAndSwap(arr, i, i + k, direction);
            }

            bitonicMerge(arr, low, k, direction);
            bitonicMerge(arr, low + k, k, direction);
        }
    }

    public static void compareAndSwap(int[] arr, int i, int j, boolean direction) {
        if ((arr[i] > arr[j] && direction) || (arr[i] < arr[j] && !direction)) {
            // Swap the elements if they are in the wrong order
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        int n = arr.length;

        // The array size should be a power of 2
        if ((n & (n - 1)) != 0) {
            System.out.println("Array size should be a power of 2");
            return;
        }

        boolean direction = true; // true for ascending, false for descending
        bitonicSort(arr, 0, n, direction);

        System.out.println("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
