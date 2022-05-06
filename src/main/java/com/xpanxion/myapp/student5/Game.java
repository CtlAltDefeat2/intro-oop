package com.xpanxion.myapp.student5;

import java.util.*;

public class Game implements Printable {
    // Main Game Method
    public static void runGame() {

        boolean userWantsToExit = false;       // flag variable to exit menu while loop
        boolean isGuessCorrect;        // flag variable to complete the game while loop
        int numToGuess;                    // the number the computer generates
        int numEntered;                    // the number the player enters as a guess
        int numAttempts;                   // the number of attempts it takes to win the game
        int menuChoice;                    // the game menu choice of the player
        Scanner menuChoiceReader = new Scanner(System.in);

        programIntro();

        while (!userWantsToExit) {
            displayMenu(); // function that displays the program menu

            System.out.println("Please select an option from the menu: ");
            menuChoice = menuChoiceReader.nextInt();

            clearScreen();

            isGuessCorrect = false;			   // to allow for multiple games
            numAttempts = 0;			   	   // to reset attempts for additional games

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
    // Other Methods
    public static void clearScreen() {
        for (int clearScreen = 0; clearScreen < 30; ++clearScreen) System.out.println(" "); // simulates clear screen
    }
    public static void pause() {
        Scanner pauseKey = new Scanner(System.in);
        System.out.println("(type any letter, then press enter)");
        pauseKey.next();
    }
    public static void displayMenu() {
        System.out.println("\nGame Menu:\n");
        System.out.println("1 - Play the Game");
        System.out.println("2 - View the Instructions");
        System.out.println("3 - Exit the Game\n");
    } // end of displayMenu
    public static void programEnding() {
        clearScreen();
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
    public static void programIntro() {
        System.out.println("                    WW       WW EEEEEEE LL      CCCCC   OOOOO   MMM     MMM EEEEEE  ");
        System.out.println("                    WW       WW EE      LL     CC      OO   OO  MM M   M MM EE      ");
        System.out.println("                    WW   W   WW EEEEE   LL    CC      OO     OO MM  M M  MM EEEEE   ");
        System.out.println("                     WW W W WW  EE      LL     CC      OO   OO  MM   M   MM EE      ");
        System.out.println("                      WW   WW   EEEEEEE LLLLLL  CCCCC   OOOOO   MM       MM EEEEEE  \n");
        System.out.println("                  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("                  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");

        pause();
        clearScreen();

        System.out.println("                                          TTTTTTTT   OOOOO  ");
        System.out.println("                                             TT     OO   OO ");
        System.out.println("                                             TT    OO     OO");
        System.out.println("                                             TT     OO   OO ");
        System.out.println("                                             TT      OOOOO  \n");
        System.out.println("                                        XXXXXXXXXXXXXXXXXXXXXX ");
        System.out.println("                                        XXXXXXXXXXXXXXXXXXXXXX \n");

        pause();
        clearScreen();

        System.out.println("                      :hhddd+        .hhhddy                    `-+sydmmNNNNmdhyo/-`               ");
        System.out.println("                      yddddd.        oddddd:                 .+dMMMMMMMMMMMMMMMMMMMMdo.            ");
        System.out.println("                     :dddddo        `dddddh                .yMMMMMMMMMMMMMMMMMMMMMMMMMMh-          ");
        System.out.println("                     yddddd.        +ddddd/               +NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMs         ");
        System.out.println("                    -ddddds        `dddddd`              oMMMMMMMMMMMNmhsssydNMMMMMMMMMMMMs        ");
        System.out.println("           .::::::::ydddddo::::::::odddddy::::::        -MMMMMMMMMMNs-       `:dMMMMMMMMMMM:       ");
        System.out.println("           sdddddddddddddddddddddddddddddddddddd        oMMMMMMMMMM:           `dMMMMMMMMMMs       ");
        System.out.println("           sdddddddddddddddddddddddddddddddddddd        yMMMMMMMMMh             sMMMMMMMMMMo       ");
        System.out.println("           :++++++smmmmmyooo+++++smmmmmd++++++++        :oooooooo+-            .mMMMMMMMMMN.       ");
        System.out.println("                  ymmmmm-        +mmmmm+                                      :dMMMMMMMMMN+        ");
        System.out.println("                 -mmmmmy        `dmmmmd`                                   ./hMMMMMMMMMMd:         ");
        System.out.println("                 ymmmmm-        +mmmmmo                                 `:ymMMMMMMMMMMd+`          ");
        System.out.println("                -mmmmmy        `dmmmmm.                                :dMMMMMMMMMMdo-`            ");
        System.out.println("        ++++++++hmmmmms++++++++smmmmmd++++++:                         oMMMMMMMMMms-`               ");
        System.out.println("        mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmms                        .MMMMMMMMMo`                  ");
        System.out.println("        mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmms                        /MMMMMMMMy                    ");
        System.out.println("        //////ommmmmd/////////dmmmmm////////-                        :yyyyysss-                    ");
        System.out.println("              smmmmm+        -mmmmms                                                               ");
        System.out.println("             `mmmmmd`        ymmmmm-                                  `/osso/`                     ");
        System.out.println("             ommmmm+        -mmmmmy                                  +NMMMMMMN+                    ");
        System.out.println("            `dmmmmm`        ymmmmm-                                  hMMMMMMMMy                    ");
        System.out.println("            /mmmmd+        .mmmmdy                                   `+dNMMNh+`                  \n");

        System.out.println("NNN    NN UU   UU MMM     MMM BBBB   EEEEEE RRRR        GGGGG UU   UU EEEEEE  SSS  SSS EEEEEE RRRR  ");
        System.out.println("NN N   NN UU   UU MM M   M MM BB  B  EE     RR  R      GG     UU   UU EE     SS   SS   EE     RR  R ");
        System.out.println("NN  N  NN UU   UU MM  M M  MM BBBBB  EEEEE  RRRR   ** GG   GG UU   UU EEEEE   SS   SS  EEEEE  RRRR  ");
        System.out.println("NN   N NN  U   U  MM   M   MM BB   B EE     RR  R      GG   G  U   U  EE       SS   SS EE     RR  R ");
        System.out.println("NN    NNN   UUU   MM       MM BBBBB  EEEEEE RR   R      GGGGG   UUU   EEEEEE SSS  SSS  EEEEEE RR   R\n");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("                                                           Program Created By: Connor David Shillady");
        System.out.println("                                                      Student of Penn State University, Berks Campus");
        pause();
    } // end of programIntro
}
