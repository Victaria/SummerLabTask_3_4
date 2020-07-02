package by.epamtc.task4.arrays;

public class Task1 {

    public static void main(String[] args) {
        int[][] numArr = new int[10][10];
        int i = 0;

        while (i < 9) {
            for (int j = 0; j < 10; j++) {
                numArr[i][j] = j + 1;
                numArr[i + 1][10 - j - 1] = j + 1;
            }
            i += 2;
        }

        printArray(numArr);
    }

    public static void printArray(int[][] numArr) {
        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                System.out.print(numArr[k][l] + "  ");
            }
            System.out.println("  ");
        }
    }
}
