package com.company;

import java.util.ArrayList;

public class PrimeFinder {

    public static ArrayList<Integer> primeFinder(int howMany){
        ArrayList<Integer> primes = new ArrayList<>();
        boolean isPrime = true;
        int possiblePrime = 3;

        while (primes.size() < howMany){
            if (primes.size() == 0){
                primes.add(1);
                System.out.println(primes.get(0));
                primes.add(2);
                System.out.println(primes.get(1));
            } else {
                for (int iter = 2; iter < possiblePrime; iter++){
                    if (possiblePrime % iter == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    primes.add(possiblePrime);
                    System.out.println(primes.get(primes.size()-1));
                }
                isPrime = true;
                possiblePrime++;
            }
        }

        return primes;
    }
}
