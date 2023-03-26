

public class ArraySort {
    public static void main(String[] args) {

        int arr[] = {1, 4, 5, 3, 8, 9, 6};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int el : arr) {
            System.out.println(el);
        }

    }
}