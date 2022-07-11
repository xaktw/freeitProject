package com.freeit.lesson4;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 11.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class FrequencyDictionary2 {
    /**
     * Написать частотный словарь -
     * посчитать сколько раз каждое слово встречается в предложении и вывести результат в консоль
     */
    public static void main(String[] args) {
        System.out.println("Введите текст : ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] words = string.split("\\s");
        System.out.println("Слова из текста: " + Arrays.toString(words));


        for (int i = 0; i < words.length; ++i) {
            int countOfRepetition = 1;
            if (words[i] != null) {

                for (int j = i + 1; j < words.length; ++j) {
                    if (words[i].equals(words[j])) {
                        ++countOfRepetition;
                        words[j] = null;
                    }
                }
                System.out.println("Слово " + words[i] + " повторяется " + countOfRepetition + " раз(a).");
            }
        }
    }
}

