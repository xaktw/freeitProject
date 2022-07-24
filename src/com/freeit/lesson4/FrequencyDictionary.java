package com.freeit.lesson4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 11.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class FrequencyDictionary {
    /**
     * Написать частотный словарь -
     * посчитать сколько раз каждое слово встречается в предложении и вывести результат в консоль
     */
    public static void main(String[] args) {
        System.out.println("Введите текст : ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] words = string.toLowerCase().replaceAll("[,.!:?]", "").split("\\s");
        System.out.println("Слова из текста: " + Arrays.toString(words));
        /**
         * HashMap - хеш-таблица хранения данных
         * Map<String, Integer> hashMap = new HashMap<String, Integer>()
         */
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }
}
