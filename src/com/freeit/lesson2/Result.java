package com.freeit.lesson2;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 11.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class Result {
    /**
     *Написать программу, результатом работы которой будет вывод результата сравнения двух введенных чисел.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        int a = in.nextInt();
        System.out.println("Введите значение b: ");
        int b = in.nextInt();
        boolean res1 = a > b;
        boolean res2 = a < b;
        if (res1) {
            System.out.println(a + " > " + +b);
        } else if (res2){
            System.out.println(a + "<" + b);
        } else {
            System.out.println(a + "=" + b);
        }
    }
}
