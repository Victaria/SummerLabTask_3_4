package by.epamtc.task4.arrays;

public class Task4 {

    public static void main(String[] args) {
        int n = 10;
        int[][] numArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            numArr[0][i] = i + 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {

                numArr[i][j] = (int) Math.pow(numArr[0][j], i + 1);
            }
        }

        printArray(numArr, n);
    }

    public static void printArray(int[][] numArr, int n) {

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {

                System.out.print(numArr[k][l] + "  ");
            }
            System.out.println("  ");
        }
    }
}
