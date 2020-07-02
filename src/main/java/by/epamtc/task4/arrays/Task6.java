package by.epamtc.task4.arrays;

public class Task6 {

    public static void main(String[] args) {
        int n = 7;
        int[][] magicSquare = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n) {
                    j = 0;
                }

                if (i < 0) {
                    i = n - 1;
                }
            }

            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                magicSquare[i][j] = num++;

            j++;
            i--;
        }

        printArray(magicSquare, n);
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
