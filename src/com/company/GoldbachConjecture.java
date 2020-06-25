package com.company;

import java.util.ArrayList;
import java.util.Scanner;



public class GoldbachConjecture {
    public void goldbachConjecture() {

        System.out.println("Goldbach's conjecture states that every even integer greater than 2 can be expressed as the sum of two primes.");
        System.out.println("This program writes out all pairs of primes that sum to any given even integer");

        Scanner sc = new Scanner(System.in);
        int evenNum = 0;
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

        System.out.println("All pairs of prime numbers that sum to " + evenNum);

        ArrayList<Integer> primes = findPrimes(evenNum);
        for (int iter = 0 ; iter < primes.size() ; iter++){
            for ( int pairIter = iter ; pairIter < primes.size() ; pairIter++){
                if (  primes.get(iter) + primes.get(pairIter) == evenNum ){
                    System.out.println(primes.get(iter) + " + " + primes.get(pairIter) + " = " + evenNum);
                }
            }
        }

    }

    private ArrayList<Integer>  findPrimes(int num){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int iter = 1; iter <= num ; iter++){
            if (isPrime(iter)){
                primes.add(iter);
            }
        }

        return primes;
    }

    private boolean isPrime(int num){
        boolean isPrime = false;
        for (int iter = 1 ; iter < num ; iter++) {
            if (num % iter == 0){
                isPrime = false;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
