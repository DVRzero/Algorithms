package Basics_of_programming;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Число Фибоначчи: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // int result  = fibonacci(n - 1 + n - 2);
        int firstFibNum = fibonacci(n - 1);
        int secondFibNum = fibonacci(n - 2);
        int result = firstFibNum + secondFibNum;
        return result;
    }
}

// 0 1 1 2 3 5 8 13 21 34 55 ...

