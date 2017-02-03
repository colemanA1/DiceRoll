package com.company;
import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void DiceRoll(){
        int sides;
        char userChoice;
        Scanner scan = new Scanner(System.in);

        /*********************************
         * Prompt user the number of     *
         * sides of the dice             *
         *********************************/
        System.out.println("Welcome to the Dice Roll!");
        System.out.println("Enter number of sides: ");
        sides = scan.nextInt();
        int numRoll = 1;


        /*******************************
         *Prompts user to roll the dice*
         *and keeps rolling as long    *
         * as user presses y           *
         *******************************/
        do {
            int dice1 = (int) (Math.random() * (sides)) + 1;
            int dice2 = (int) (Math.random() * (sides)) + 1;
            System.out.println("Roll" + numRoll + ":");
            System.out.println(dice1);
            System.out.println(dice2);
            System.out.println("Roll again?(y/n)");
            userChoice = scan.next().charAt(0);
            numRoll ++;
        }while(userChoice == 'y');
            scan.close();

            }
    public static void main(String[] args) {
        DiceRoll();
    }
}