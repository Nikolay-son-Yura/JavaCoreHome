package lesson2;

import java.util.Arrays;

public class task1 {
    /**
     * Написать метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     *
     * @param arr Принимает массив
     * @return возвращает количество чётных элементов массива.
     */
    public static void numberOfEvenElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("В массиве " + Arrays.toString(arr) + " " + count + " четных элиментов");
    }
}
