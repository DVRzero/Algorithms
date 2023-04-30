package Basics_of_programming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fibN = 0;

        int fib1 = 0;
        int fib2 = 1;

        if (n == 1) {
            System.out.println("Число Фибоначчи: " + fib1);
        } else if (n == 2) {
            System.out.println("Число Фибоначчи: " + fib2);
        } else {
            for (int i = 3; i <= n; i++) {
                fibN = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibN;
            }
            System.out.println("Число Фибоначчи: " + fibN);
        }
    }
}
