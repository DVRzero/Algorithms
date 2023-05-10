package Algorithms_and_data_structures;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] arr, int targetNum) {
        int low = 0;
        int high = arr.length - 1;
        int currentNum = 0;

        while (arr[currentNum] != targetNum) {
            currentNum = (low + high) / 2;
            if (targetNum < arr[currentNum]) {
                high = currentNum - 1;
                continue;
            }

            if (targetNum > arr[currentNum]) {
                low = currentNum + 1;
                continue;
            }
        }
        return currentNum;
    }
}

// бинарный поиск в отсортированном массиве. При увеличении кол-ва элементов в двое добавляется еще одна итерация
