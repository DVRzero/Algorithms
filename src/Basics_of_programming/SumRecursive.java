package Basics_of_programming;

import java.util.Scanner;

public class SumRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
}

// base step - Базис рекурсии – условие выхода из блока рекурсивных вызовов – базисное решение задачи, при условиях, когда нет необходимости вызывать рекурсию.
// recursion step - Шаг рекурсии – вызов функцией самой себя при изменении параметров.
