package Basics_of_programming;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println(factorial(num));
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        int result = n * factorial(n - 1);
        return result;
    }
}
