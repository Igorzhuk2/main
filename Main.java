import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(printThreeWords());
        System.out.println(checkSumSign(15, -14));
        System.out.println(printColor(101));
        System.out.println(compareNumbers(14, 60));
        System.out.println(checkSum(3, 6));
        System.out.println(checkNumber(1));
        System.out.println(checkNumberBool(0));
        printStringMultipleTimes("Hello, hello!", 4);
        System.out.println(checkYear(2024));
        System.out.println(massChange());
        massHundred();
        massMultiple();
        massDiagonal();
        System.out.println(createMass(6,9));
    }

    public static String printThreeWords() {
        return ("Orange\nBanana\nApple");
    }

    public static String checkSumSign(int a, int b) {
        String resultSum;
        if ((a + b) < 0)
            resultSum = "Сумма отрицательная";
        else
            resultSum = "Сумма положительная";
        return resultSum;
    }

    public static String printColor(int value) {
        String resultColor;
        if (value <= 0)
            resultColor = "Красный";
        else if (value <= 100)
            resultColor = "Жёлтый";
        else resultColor = "Зелёный";
        return resultColor;
    }

    public static String compareNumbers(int a, int b) {
        String compResult;
        if (a >= b)
            compResult = "a >= b";
        else compResult = "a < b";
        return compResult;
    }

    public static boolean checkSum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    public static String checkNumber(int number) {
        String checkNumberRes;
        if (number >= 0)
            checkNumberRes = " - положительное число";
        else
            checkNumberRes = " — отрицательное число.";
        return number + checkNumberRes;
    }

    public static boolean checkNumberBool(int number) {
        return (number >= 0);
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static String massChange() {
        int[] mass = {1, 1, 0, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else {
                mass[i] = 1;
            }
        }
        return (Arrays.toString(mass));
    }

    public static void massHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void massMultiple() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6)
                mass[i] *= 2;
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void massDiagonal() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i][i] = 1;
            arr[i][10 - 1 - i] = 1;
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    public static String createMass(int len, int initialValue) {
        int[] mass = new int[len];
        Arrays.fill(mass, initialValue);
        return Arrays.toString(mass);
        }
    }