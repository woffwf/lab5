package org.example;

public class TextUtils {

    public static String removeWordsWithDigits(String text, int minDigits) {
        StringBuilder result = new StringBuilder();
        for (String word : text.split("\\s+")) {
            if (!containsDigits(word, minDigits)) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    private static boolean containsDigits(String word, int minDigits) {
        int digitCount = 0;
        boolean inDigits = false;
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
                inDigits = true;
            } else if (c == '-' && inDigits) {
                // дефіс між цифрами - ігноруємо
            } else {
                inDigits = false;
            }
        }
        return digitCount >= minDigits;
    }
}
