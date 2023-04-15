package com.bl.snakeladder;

import java.util.Scanner;

public class SnakeorLadder {
    public static void main(String[] args) {

        System.out.println("Welcome To Snake & Ladder Simulator");

        //Starting Positions;

        int position = 0;

        int[][] SnakeLadder = {{15, 22}, {14, 7}, {77, 32}, {95, 10}, {50, 32}};

        while (position < 100){

            Scanner ab = new Scanner(System.in);
            System.out.println("Press Enter for Roll the Dice");
            ab.nextLine();


            int dice = (int)(Math.random() * 6) + 1;
            System.out.println("You Got: "+ dice);

            position += dice;
            System.out.println("You are at: "+ dice);

        }

    }
}
