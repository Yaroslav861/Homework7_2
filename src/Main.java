import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int allMany = 0;
        for (int i = 0; i < arr.length; i++) {
            allMany += arr[i];
        }
        System.out.println("сумма трат за месяц " + allMany + ".");
    }

    private static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxMany = -1;
        int minMany = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (maxMany < arr[i]) {
                maxMany = arr[i];
            }
        }
        System.out.println("Максимальная затрата в месяце " + maxMany + ".");
        for (int i = 0; i < arr.length; i++) {
            if (minMany > arr[i]) {
                minMany = arr[i];
            }
        }
        System.out.println("Минимальная затрата в месяце " + minMany + ".");
    }

    private static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        double averageMany = 0;
        for (int i : arr) {
            averageMany += i;
        }
        if (averageMany > 0) {
            averageMany = averageMany / arr.length;
        }
        System.out.println("Средняя сумма трат в месяц " + averageMany);
    }

    private static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}






