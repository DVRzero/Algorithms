package Algorithms_and_data_structures.binarysearch;

public class BinarySearch {
    public int searchIndex(int[] arr, int targetNum) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int currentIndex = 0;

        while (arr[currentIndex] != targetNum) {
            currentIndex = (firstIndex + lastIndex) / 2;
            if (targetNum < arr[currentIndex]) {
                lastIndex = currentIndex - 1;
                continue;
            }

            if (targetNum > arr[currentIndex]) {
                firstIndex = currentIndex + 1;
                continue;
            }
        }
        return currentIndex;
    }
}

// бинарный поиск в отсортированном массиве. При увеличении кол-ва элементов в двое добавляется еще одна итерация
