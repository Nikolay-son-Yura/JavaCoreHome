import lesson2.task1;
import lesson2.task2;
import lesson2.task3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2,0, 0, 3, 0, 4};
        task1.numberOfEvenElements(arr);
        task2.differenceBetweenMaxAndMin(arr);
        System.out.println(task3.zeroEliminations(arr));
    }
}