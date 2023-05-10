package Algorithms_and_data_structures.binarysearch;

import Algorithms_and_data_structures.ArraySort;

import java.util.Arrays;

public class BinarySearchTest {
    public static void main(String[] args) throws Exception {
        shouldSearchIndexSuccess();
        shouldThrowArrayIndexOutOfBoundsExceptionWhenArrayIsEmpty();
    }

    public static void shouldSearchIndexSuccess() throws Exception {
        int[] arr = {1, 2, 4, 5, 3, 8, 9, 6, 7};

        ArraySort arraySort = new ArraySort();

        int searchNum = 9;
        BinarySearch binarySearch = new BinarySearch();

        int[] sortedArray = arraySort.sortArr(arr);
        System.out.println(Arrays.toString(sortedArray));

        int actualIndex = binarySearch.searchIndex(sortedArray, searchNum);

        int expectedIndex = 2;
        if (actualIndex == expectedIndex) {
            System.out.println("success actualIndex == expectedIndex, " + actualIndex);
            return;
        }
        throw new Exception("fail actualIndex != expectedIndex, actualIndex = " + actualIndex + " expectedIndex = " + expectedIndex);
    }

    public static void shouldThrowArrayIndexOutOfBoundsExceptionWhenArrayIsEmpty() {
        int[] arr = {};

        int searchNum = 15;
        BinarySearch binarySearch = new BinarySearch();

        try {
            binarySearch.searchIndex(arr, searchNum);
            System.out.println("fail");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("success ");
        } catch (Exception e) {
            System.out.println("fail catch exception = " + e.getClass());
        }
    }

}
