package org.example.tasktwo;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        TaskTwo.insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        TaskTwo.testInsertionSort();

    }

    public static int[] insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        for (var i = 1; i < arr.length; i++) {
            var current = arr[i];
            var j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    private static void testInsertionSort() {
        int[] arr1 = new int[]{5, 6, 3, 2, 5, 1, 4, 8};
        int[] arr2 = new int[]{1, 1, 1, 9, -9, 9, 55, 55, 55, 2, -7, 4, 1, 5, 6, 98, 8, 8, 8, 888888, 123};
        int[] arr3 = new int[]{0, 0, '0', 0, '4', 0, 0, 50, 0, 0, 0, 0, 110, 0, 1};
        int[] arr4 = new int[]{};

        assert (Arrays.equals(TaskTwo.insertionSort(arr1), new int[]{1, 2, 3, 4, 5, 5, 6, 8}));
        assert (Arrays.equals(TaskTwo.insertionSort(arr2), new int[]{-9, -7, 1, 1, 1, 1, 2, 4, 5, 6, 8, 8, 8, 9, 9, 55, 55, 55, 98, 123, 888888}));
        assert (Arrays.equals(TaskTwo.insertionSort(arr3), new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 48, 50, 52, 110}));
        assert (Arrays.equals(TaskTwo.insertionSort(arr4), new int[]{}));

    }
}
