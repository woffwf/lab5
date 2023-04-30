package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextUtilsTest {

    @Test
    void testRemoveWordsWithDigits() {
        String input = "This is a 123 test string with some 456 numbers";
        int minDigits = 3;
        String expectedOutput = "This is a test string with some";
        String actualOutput = TextUtils.removeWordsWithDigits(input, minDigits);
    }
}
