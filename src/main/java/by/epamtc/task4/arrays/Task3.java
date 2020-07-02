package by.epamtc.task4.arrays;

public class Task3 {

    public static void main(String[] args) {
        int n = 16;
        int[][] numArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i < n / 2) {

                    if (i == 0) {
                        numArr[i][j] = 1;
                    } else if (j < i || n - i <= j) {
                        numArr[i][j] = 0;
                    } else {
                        numArr[i][j] = 1;
                    }

                } else {

                    if (i == n - 1) {
                        numArr[i][j] = 1;
                    } else if (j > i || j < n - 1 - i) {
                        numArr[i][j] = 0;
                    } else {
                        numArr[i][j] = 1;
                    }

                }
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
