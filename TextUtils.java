package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextUtils {
    public TextUtils() {
    }

    public String removeWordsWithDigits(String text, int minDigits) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (!containsDigits(word, minDigits)) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    public boolean containsDigits(String word, int minDigits) {
        int digitCount = 0;
        boolean inDigits = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
                inDigits = true;
            } else if (c == '-' && inDigits) {
                // дефіс між цифрами - ігнуємо
                } else {
                inDigits = false;
                }
                }
                return digitCount >= minDigits;
                }
    public static void main(String[] args) {
        String text = "The cat in the hat sat on the mat";

        int minDigits = 5;

        List<String> words = new ArrayList<>(Arrays.asList(text.split("\\s+")));

        // create a new instance of TextUtils

        TextUtils textUtils = new TextUtils();

        words.removeIf(word -> textUtils.containsDigits(word, minDigits));

        String result = String.join(" ", words);

        System.out.println(result);
    }

}
