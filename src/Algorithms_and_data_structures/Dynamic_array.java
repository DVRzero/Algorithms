package Algorithms_and_data_structures;

import java.util.Arrays;

public class Dynamic_array {

    static int[] arr = {1, 2, 3, 4, 5};
    static int[] tempArr1;
    static int[] tempArr2;

    public static void main(String[] args) {
        System.out.println(arr.length);
        addDigit(4);
        System.out.println(tempArr1.length);
        System.out.println(tempArr1[tempArr1.length-1]);

        removeDigit(0);
        System.out.println(Arrays.toString(tempArr2));
    }

    public static int[] addDigit(int newDigit) {
        tempArr1 = Arrays.copyOf(arr, arr.length + 1);
        tempArr1[tempArr1.length-1] = newDigit;
        return tempArr1;
    }

    public static int[] removeDigit(int index) {
        tempArr2 = Arrays.copyOfRange(arr, arr[0], index-1);
        tempArr2 = Arrays.copyOfRange(arr, index+1, arr.length);
        return tempArr2;
    }

}
