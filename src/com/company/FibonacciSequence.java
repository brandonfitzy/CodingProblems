package com.company;

import java.util.Scanner;

public class FibonacciSequence {

    public static void fibonacciSequenceCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program writes the Fibonacci Sequence to any given amount of element");
        System.out.println("Please type how many elements of the Fibonacci Sequence you would like printed:");
        int elements = sc.nextInt();
        System.out.println("Fibonacci Sequence:\n");
        int oneAway = 0;
        int twoAway = 0;
        int currentNum;
        for (int elementIter = 0; elementIter < elements; elementIter++){

            if (elementIter == 0){
                currentNum = 0;
                twoAway = currentNum;
            } else if (elementIter == 1){
                currentNum = 1;
                oneAway = currentNum;
            } else {
                currentNum = oneAway + twoAway;
                twoAway = oneAway;
                oneAway = currentNum;
            }

            System.out.println(currentNum + "\n");
        }
    }
}
