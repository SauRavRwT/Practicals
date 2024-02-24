// To implement the following algorithm using an array as a data structure and analyze its time complexity.
// MergeSort
// Time Complexity:
// Best Case: O(n log n)
// Average Case: O(n log n)
// Worst Case: O(n log n)

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        System.arraycopy(array, 0, left, 0, middle);
        System.arraycopy(array, middle, right, 0, array.length - middle);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        mergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

// QuickSort
// Time Complexity:
// Best Case: O(n log n)
// Average Case: O(n log n)
// Worst Case: O(n^2) (for the pivot selection strategy implemented here)

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}


// HeapSort
// time complexity: 
// best, average, worst case: O(n log n)

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
  
        
// BubbleSort
// Time Complexity:
// Best Case: O(n) (when the array is already sorted)
// Average Case: O(n^2)
// Worst Case: O(n^2)

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        bubbleSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}


// SelectionSort
// Time Complexity:
// Best Case: O(n^2)
// Average Case: O(n^2)
// Worst Case: O(n^2)

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        selectionSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
