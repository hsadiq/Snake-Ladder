package com.bl.snakeladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeorLadder {
    public static void main(String[] args) {

        System.out.println("Welcome To Snake & Ladder Simulator");

        //Starting Positions;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int positionfor1 = 0;
        int positionfor2 = 0;
        int turn = 1;


        while (positionfor1 < 100 && positionfor2 < 100) {
            // Roll the dice and get the number of positions to move
            int dice = random.nextInt(6) + 1;

        {

            Scanner ab = new Scanner(System.in);
            System.out.println("Press Enter for Roll the Dice");
            ab.nextLine();



        }

    }
}
