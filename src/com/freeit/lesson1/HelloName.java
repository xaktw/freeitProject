package com.freeit.lesson1;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 11.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class HelloName {
    /**
     *  Написать и скомпилировать в терминале/командной строке программу
     *  выполняющую вывод приветственного сообщения вида: "Привет, {введенное имя}!"
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Привет," + name );
        System.out.println("Хорошего Вам дня и прекрасного настроения, " + name);
    }
}
