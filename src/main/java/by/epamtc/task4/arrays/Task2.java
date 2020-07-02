package by.epamtc.task4.arrays;

public class Task2 {

    public static void main(String[] args) {
        int[][] numArr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    numArr[i][j] = (i + 1) * (i + 2);
                } else {
                    numArr[i][j] = 0;
                }
            }
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
