package by.epamtc.task3.arrays;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = {2, 5, -6, -8, 9, 8, -8, 5, 8, -8, 3, -1};
        int min = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
                count = 1;
            }
            if (arr[i] == min) {
                count++;
            }
        }

        int[] newArr = new int[arr.length - count + 1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - min > 0) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
