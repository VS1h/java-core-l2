package string.lesson4.task2;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class StrTask2 {
    public static void main(String[] args) {

        String inputString = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println(summaDigitsOfArray(fromStringInArray(inputString)));
    }

    private static int summaDigitsOfArray(int[] digitsArray) {
        int summaDigit = 0;
        for (int i : digitsArray) {
            summaDigit += i;
        }
        return summaDigit;
    }

    private static int[] fromStringInArray(String inputString) {
        String onlyDigits = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') {
                onlyDigits += inputString.charAt(i) - '0';
            }
        }
        int[] digitsArray = new int[onlyDigits.length()];
        for (int i = 0; i < onlyDigits.length(); i++) {
            digitsArray[i] = (onlyDigits.charAt(i) - '0');
        }
        return digitsArray;
    }
}

