package string.lesson4.task1;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class StrTask1 {
    public static void main(String[] args) {
        String value = "FFHHDjjj fhwd";
        System.out.println(deleteEqualChar(value));
    }

    private static String deleteEqualChar(String value) {
        String strValue = value.replace(" ", "").toUpperCase();
        String result = "";
        for (int i = 0; i < strValue.length() - 1; i++) {
            char addChar = strValue.charAt(i);
            if (!result.contains("" + addChar)) {
                result += "" + addChar;
            }
        }
        return result;
    }
}

