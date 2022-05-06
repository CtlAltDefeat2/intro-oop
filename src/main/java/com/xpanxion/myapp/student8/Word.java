package com.xpanxion.myapp.student8;

import java.util.Arrays;
import java.util.Objects;

public class Word {

    String inputString = "";
    String alph = "abcdefghijklmnopqrstuvwxyz";
    String UAlph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public Word(String inputString) {
        this.inputString = inputString;
    }

    public void printWord() {
        String[] al = alph.split("");
        String[] uAl = UAlph.split("");
        String[] myWord = inputString.split("");
        StringBuilder newWord = new StringBuilder();

        String test = "test";


        String[] letters = {
                """
                       
                     **
                    *  *
                   *    *
                  ********
                 *        *
                *          *
                """,

                """
                
                ******
                *     *
                *     *
                ******
                *     *
                *     *
                ******
                """,

                """
                  
                  ********
                 *        *
                *
                *
                *
                *
                 *        *
                  ********
                """,

                """
                  
                *********
                *        *
                *         *
                *         *
                *         *
                *         *
                *        *
                *********
                """,

                """
                 
                **********
                *
                *
                **********
                *
                *
                **********
                """,

                """
                 
                **********
                *
                *
                **********
                *
                *
                *
                """,

                """
                 
                **********
                *
                *
                *   ******
                *        *
                *        *
                **********
                """,

                """
                
                *         *
                *         *
                *         *
                ***********
                *         *
                *         *
                *         *
                """,

                """
                
                **
                **
                      
                **
                **
                **
                **
                **
                """,

                """
                       
                       **
                       **
                       **
                       **
                **     **
                **     **
                  **   **
                   ******
                """,

                """
                 
                *      *
                *     *
                *    *
                *   *
                * *
                **
                *  *
                *   *
                *    *
                *     *
                """,

                """
                
                *
                *
                *
                *
                *
                *
                *
                *
                *********
                """,

                """
                
                **           **
                * *         * *
                *  *       *  *
                *   *     *   *
                *    *   *    *
                *      *      *
                *             *
                *             *
                *             *
                """,

                """
                
                **        *
                * *       *
                *  *      *
                *   *     *
                *    *    *
                *     *   *
                *      *  *
                *       * *
                *        **
                """,

                """
                
                *************
                *           *
                *           *
                *           *
                *           *
                *           *
                *           *
                *           *
                *************
                """,

                """
                 
                *********
                *       *
                *       *
                *       *
                *********
                *
                *
                *
                *
                """,

                """
                
                *************
                *           *
                *           *
                *           *
                *           *
                *           *
                *************
                           **
                            *
                """,

                """
                 
                *********
                *       *
                *       *
                *       *
                *********
                *    *
                *     *
                *      *
                *       *
                """,

                """
                 
                 ********
                *
                *
                *
                 ********
                         *
                         *
                         *
                 ********
                """,

                """
                
                ************
                     **
                     **
                     **
                     **
                     **
                     **
                     **
                """,

                """
                
                *           *
                *           *
                *           *
                *           *
                *           *
                *           *
                *           *
                  *********
                """,

                """
                 
                *             *
                 *           *
                  *         *
                   *       *
                    *     *
                     *   *
                      * *
                       *
                """,

                """
                 
                *          *
                *          *
                *    **    *
                *   *  *   *
                *  *    *  *
                * *      * *
                **        **
                """,

                """
                 
                *       *
                 *     *
                  *   *
                   * *
                    *
                   * *
                  *   *
                 *     *
                *       *
                """,

                """
                 
                *       *
                 *     *
                  *   *
                   * *
                    *
                    *
                    *
                    *
                    *
                """,

                """
                 
                ************
                          *
                        *
                      *
                    *
                  *
                ************
                """
        };

        for (int i = 0; i < myWord.length; i++) {


            if (myWord[i].matches("A") || myWord[i].matches("a")) {
                newWord.append(letters[0]);

            } else if (myWord[i].matches("B") || myWord[i].matches("b")) {
                newWord.append(letters[1]);

            } else if (myWord[i].matches("C") || myWord[i].matches("c")) {
                newWord.append(letters[2]);

            } else if (myWord[i].matches("D") || myWord[i].matches("d")) {
                newWord.append(letters[3]);

            } else if (myWord[i].matches("E") || myWord[i].matches("e")) {
                newWord.append(letters[4]);

            } else if (myWord[i].matches("F") || myWord[i].matches("f")) {
                newWord.append(letters[5]);

            } else if (myWord[i].matches("G") || myWord[i].matches("g")) {
                newWord.append(letters[6]);

            } else if (myWord[i].matches("H") || myWord[i].matches("h")) {
                newWord.append(letters[7]);

            } else if (myWord[i].matches("I") || myWord[i].matches("i")) {
                newWord.append(letters[8]);

            } else if (myWord[i].matches("J") || myWord[i].matches("j")) {
                newWord.append(letters[9]);

            } else if (myWord[i].matches("K") || myWord[i].matches("k")) {
                newWord.append(letters[10]);

            } else if (myWord[i].matches("L") || myWord[i].matches("l")) {
                newWord.append(letters[11]);

            } else if (myWord[i].matches("M") || myWord[i].matches("m")) {
                newWord.append(letters[12]);

            } else if (myWord[i].matches("N") || myWord[i].matches("n")) {
                newWord.append(letters[13]);

            } else if (myWord[i].matches("O") || myWord[i].matches("o")) {
                newWord.append(letters[14]);

            } else if (myWord[i].matches("P") || myWord[i].matches("p")) {
                newWord.append(letters[15]);

            } else if (myWord[i].matches("Q") || myWord[i].matches("q")) {
                newWord.append(letters[16]);

            } else if (myWord[i].matches("R") || myWord[i].matches("r")) {
                newWord.append(letters[17]);

            } else if (myWord[i].matches("S") || myWord[i].matches("s")) {
                newWord.append(letters[18]);

            } else if (myWord[i].matches("T") || myWord[i].matches("t")) {
                newWord.append(letters[19]);

            } else if (myWord[i].matches("U") || myWord[i].matches("u")) {
                newWord.append(letters[20]);

            } else if (myWord[i].matches("V") || myWord[i].matches("v")) {
                newWord.append(letters[21]);

            } else if (myWord[i].matches("W") || myWord[i].matches("w")) {
                newWord.append(letters[22]);

            } else if (myWord[i].matches("X") || myWord[i].matches("x")) {
                newWord.append(letters[23]);

            } else if (myWord[i].matches("Y") || myWord[i].matches("y")) {
                newWord.append(letters[24]);

            } else if (myWord[i].matches("Z") || myWord[i].matches("z")) {
                newWord.append(letters[25]);

            }
        }
        System.out.print(newWord);
        System.out.println(inputString);
    }
}
