package Algorithms_and_data_structures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 8, 9, 6, 7};

        int[] arrSort1 = {1, 2, 3};
        int[] arrSort2 = {4, 5, 6};

//***************************************************************

        // * Пузырьковая сортировка *
//        ArraySort arraySort = new ArraySort();
        //System.out.println(Arrays.toString(arraySort.sortArr(arr)));

//***************************************************************

        // * Быстрая сортировка *
//        Scanner scanner = new Scanner(System.in);
//        int searchNum = scanner.nextInt();
//        BinarySearch binarySearch = new BinarySearch();
//        System.out.println(binarySearch.search(arraySort.sortArr(arr), searchNum));

//***************************************************************

        // * Сортировка слиянием *
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge(arrSort1, arrSort2);

    }

}
/*
    + 1. Отсортировать массив от меньшего к большему придумав свой алгоритм сортировки.
    + 2. Отсортировать массив пузырьковым алгоритмом.
    + 3. Отсортировать массив вставками.
    4. Отсортировать массив слиянием.
    5. Реализовать метод, который принимает отсортированный массив чисел и число. Нужно найти число в массиве и вывести кол-во шагов за которое оно было найдено.
    6. Решить задачу как получится
    7. Решить задачу через алгоритм бинарного поиска.
    8. Реализовать динамический массив(список).
    9. Реализовать двунаправленный связанный список.
    10 Реализовать стек.
    11. Реализовать очередь.
    12. Реализовать дерево.
    13. Реализовать хэш таблицу(ассоциативный массив)

*/