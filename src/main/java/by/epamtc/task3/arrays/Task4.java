package by.epamtc.task3.arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] arr = {2, 5, -6, -8, 9, 8, -8, 5, 8, -15, 3, -1};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            } else {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println(min + " + " + max + " = " + (min + max));
    }
}
