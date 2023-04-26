package Basics_of_programming;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size1 = scan.nextInt();
        int size2 = scan.nextInt();

        int[][] array = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                array[i][j] = (int) Math.pow(2, i + j);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
