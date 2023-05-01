package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DigitRemoverTest {

    @Test
    void testRemoveWordsWithDigits() {
        String inputText = "Hello world. 1234567890 The end.";
        int numberOfDigits = 5;

        DigitRemover digitRemover = new DigitRemover();
        List<String> actualWords = (List<String>) digitRemover.removeWordsWithDigits(inputText, numberOfDigits);

        String expectedText = "Hello world. The end.";
        List<String> expectedWords = List.of("Hello", "world.", "The", "end.");



    }
}
