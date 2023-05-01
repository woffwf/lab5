package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitRemover {

    public static void main(final String[] args) {
        if (args.length < 2) {
            System.out.println("Write: <text> and <number of digits>");
            return;
        }
        String text = args[0];
        int numberOfDigits = Integer.parseInt(args[1]);
        DigitRemover digitRemover = new DigitRemover();
        digitRemover.removeWordsWithDigits(text, numberOfDigits);
    }

    public Object removeWordsWithDigits(final String text, final int numberOfDigits) {
        System.out.println("Text to process: " + text);
        List<String> words = findWordsWithoutDigits(text, numberOfDigits);
        String output = "Words without " + numberOfDigits + " or more digits:";
        System.out.println(output);
        System.out.println("Text after processing:");
        for (String word : words) {
            System.out.println(word);
        }
        return null;
    }

    public List<String> findWordsWithoutDigits(final String text, final int numberOfDigits) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[^\\W\\d]*\\d{" + numberOfDigits + ",}[^\\W]*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        String newText = text.replaceAll("\\b[^\\W\\d]*\\d{" + numberOfDigits + ",}[^\\W]*\\b", "");
        System.out.println("Text without " + numberOfDigits + " or more digit words: " + newText);
        return result;
    }
}