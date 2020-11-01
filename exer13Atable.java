import java.until.*;
import java.util.Scanner;

public class exer13Atable {
    public static Scanner inp;
    public static int rowUsed;
    public static int colUsed;

    public static void getTable(int[][] T) {
        System.out.print("Enter the Row #");
        rowUsed = inp.nextInt();
        System.out.print("Enter the Col #");
        colUsed = inp.nextInt();

        for (int i = 0; i < rowUsed; i++) {
            for (int j = 0; j < colUsed; j++) {
                System.out.print("Enter data at [" + i + "][" + j + "] : ");
                T[i][j] = inp.nextInt();
            }
        }
    }

    public static void printTable(int[][] T) {

        for (int i = 0; i < T.length; i++) {

            for (int j = 0; j < T[i].length; j++) {

                System.out.print(T[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] table;
        table = new int[3][4];
        inp = new Scanner(System.in);
        getTable(table);
        printTable(table);

        System.out.println("The Largest value in the table is " + FindLarge(table));

        printSumForAll(table);

        while (true) {
            System.out.print("Enter the column you desire to sum : ");
            int col = inp.nextInt();
            if (col == -1)
                break;

            System.out.println("Sumation is : " + sumColumn(table, col));
        }

    }

    public static int FindLarge(int[][] T) {
        int max = 0;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                if (T[i][j] > max)
                    max = T[i][j];
            }
        }

        return max;
    }

    public static int sumColumn(int[][] A, int col) {

        int sum = 0;
        for (int j = 0; j < A.length; j++) {
            sum = sum + (A[j][col - 1]);
        }
        return sum;
    }

    public static void printSumForAll(int[][] T) {
        for (int i = 1; i <= T[0].length; i++) {
            System.out.println("Sum of Column " + i + " is " + sumColumn(T, i));
        }
    }
}