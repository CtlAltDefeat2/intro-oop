package com.xpanxion.myapp.student5;

import java.util.*;

public class Game {
    public static void runGame() {

        boolean userWantsToExit = false;        // flag variable to exit menu while loop
        boolean isGuessCorrect = false;        // flag variable to complete the game while loop
        int numToGuess = 0;                    // the number the computer generates
        int numEntered = 0;                    // the number the player enters as a guess
        int numAttempts = 1;                // the number of attempts it takes to win the game
        int menuChoice = 0;                    // the game menu choice of the player
        Scanner menuChoiceReader = new Scanner(System.in);

        while (!userWantsToExit) {
            displayMenu(); // function that displays the program menu

            System.out.println("Please select an option from the menu: ");
            menuChoice = menuChoiceReader.nextInt();

            isGuessCorrect = false;			// to allow for multiple games
            numAttempts = 0;				// to reset attempts for additional games


            Random rand = new Random();
            numToGuess = rand.nextInt(0, 201);  // generates a number between and including 0 and 200

            if (menuChoice == 1) {
                // ******************** game while loop ********************
                while (!isGuessCorrect) {
                    if (numAttempts == 0) {
                        System.out.println("Please Enter Your First Guess, a Number Between and Including 0 and 200: ");
                    } else {
                        System.out.println("Please Enter Another Number: ");
                    }
                    Scanner numberGuessed = new Scanner(System.in);
                    numEntered = numberGuessed.nextInt();
                    numAttempts++;

                    if (numEntered == numToGuess) {
                        System.out.println("Congratulations! You have Guessed the Correct Number in " + numAttempts + " attempts!!\n");

                        isGuessCorrect = true;
                    } else {
                        if (numEntered < numToGuess && numEntered >= 0) {
                            System.out.println("Your guess is too small!!");
                        } else if (numEntered > numToGuess && numEntered <= 200) {
                            System.out.println("Your guess is too high!!");
                        } else {
                            System.out.println("Your guess is invalid!!");
                        }
                    } // end of else statement
                } // end of while loop 2
            } else if (menuChoice == 2) {
                System.out.println("Instructions for the Game:\n");
                System.out.println("The computer will randomly generate a number between and including 0 and 200.");
                System.out.println("You will try to guess the number by typing a number in, when prompted.");
                System.out.println("The goal is to guess the number in as few attempts as possible.");
                System.out.println("A guess out of range will be invalid, but will count as an attempt.");
                System.out.println("The game will tell you if your guess is correct, too high, or too low.");
                System.out.println("If it was not correct, you keep guessing until you guess correctly.");
                System.out.println("Once you guess the number correctly, the number of attempts is showed.");
                System.out.println("The current game is now complete.");
                System.out.println("You will be then asked to play again or to exit the game.");
                System.out.println("Good luck in your game(s) and have fun!!\n");
            } else if (menuChoice == 3) {
                userWantsToExit = true;
                programEnding();
            } else {
                System.out.println("Your input is invalid.\n");
            }
        } // end of while loop 1
    }
    public static void screenClear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void displayMenu() {
        System.out.println("\nGame Menu:\n");
        System.out.println("1 - Play the Game");
        System.out.println("2 - View the Instructions");
        System.out.println("3 - Exit the Game\n");
    } // end of displayMenu
    public static void programEnding() {
        System.out.println("                         ` `oddy+.                                    ");
        System.out.println("                        ` -mhdNNNNh:      -yhNNmh+`                   ");
        System.out.println("                       ` `NhsNNNNNNNd.   odomNNNNNN/  `               ");
        System.out.println("                       ` oN-NNNNNNNNNd  :N:NNNNNNNNNs  `              ");
        System.out.println("                         hN:NNNNNNNNNN- yhyNNNNNNNNNNs                ");
        System.out.println("               `.`       dNsNNNNNNNNNN: mmdNNNNNNNNNNN-               ");
        System.out.println("              oNmNNho-   oNNNNNNNNNNNN. dNNNNNNNNNNNNN/    .::.       ");
        System.out.println("          `  yhsNNNNNNd:  yNNNNNNNNNNy  +NNNNNNNNNNNNN.  /hdNNNd+`    ");
        System.out.println("          ` /m-NNNNNNNNN/  -sdNNNNNh+    oNNNNNNNNNNN/  yhoNNNNNNN/   ");
        System.out.println("          ` hd/NNNNNNNNNd       `         .odNNNNNNy-  :N-NNNNNNNNN: `");
        System.out.println("          ` oN+NNNNNNNNNd                     .--.     oh/NNNNNNNNNo `");
        System.out.println("          ` `dmNNNNNNNNNs       .-/++oosooo+/-.        /N+NNNNNNNNNo `");
        System.out.println("           ` `sNNNNNNNNN.  .+ydNNNNNNNNNNNNNNNNNds/.   `NdNNNNNNNNN/ `");
        System.out.println("               -yNNNNNd-.omNmhshmNNNNNNNNNNNNNNNNNNNdo. /NNNNNNNNNm` `");
        System.out.println("                  -::.-hNdo--sNNNNNNNNNNNNNNNNNNNNNNNNNy.:dNNNNNNm-   ");
        System.out.println("                     oNd: .hNNNNNNNNNNNNNNNNNNNNNNNNNNNNN+ -/oo+:     ");
        System.out.println("                    sNs  /NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN/           ");
        System.out.println("                 ` .Nh  -NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNm  `        ");
        System.out.println("                 ` -N+  sNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN  `        ");
        System.out.println("                 ` `mo  sNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNy  `        ");
        System.out.println("                  ` -d  :NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNh` `         ");
        System.out.println("                   ` `:  oNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN+  `          ");
        System.out.println("                          :dNNNNNNNNNNNNNNNNNNNNNNNNNd+`              ");
        System.out.println("                            :ymNNNNNNNNNNNNNNNNNNmy+/                 ");
        System.out.println("                               .:+syhdddddhyso/-`   `       GO PSU!!\n");
        System.out.println("Thank you for playing!  Have a nice day!!\n");
    }
}
