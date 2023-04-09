package Algorithms_and_data_structures;

public class InsertSort {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 8, 9, 6};
        int index;
        int currentNumber;

        for (int i = 1; i < arr.length; i++) {
            index = i;
            currentNumber = arr[i];

            while (index > 0 && currentNumber < arr[index-1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = currentNumber;
        }

        for (int el : arr) {
            System.out.println(el);
        }
    }
}

// сложность O(n^2)


