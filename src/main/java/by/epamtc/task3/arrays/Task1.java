package by.epamtc.task3.arrays;

public class Task1 {

    public static void main(String[] args) {
        double[] arr = {2.1, 5.3, -6, -8, 9.3, 8.4, 10, 5.3, 8.8, 6.2, 3.3, -1};
        double sum;
        double maxSum = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            sum = arr[i] + arr[arr.length - i - 1];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
