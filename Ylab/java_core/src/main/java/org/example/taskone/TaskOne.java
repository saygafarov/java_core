package org.example.taskone;

public class TaskOne {
    public static void main(String[] args) {

        int[][] arr = TaskOne.twoDimensionalArr();
        TaskOne.showTwoDimensionalArr(arr);
        System.out.println("Max value in array: " + getMaxValue(arr));
        System.out.println("Min value in array: " + getMinValue(arr));
        System.out.println("Average value in array: " + getAverageValue(arr));

    }

    public static int[][] twoDimensionalArr() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random();
            }
        }
        return arr;
    }

    private static int random() {
        long rangeStart = 0L;
        long rangeEnd = 100L;
        long currentTime = System.nanoTime();

        return (int) (rangeStart + currentTime % (rangeEnd - rangeStart));
    }

    private static void showTwoDimensionalArr(int[][] arr) {
        for (int[] ints : arr) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int getMaxValue(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int num : ints) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    private static int getMinValue(int[][] arr) {
        int min = arr[0][0];
        for (int[] ints : arr) {
            for (int num : ints) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }

    private static int getAverageValue(int[][] arr) {
        int counter = 0;
        int sum = 0;
        for (int[] ints : arr) {
            for (int num : ints) {
                sum += num;
                counter++;
            }
        }
        return sum / counter;
    }
}
