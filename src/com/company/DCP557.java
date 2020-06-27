package com.company;

import java.util.Scanner;

public class DCP557 {

    //Suppose you have a multiplication table that is N by N.
    //Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.


    public static int findNumberOfXInNByNMultiplicationTable(){
        System.out.println("This program takes any given multiplication table of size n and returns how many time number x occurs.");
        Scanner sc = new Scanner(System.in);
        System.out.println("What size n would you like the multiplication table to be(please type an integer)?");
        int n = sc.nextInt();
        System.out.println("What number would you like to check occurrences of (please type an integer)?");
        int x = sc.nextInt();
        printMultiplicationTable(n);
        int XCount = 0;
        for (int i = 1 ; i <= n ; i++){
            for (int j = i ; j <= n ; j++){
                if ( j*i == x){
                    XCount++;
                    if ( j != i){
                        XCount++;
                    }
                }
            }
        }

        System.out.println("The number " + x + " occurs in a " + n + " by " + n + " multiplication table " + XCount + " times.");
        return XCount;


    }

    public static void printMultiplicationTable(int size){
        for (int row = 1 ; row <= size ; row++){
            for (int col = 1 ; col <= size ; col++){
                System.out.print(row*col + "|");
            }
            System.out.print("\n");
        }
    }

}
