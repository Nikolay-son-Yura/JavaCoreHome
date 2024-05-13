package lesson2;

public class task3 {
    /**
     * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с
     * нулевым значением.
     *
     * @param arr Принимает массив
     * @return Возвращает true или false
     */
    public static boolean zeroEliminations(int[] arr) {
        boolean elem = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                elem = true;
            }
        }

        return  elem;
    }
}
