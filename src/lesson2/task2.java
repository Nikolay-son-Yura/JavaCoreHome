package lesson2;

public class task2 {
    /**
     * Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
     *
     * @param arr Принимает массив
     * @return Возвращаем разницу между максимальным и минимальным элементами
     */
    public static void differenceBetweenMaxAndMin(int[] arr) {
        int result = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            else if (i < min) min = i;
        }
        result = max - min;
        System.out.println("разница между максимальным и минимальным элементом массива = " + result);
    }
}
