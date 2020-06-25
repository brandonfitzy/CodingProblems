package com.company;

import java.util.Scanner;

public class GoldbachConjecture {
    public static void goldbachConjecture() {

        System.out.println("Goldbach's conjecture states that every even integer greater than 2 can be expressed as the sum of two primes.");
        System.out.println("This program writes out all pairs of primes that sum to any given even integer");

        Scanner sc = new Scanner(System.in);
        int evenNum;
        boolean isNumGood = false;
        while (!isNumGood){
            System.out.println("Please input your even integer:");
            evenNum = sc.nextInt();
            if (evenNum % 2 == 0){
                isNumGood = true;
            } else {
                System.out.println("Number must be an even integer.");
            }
            if (evenNum > 3){
                isNumGood = true;
            } else {
                System.out.println("Number must be greater than 3.");
            }
        }


    }

    private int[] findPrimes(int ){

    }
}
