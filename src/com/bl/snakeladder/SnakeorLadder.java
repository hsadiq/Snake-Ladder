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
            int diceRoll = random.nextInt(6) + 1;
            int playerPosition;
            String playerName;
            if (turn % 2 == 1) {
                playerPosition = positionfor1;
                playerName = "Player 1";
            } else {
                playerPosition = positionfor2;
                playerName = "Player 2";
            }

            int option = random.nextInt(3);
            switch (option) {
                case 0:
                    System.out.println(playerName + " rolled a " + diceRoll + " and got No Play.");
                    break;
                case 1:
                    playerPosition += diceRoll;
                    if (playerPosition > 100) {
                        playerPosition -= diceRoll;
                    } else {
                        System.out.println(playerName + " rolled a " + diceRoll + " and got a Ladder. " + playerName + " moves to position " + playerPosition + ".");
                    }
                    break;
                case 2:
                    playerPosition -= diceRoll;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    } else {
                        System.out.println(playerName + " rolled a " + diceRoll + " and got a Snake. " + playerName + " moves to position " + playerPosition + ".");
                    }
                    break;
            }
            // Update the player position
            if (turn % 2 == 1) {
                positionfor1 = playerPosition;
            } else {
                positionfor2 = playerPosition;
            }

            // Increment the turn counter
            if (option == 1) {
                turn--; // Player gets another turn
            }
            turn++;
        }
        String winner;
        if (positionfor1 >= 100) {
            winner = "Player 1";
        } else {
            winner = "Player 2";
        }

        // Print the game summary
        System.out.println(winner + " wins!");
        System.out.println("Player 1 final position: " + positionfor1);
        System.out.println("Player 2 final position: " + positionfor2);


    }

}

