package by.epamtc.task4.arrays;

public class Task5 {

    public static void main(String[] args) {
        int n = 3;
        int[][] firstArr = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] secondArr = new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] resultArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    resultArr[i][j] = resultArr[i][j] + firstArr[i][k] * secondArr[k][j];
                }
            }
        }

        printArray(resultArr, n);
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
