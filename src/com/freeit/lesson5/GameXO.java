package com.freeit.lesson5;
import java.util.Random;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 13.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class GameXO {
    /**
     * Написать игру крестики нолики
     */
    public static void main(String[] args) {
        String[][] gameTable = {{"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}};

        System.out.println("Игра крестики-нолики" );
        Scanner sc = new Scanner(System.in);
        String x = "x";
        String o = "o";

        boolean exit = false;

        int i = 0;
        while (!exit) {

            System.out.println(gameTable[0][0] + " " + gameTable[0][1] + " " + gameTable[0][2]);
            System.out.println(gameTable[1][0] + " " + gameTable[1][1] + " " + gameTable[1][2]);
            System.out.println(gameTable[2][0] + " " + gameTable[2][1] + " " + gameTable[2][2]);


            System.out.println("Игрок1 выберите цифру на поле -> ваш ход будет отмечен 'x' ");
            int player = sc.nextInt();
            switch (player) {
                case 1 -> gameTable[0][0] = x;
                case 2 -> gameTable[0][1] = x;
                case 3 -> gameTable[0][2] = x;
                case 4 -> gameTable[1][0] = x;
                case 5 -> gameTable[1][1] = x;
                case 6 -> gameTable[1][2] = x;
                case 7 -> gameTable[2][0] = x;
                case 8 -> gameTable[2][1] = x;
                case 9 -> gameTable[2][2] = x;
            }

            System.out.println("Игрок2 выберите цифру на поле -> ваш ход будет отмечен 'o'");
            int player2 = sc.nextInt();
            switch (player2) {
                case 1 -> gameTable[0][0] = o;
                case 2 -> gameTable[0][1] = o;
                case 3 -> gameTable[0][2] = o;
                case 4 -> gameTable[1][0] = o;
                case 5 -> gameTable[1][1] = o;
                case 6 -> gameTable[1][2] = o;
                case 7 -> gameTable[2][0] = o;
                case 8 -> gameTable[2][1] = o;
                case 9 -> gameTable[2][2] = o;
            }
            if (gameTable[0][0].equals(gameTable[0][1]) && gameTable[0][1].equals(gameTable[0][2]) ||
                gameTable[1][0].equals(gameTable[1][1]) && gameTable[1][1].equals(gameTable[1][2]) ||
                gameTable[2][0].equals(gameTable[2][1]) && gameTable[2][1].equals(gameTable[2][2]) ||
                gameTable[0][0].equals(gameTable[1][0]) && gameTable[1][0].equals(gameTable[2][0]) ||
                gameTable[0][1].equals(gameTable[1][1]) && gameTable[1][1].equals(gameTable[2][1]) ||
                gameTable[0][2].equals(gameTable[1][2]) && gameTable[1][2].equals(gameTable[2][2]) ||
                gameTable[0][0].equals(gameTable[1][1]) && gameTable[1][1].equals(gameTable[2][2]) ||
                gameTable[2][0].equals(gameTable[1][1]) && gameTable[1][1].equals(gameTable[0][2])) {
                exit = true;
            }
        }
        System.out.println("End Game");
    }
}
