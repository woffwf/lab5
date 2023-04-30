package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextUtilsTest {

    @Test
    void removeWordsWithDigits_shouldReturnTextWithoutWordsWithMinDigits() {
        String text = "The cat 123 in the 45 hat sat on the mat 67890";
        int minDigits = 2;
        TextUtils textUtils = new TextUtils();
        String result = textUtils.removeWordsWithDigits(text, minDigits);
        String expected = "The cat in the hat sat on the mat";
        assertEquals(expected, result);
    }

    @Test
    void containsDigits_shouldReturnTrueIfWordContainsMinDigits() {
        String word = "123456";
        int minDigits = 5;
        TextUtils textUtils = new TextUtils();
        boolean result = textUtils.containsDigits(word, minDigits);
        assertTrue(result);
    }

    @Test
    void containsDigits_shouldReturnFalseIfWordDoesNotContainMinDigits() {
        String word = "123";
        int minDigits = 5;
        TextUtils textUtils = new TextUtils();
        boolean result = textUtils.containsDigits(word, minDigits);
        assertFalse(result);
    }
}
