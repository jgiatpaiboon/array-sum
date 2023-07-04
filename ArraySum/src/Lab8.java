/*
 *  Assignment Lab 8
 *  Description: This program uses 2-D arrays and gets the number of random numbers - then prints out its sum. User can input however many numbers
 they want.
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 211-03
 *  Semester: Fall 2019
 */

import java.util.Scanner;   // imported scanner for user
import java.lang.Math;  // imported for math.random

public class Lab8 {

    public static void main (String[] args) {   // main method

        Scanner input = new Scanner(System.in); // for user input

        System.out.println("Enter # of rows: ");    // prompts user to enter a number for rows
        int rowNum = input.nextInt();   //stores the number of rows entered
        System.out.println("Enter # of columns: "); // prompts user to enter number for columns
        int colNum = input.nextInt();   // stores the number of columns entered

        int[][] twoDArray = new int[rowNum][colNum];    // 2-D array declared

        randomizer(twoDArray, rowNum, colNum);  // calls the method randomizer
    }

    public static void randomizer (int[][] twoDArray, int row, int column) {    // first method
        //nested-for loop for random numbers to be stored in each row and column
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                twoDArray[i][j] = (int)(Math.random() * 100);
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(""); //print line statement for space between numbers
        }
        sums(twoDArray, row, column);   //calls method named sums
    }

    public static void sums (int[][] twoDArray, int row, int column) {  // second method

        int[] rowTotals = new int[row]; // array for row totals
        // nested for loop for the sums of random numbers
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                rowTotals[i] = rowTotals[i] + twoDArray[i][j];
            }
        }   // for loop to print out the sums of random numbers that get chosen
        for(int i = 0; i < row; i++)
            System.out.println("Sum of row " + i + " is : " + rowTotals[i]);
    }
}