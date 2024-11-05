package lesson1_aqa;

import java.util.Arrays;

public class Lesson1 {
    static class ThreeWords {
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static void main(String[] args) {
            printThreeWords();
        }
    }

    static class SumSign {
        public static void checkSumSign(int a, int b) {
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void main(String[] args) {
            checkSumSign(1, -2);
        }
    }

    static class ColorPrint {
        public static void printColor(int value) {
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }

        public static void main(String[] args) {
            printColor(101);
        }
    }

    static class NumbersCompare {
        public static void compareNumbers(int a, int b) {
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }

        public static void main(String[] args) {
            compareNumbers(10, -5);
        }
    }

    static class SumChecker {
        public static boolean checkSumInRange(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }

        public static void main(String[] args) {
            System.out.println(checkSumInRange(4, 5));
        }
    }

    static class NumberSignPrinter {
        public static void printNumberSign(int number) {
            if (number >= 0) {
                System.out.println("Положительное число: " + number);
            } else {
                System.out.println("Отрицательное число: " + number);
            }
        }

        public static void main(String[] args) {
            printNumberSign(-0);
        }
    }

    static class NumberSignChecker {

        public static boolean isNegative(int number) {
            return number < 0;
        }

        public static void main(String[] args) {
            System.out.println(isNegative(-1));
        }
    }

    static class StringRepeater {

        public static void printStringMultipleTimes(String text, int times) {
            for (int i = 0; i < times; i++) {
                System.out.println(text);
            }
        }

        public static void main(String[] args) {
            printStringMultipleTimes("Привет", 3);
        }
    }

    static class LeapYearChecker {

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public static void main(String[] args) {
            System.out.println(isLeapYear(2023));
        }
    }

    static class ArrayInverter {

        public static void invertArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (arr[i] == 0) ? 1 : 0;
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println("Исходный массив: " + Arrays.toString(arr));
            invertArray(arr);
            System.out.println("Инвертированный массив: " + Arrays.toString(arr));
        }
    }

    static class ArrayFiller {

        public static void main(String[] args) {
            int[] arr = new int[100];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }

            System.out.println(Arrays.toString(arr));
        }
    }

    static class ArrayMultiplier {

        public static void multiplyLessThanSix(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Исходный массив: " + Arrays.toString(arr));
            multiplyLessThanSix(arr);
            System.out.println("Измененный массив: " + Arrays.toString(arr));
        }
    }

    static class SquareMatrixDiagonalFiller {

        public static void fillDiagonal(int[][] matrix) {
            int n = matrix.length;

            for (int i = 0; i < n; i++) {
                matrix[i][i] = 1;
            }
        }


        public static void main(String[] args) {
            int[][] matrix = new int[10][10];

            fillDiagonal(matrix);

            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

    static class ArrayCreator {

        public static int[] createArray(int len, int initialValue) {
            int[] arr = new int[len];
            Arrays.fill(arr, initialValue);
            return arr;
        }

        public static void main(String[] args) {
            int[] array1 = createArray(5, 10);
            System.out.println(Arrays.toString(array1));
        }
    }
}
