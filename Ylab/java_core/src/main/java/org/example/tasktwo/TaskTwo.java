package org.example.tasktwo;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        int[] arr2 = new int[]{1, 1, 1, 9, -9, 9, 55, 55, 55, 2, -7, 4, 1, 5, 6, 98, 8, 8, 8, 888888, 123};
        int[] arr3 = new int[]{0, 0, '0', 0, '4', 0, 0, 50, 0, 0, 0, 0, 110, 0, 1};
        int[] arr4 = new int[]{};
        TaskTwo.insertionSort(arr);
        TaskTwo.insertionSort(arr2);
        TaskTwo.insertionSort(arr3);
        TaskTwo.insertionSort(arr4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
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
    }
}
