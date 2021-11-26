package Hangman;

import java.util.Random;

public class WordsStorage {
    private final String[] words_list = {"python", "java", "hot dog", "Mia Khalifa"};

    String hidingWords() {
        String word;

        Random r = new Random();
        int a_i = r.nextInt(3);
        String word_dash = "";
        char dash = '-';
        String word_r = words_list[a_i];
        char[] wordChar = word_r.toCharArray();

        int len_word_r = word_r.length() - 1;
        int two_len_word_r = len_word_r - 2;

        for (int i = 0; i < two_len_word_r; i++) {
            word_dash += dash;
        }
        return word = wordChar[0] + wordChar[1] + word_dash;
    }
}
