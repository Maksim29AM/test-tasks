package test.uzum.wordcounter;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String str = "hello world qwerty world";

        List<String> result = counterWord(str, 2);
        System.out.println(result);
    }

    public static List<String> counterWord(String str, int n) {
        if (str == null || str.isBlank()) {
            return Collections.emptyList();
        }
        String[] words = str.trim().toLowerCase().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == n) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
