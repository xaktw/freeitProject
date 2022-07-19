package com.freeit.lesson3;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 11.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class NameSexAge {
    /**
     * Написать программу, которая приветствует пользователя в зависимости от его пола и возраста
     * (имя, пол и возраст задаются при старте программы)
     */
    public static void main(String[] args) {
        System.out.println("Введите ваше полное имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.println(sex(name));
        System.out.println("Ваш возраст составляет : " + age + " year, " + ageStage(age));
        // System.out.println("SERVER: " + ageStage(age));
    }

    /**
     * блок возрастного ограничения
     */
    public static String ageStage(int age) {
        if (age < 18) {
            return "\n" + "ваш возраст не достиг 18+ " + "\n"
                    + "не унывай  , у тебя весь мир впереди *_*" + "\n"
                    + "Всего хорошего";
        } else {
            return "\n" + "вы совершеннолетний" + "\n"
                    + "теперь для вас открыт мир и возможности :)" + "\n"
                    + "Всего хорошего";
        }

    }

    /**
     *  блок распознования по гендерному признаку
     */

    public static String sex (String name){
        String[] letters = {"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};
        String letter = name.substring(name.length() - 1);
        if (Arrays.asList(letters).contains(letter)) {
            return "Я вас приветствую госпожа " + name;
        } else {
            return "Я вас приветствую господин " + name;
        }
    }
}
