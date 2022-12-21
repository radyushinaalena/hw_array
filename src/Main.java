import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        int[] array = new int[5];
        array[0] = 4;
        array[1] = 8;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        double[] doubles = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++) {
            if (i == doubles.length - 1) {
                System.out.println(doubles[i]);
                break;
            }
            System.out.print(doubles[i] + ", ");
        }
        int[] array = new int[5];
        array[0] = 4;
        array[1] = 8;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        double[] doubles = {1.57, 7.654, 9.986};
        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubles[i]);
                break;
            }
            System.out.print(doubles[i] + ", ");
        }
        int[] array = new int[5];
        array[0] = 4;
        array[1] = 8;
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}